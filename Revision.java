
public class Revision {

	private String name, email, address;
	private long phone, pnr;

	public Revision(int a, int b) {
		if (a == b) {
			System.out.println("Hii.. Ashish");
		} else {
			System.out.println("Hello.. Nikhil");
		}
	}
	
	public Revision(String name, int age) {
		System.out.println("Name of candidate : " + name);
		System.out.println("Age of candidate : " + age);
	}
	
	public Revision() {
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address=address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone=phone;
	}

	public long getPnr() {
		return pnr;
	}

	public void setPnr(long pnr) {
		this.pnr = pnr;
	}
	
}
