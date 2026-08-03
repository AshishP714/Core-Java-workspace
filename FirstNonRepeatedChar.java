import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

    public static Character findFirstNonRepeated(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }

        Map<Character, Integer> counts = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null; // Return null if all characters are repeated
    }

    public static void main(String[] args) {
        String input = "swiss";
        Character result = findFirstNonRepeated(input);

        if (result != null) {
            System.out.println("First non-repeated character in '" + input + "' is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}
