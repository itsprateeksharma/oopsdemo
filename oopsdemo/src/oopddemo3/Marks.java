package oopddemo3;

public class Marks extends Trainee {
	
	private double marks;

	public Marks(String name, String address, int number, double marks) {
		super(name, address, number);
		this.marks = marks;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public double calculateMarks() {
		System.out.println("Calculate marks: ");
		return (marks*2);
	}
	
	
	

}
