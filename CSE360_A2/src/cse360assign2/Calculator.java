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
 *@version 3.00, 24 Feb 2019
 */

package cse360assign2;

/**
 *This class defines two private variables - total and history, as well as 
 *several fundamental methods needed for a calculator to function. The class
 *is included in the cse360assgin2 package. It declares a private variable
 *'total', used to hold the changing total value of the calculator. It declares
 *another private variable 'history', used to build a String of history as
 *the various methods are called.
 *
 *@author  Zachary Bruggeman
 *@version 3.00, 24 Feb 2019
 */
public class Calculator {

	private int total;
	private String history;
	
   /**
    *Class constructor which initializes 'total' at 0 and 'history' as
    *an empty String. 
    */	
	public Calculator () {
		total = 0; // not needed - included for clarity
		history = "0";
	}
	
	
   /**
    *Returns the total, essentially the "answer" of the calculator. 
    *
    *@return the integer variable 'total'
    */	
	public int getTotal () {
		return total;
	}

	
   /**
    *Adds the specified value to the calculator's total. Takes a parameter 
    *int variable 'value' and adds it to total. Then updates the 'history'
    *variable by adding " + [value]" to the end of the String.
    *
    *@param value an integer given by the user to be added to the total
    */	
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}

	
   /**
    *Subtracts the specified value from the calculator's total. Takes a 
    *parameter int variable 'value' and subtracts it from total. Then updates
    *the 'history' variable by adding " - [value]" to the end of the String.
    *
    *@param value an integer given by the user to be subtracted from the total
    */	
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	
   /**
    *Multiplies the specified value by the calculator's total. Takes a 
    *parameter int variable 'value' and multiplies it with total. Then updates
    *the 'history' variable by adding " * [value]" to the end of the String.
    *
    *@param value an integer given by the user to be multiplied by the total
    */	
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;
	}
	
	
   /**
    *Divides the calculator's total by the specified value. If 'value' is 0,
    *then 'total' is made 0 and 'history' is updated by adding " / 0" to the 
    *end of the String. Otherwise, it takes a parameter int variable 'value' 
    *and divides total by it while also updating 'history' by adding
    *" / [value]" to the end of the String.
    *
    *@param value an integer given by the user to divide the total by
    */	
	public void divide (int value) {
		if(value == 0) {
			total = 0;
			history = history + " / " + value;
		}
		else {
			total = total / value;
			history = history + " / " + value;
		}
	}
	
	
   /**
    *Returns a string of past calculator operations. This is done by simply
    *returning the 'history' variable, which is a String that has been 
    *updating every time a calculator operation method is called.
    *
    *@return the 'history' variable, a string of past commands
    */	
	public String getHistory () {
		return history;
	}
	
}