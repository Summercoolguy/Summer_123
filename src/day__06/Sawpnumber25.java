package day__06;

public class Sawpnumber25 {
     public static void main(String args[]) {
    	 
    	 int myNumber = 25;
         int firstDigit = myNumber / 10;
         int lastDigit = myNumber % 10;
         System.out.println("Original number is: " + myNumber);
         System.out.println("First digit is: " + firstDigit);
         System.out.println("Second digit is: " + lastDigit);

         int swapDigit = (firstDigit) + (lastDigit * 10);
         System.out.println("Swap digit is: " + swapDigit);
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
}
