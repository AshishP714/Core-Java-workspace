package CollectionFramewor;

public class String_Practice {

	public static void main(String[] args) {

		String s1 = "Chintamani";
		String updated = "";
		String updated2 = "";

		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (i % 2 == 0) {
				updated = updated + ch;
			} else {
				updated2 = updated2 + ch;
			}
		}

		System.out.println(updated);
		System.out.println(updated2);
	}
}