package entities;

public class product02 {
	
	public String name;
	public int salary;
	public int tax;
	public int percentage;
	
	public int liquid() {
		return salary - tax;
	}
	
	public int updated() {
		return salary + (salary * percentage / 100) - tax;
	}
}
