public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(103, "Ashish"));
        list.add(new Student(101, "Amit"));

        Collections.sort(list, new NameComparator());

        Collections.sort(list, new IdComparator());
    }
}
