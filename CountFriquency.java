class CountFriquency {
   public static void main(String[] args) {
        String str = "ASHISH";
        str = str.toLowerCase();
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int[] counts = new int[26]; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int index = alphabet.indexOf(ch); 
            counts[index]++; 
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                char letter = alphabet.charAt(i);
                System.out.println(letter + ": " + counts[i]);
            }
        }
    }
}
