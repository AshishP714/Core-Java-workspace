public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(103, "Rahul"));
        list.add(new Student(101, "Amit"));

        // Name ke hisab se sort karna ho toh:
        Collections.sort(list, new NameComparator());

        // Id ke hisab se sort karna ho toh:
        Collections.sort(list, new IdComparator());
    }
}
