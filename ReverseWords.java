public class ReverseWords {

    public static void main(String[] args) {
        String str = "I love My Country";

        String word = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                System.out.print(word + " ");
                word = "";
            } else {
                word = str.charAt(i) + word;
            }
        }

        System.out.print(word);
    }
}
