package com.syntax.HomeWork;

public class StringHW4 {
/*Create a method that will say Hello in different language 
 * based on the country that will passed when method is executed
 */
	
	
	void hello (String hi) {
		if (hi.equalsIgnoreCase("russian")) {
			System.out.println("Привет");
		} else if(hi.equalsIgnoreCase("franch")){
			System.out.println("Bonjour");
		}else if(hi.equalsIgnoreCase("turkish")) {
			System.out.println("Merhaba");
		} 
		 
		}

	public static void main(String[] args) {
		StringHW4 shw4=new StringHW4();
		shw4.hello("russian");
		shw4.hello("franch");
		shw4.hello("turkish");
	}

}
