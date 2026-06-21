public class GameLoop implements Runnable {
    
    private volatile boolean running = true; 

    @Override
    public void run() {
        System.out.println("Loop started on thread: " + Thread.currentThread().getName());
        
        while (running) {
            try {
                System.out.println("Game is updating...");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread was interrupted.");
            }
        }
        System.out.println("Loop stopped safely.");
    }

    public void stop() {
        System.out.println("Stop signal received.");
        this.running = false; 
    }
}
