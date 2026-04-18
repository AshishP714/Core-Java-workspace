package com.practice5feb;

public class FamilyHealthPlan extends HealthInsurance {
	public int numberFamilyMembers;
	public String familyDoctorName;

	FamilyHealthPlan(String policyNumber, String policyHolderName, double coverageAmount, int numberFamilyMembers,
			String familyDoctorName) {
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.coverageAmount = coverageAmount;
		this.numberFamilyMembers = numberFamilyMembers;
		this.familyDoctorName = familyDoctorName;

	}

	public void display() {
		System.out.println("Policy Number is " + policyNumber);
		System.out.println("Policy holder name is " + policyHolderName);
		System.out.println("Coverage amount is " + coverageAmount);
		System.out.println("Number of family members is " + numberFamilyMembers);
		System.out.println("Family doctor name is " + familyDoctorName);
	}
}
