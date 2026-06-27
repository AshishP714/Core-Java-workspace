import java.util.concurrent.atomic.AtomicLong;

public class TokenBucketLimiter {
    private final long maxCapacity;
    private final long refillRatePerMs; // tokens per millisecond
    
    private final AtomicLong availableTokens;
    private final AtomicLong lastRefillTimestamp;

    public TokenBucketLimiter(long maxCapacity, long tokensPerSecond) {
        this.maxCapacity = maxCapacity;
        this.refillRatePerMs = tokensPerSecond / 1000;
        this.availableTokens = new AtomicLong(maxCapacity);
        this.lastRefillTimestamp = new AtomicLong(System.currentTimeMillis());
    }

    public boolean allowRequest() {
        refill();
        
        // Atomically decrement a token if available
        while (true) {
            long currentTokens = availableTokens.get();
            if (currentTokens <= 0) {
                return false; // Throttled!
            }
            if (availableTokens.compareAndSet(currentTokens, currentTokens - 1)) {
                return true;
            }
        }
    }

    private void refill() {
        long now = System.currentTimeMillis();
        long lastRefill = lastRefillTimestamp.get();
        long elapsedMs = now - lastRefill;

        if (elapsedMs > 0) {
            long tokensToAdd = elapsedMs * refillRatePerMs;
            if (tokensToAdd > 0) {
                // Try to update the timestamp safely
                if (lastRefillTimestamp.compareAndSet(lastRefill, now)) {
                    availableTokens.updateAndGet(tokens -> 
                        Math.min(maxCapacity, tokens + tokensToAdd)
                    );
                }
            }
        }
    }
}