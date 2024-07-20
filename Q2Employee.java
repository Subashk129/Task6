package Task6;

public class Q2Employee {
	//private attributes
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	// constructor with arguments
	public Q2Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	//getter and setter method
	public int getid() {
		return id;
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public int getSalary() {
		return salary;
	}

	//Raising Salary by Percentage
	public void raisedSalary(double percent) {
		double increase = salary * (percent/100);
		salary += increase;
	}
	//Employee Details
	public void printEmployeeDetails() {

		System.out.println("Emp Id: "+ id);
		System.out.println("Emp Name:" + firstName);
		System.out.println("Emp LastName:" + lastName);
		System.out.println("Emp Salary: "+ salary);

	}
	public static void main(String[] args) {

		//1st Employee details:
		Q2Employee emp = new Q2Employee(7, "Dhoni", "MS", 15000);
		System.out.println("Employee Details: ");
		emp.printEmployeeDetails();
		System.out.println("\nAfter raising employee salary:" );
		emp.raisedSalary(5);
		emp.printEmployeeDetails();
		System.out.println("========================");
		// 2nd Employee details:
		Q2Employee emp2 = new Q2Employee(12, "subash", "KS", 5000);
		System.out.println("Employee2 Details: ");
		emp2.printEmployeeDetails();
		System.out.println("\nAfter raising employee salary:" );
		emp2.raisedSalary(10);
		emp2.printEmployeeDetails();
	}

}
