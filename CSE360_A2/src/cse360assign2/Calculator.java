/**
 *Author Name: Zachary Bruggeman
 *<p>
 *Class ID: 337
 *<p>
 *Assignment #: 2
 *<p>
 *This file contains the Calculator class. It is meant to be used whenever
 *any Calculator methods need to be called in the main method.
 *
 *@author  Zachary Bruggeman
 *@version 1.00, 24 Feb 2019
 */

package cse360assign2;

/**
 *This class defines a private variable total, as well as several fundamental
 *methods needed for a calculator to function. The class is included in the
 *cse360assgin2 package. It declares a private variable total used to hold
 *the changing total value of the calculator.
 *
 *@author  Zachary Bruggeman
 *@version 2.00, 24 Feb 2019
 */
public class Calculator {

	private int total;
	
   /**
    *Class constructor which initializes the total at 0. 
    */	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
   /**
    *Returns the total of the calculator. 
    *
    *@return the integer variable total
    */	
	public int getTotal () {
		return total;
	}

	
   /**
    *Adds the specified value to the calculator's total. Takes a parameter 
    *int variable value and adds it to total.
    *
    *@param value an integer given by the user
    */	
	public void add (int value) {
		total = total + value;
	}

	
   /**
    *Subtracts the specified value from the calculator's total. Takes a 
    *parameter int variable value and subtracts it from total.
    *
    *@param value an integer given by the user
    */	
	public void subtract (int value) {
		total = total - value;
	}
	
	
   /**
    *Multiplies the specified value by the calculator's total. Takes a 
    *parameter int variable value and multiplies it with total.
    *
    *@param value an integer given by the user
    */	
	public void multiply (int value) {
		total = total * value;
	}
	
	
   /**
    *Divides the calculator's total by the specified value. Takes a parameter 
    *int variable value and divides total by it.
    *
    *@param value an integer given by the user
    */	
	public void divide (int value) {
		if(value == 0) {
			total = 0;
		}
		else {
			total = total / value;
		}
	}
	
	
   /**
    *Returns a string of past calculator operations. 
    *
    *@return a string of past commands
    */	
	public String getHistory () {
		return "";
	}
}