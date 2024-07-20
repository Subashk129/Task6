package Task6;

public class Q3circle {

	private  double radius;
	
	// constructor with no Arguments
	public Q3circle() {
		this.radius = 0;
	}
	//constructor with two arguments
	public Q3circle(double radius) {
		this.radius = radius;
	}
	// calculation 
	public double calculateCircumference() {
		return 2 * Math.PI * radius;
	}
	
	public static void main(String[] args) {
		
		Q3circle c1 = new Q3circle();
		System.out.println("circumfrence of circle1: "+c1.calculateCircumference());
		
		Q3circle c2 = new Q3circle(4);
		System.out.println("circumfrence of circle2: "+c2.calculateCircumference());

	}

}
