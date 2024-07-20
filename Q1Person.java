package Task6;

public class Q1Person {

	String name;
	int age;
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setValues(String name, int age) {
		this.name= name;
		this.age= age;
		
	}

	public static void main(String[] args) {
		
		Q1Person pr = new Q1Person();
		pr.setValues("subash", 28);
		
		System.out.println("Person Name is: "+pr.getName());
		System.out.println("Person Age is: "+pr.getAge());
		
	}

}
