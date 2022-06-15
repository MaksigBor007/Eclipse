package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		
		/*Tuesday and Wednesday --> Manual Testing
		 * Thursday --->Review
		 * Satarday and Sunday -->Java
		 */

		
		String day="Sunday";
		if (day.equals("Monday")||day.equals("Friday")) {
			
			System.out.println("I have no class");
		}else if(day.equals("Tuesaday") || day.equals("Wednesday")) {
			
			System.out.println("I have manual testing");
		}else if(day.equals("Thursday")) {
			
			System.out.println("I have review class");
		}else if(day.equals("Saturdau")|| day.equals("Sunday")) {
			
			System.out.println("I have Java class");
		}
	}

}
