package practice;

public class MainClassImmutable {

	public static void main(String[] args) {
		
		Address address = new Address("Pune");
		Employee employee = new Employee("Ashish", 1, address);
		
		System.out.println(employee.getAddress().getCity());
	}
}