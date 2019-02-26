//Zachary Bruggeman
//Main class used to test Calculator.java, not a part of assignment submission.

package cse360assign2;

public class Main {

	public static void main(String[] args) {
		
		Calculator myCalculator = new Calculator(); 
		
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.multiply(2);
		myCalculator.add(5);
		myCalculator.divide(0);
		myCalculator.add(10);
		myCalculator.divide(2);
		
		System.out.println(myCalculator.getTotal());
		System.out.println(myCalculator.getHistory());
	}
}
