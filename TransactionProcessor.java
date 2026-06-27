import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransactionProcessor {
    public static Map<String, Double> getUSDTotalsByCategory(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> "USD".equalsIgnoreCase(t.currency()))
                .collect(Collectors.groupingBy(
                        Transaction::category,
                        Collectors.summingDouble(Transaction::amount)
                ));
    }

    public static void main(String[] args) {
        List<Transaction> list = List.of(
                new Transaction("Electronics", 100.0, "USD"),
                new Transaction("Electronics", 50.0, "USD"),
                new Transaction("Groceries", 30.0, "EUR"),  // Should be ignored
                new Transaction("Groceries", 20.0, "USD")
        );

        Map<String, Double> totals = getUSDTotalsByCategory(list);
        System.out.println(totals); // Output: {Electronics=150.0, Groceries=20.0}
    }
}