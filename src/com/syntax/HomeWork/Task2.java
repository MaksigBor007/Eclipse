package com.syntax.HomeWork;


public class Task2 {

	void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }

    int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum = sum + num;
        }
        return sum;
    }
        public static void main (String[] args){
            Task2 arrUt = new Task2();
            arrUt.sumArray(10,20);
            
            

        }

}
		
		
		
		
		
		


	
		


