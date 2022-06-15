package com.syntax.class09;

public class MoreNestedLoops{ 
public static void main (String[] args) {
	
	//clock
	
	for(int h=0;h<=2;h++) {
		
		for(int h1=0;h1<=9;h1++) {
			if(h==2 && h1==4) {
				
				break;
			}
			
			for(int h2=0;h2<=5;h2++) {
				
				for(int h3=0;h3<=9;h3++) {
					 if(h2>=9) {
						 continue;
					 }
				   System.out.print(h);
					System.out.print(h1+" ");
					System.out.print(":");
					System.out.print(h2);
					System.out.println(h3);
	
}
}
	
}
	
}
	System.out.println("----------------------------");
	
	//another way for clock
	
	
	for (int hrs = 0; hrs < 24; hrs++) {
		
		for (int min =0; min < 60; min++) {
			String time;
			if (hrs<10 && min<10) {
				time="0"+hrs+":"+"0"+min;
			}else if(hrs<10 &&min>=10) {
				time="0"+hrs+":"+min;
			}else if(hrs>=10 && min<10) {
				time=hrs+":"+min;
			}else {
				time=hrs+":"+min;
			}
				
			
			System.out.println(time);
			
		}
	}
System.out.println("------------------------------------");
// another way
	
	
	for (int a=0;a<=2; a++) {
	
	for (int b=0; b<=9;b++) {
		if(a==2 && b==4) {
			break;
		}
		for (int c=0; c<=5; c++) {
			
			for (int d=0; d<=9; d++) {
				System.out.println(a+""+b+":"+c+d);
			}
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	}






}


}
