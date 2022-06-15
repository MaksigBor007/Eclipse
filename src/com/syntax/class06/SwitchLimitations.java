package com.syntax.class06;

public class SwitchLimitations {

	public static void main(String[] args) {
		/*
		 * switch can work with byte, short,int,char,String
		 * 
		 * switch has a datatype limitation
		 * 
		 * switch cannot work with double,float,long,boolean
		 * 
		 * cannot use relational operators
		 */

		
		
		/*
		 *double price=10;
		 *switch(price) {->:Cannot switch on a value of type double.
		 */
		
		/*
		 *boolean hungry=true;
		 *switch(hungry) //cannot switch on a value of type boolean
		*/
		
		
		/*
		 *char choice='Y'; cannot use logical operators inside switch
		 *String meaning;
		 *switch(choice) {
		 *case'Y' || 'y':
		 *meaning="Yes";
		 *break;}
		 */
	
		
		/*
		 *int day=5;  cannot be used with relational operators
		 *switch(day) {
		  *case >5:}
		  */
		}
}

