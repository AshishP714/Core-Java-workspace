import java.io.Serializable;

public class Emplyoee implements Serializable {
	int empId;
	String empName;
	String empCity;

	public Emplyoee(int empId, String empName, String empCity) {
		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;

	}

}
