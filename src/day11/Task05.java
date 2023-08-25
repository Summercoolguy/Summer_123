package day11;

public class Task05 {
    public static void main(String[] args) {
		int sum=0;
    	for(int i=1;i<=100;i++) {
    	sum+=i;
    		
    	}
    	System.out.println(sum);
    	
    	
    	
    	 for (int i = 1 ; i < 101 ; i++) {
             //System.out.println(i);
             
             if (i != 100) {
                 System.out.print(i +" + ");
             }else {
                 System.out.print(i +" = " + sum);
             }
             
         }
	}
	
 
	
	
	
	
	
	
}
