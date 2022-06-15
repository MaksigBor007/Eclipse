package com.syntax.HomeWork;

public class StringHW5 {
	/*Create a method createEmail(). Based on values of users name, lastName and email type, 
	 * your method should return complete email Address. 
	 * Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com 
	 */
	
	String createEmail(String userName, String lastName, String email) {
	
		return userName+lastName+email;

	}
	
	
	public static void main(String[] args) {
	StringHW5 shw5=new StringHW5();
	System.out.println(shw5.createEmail("maksym","borodai","@gmail.com"));

	}

}
