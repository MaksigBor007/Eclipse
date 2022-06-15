package com.syntax.HomeWork;

public class StringHW7 {

	String prime(int a) {
		String str="prime";
		if (a<=1) {
			str="not prime";
			return str;
		}else {
			for (int i=0;i<=a/2;i++) { 
			if(a%i==0) {
			str="not prime";
	          break;
		    }
			}
		 return str;
		}		
}
	public static void main(String[] args) {
		StringHW7 shw7=new StringHW7();
		System.out.println(shw7.prime(21));

}
}
