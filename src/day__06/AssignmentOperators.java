package day__06;

public class AssignmentOperators {

	public static void main(String[] args) {
		
 // = , += , -= , *= , /=
        
        int a = 5;
        
        a = a + 5;
        
        System.out.println(a); // 10
        
//        a += 5; //
        a = a + 5; 
        
        System.out.println(a); //15
        a += 5;
        a += 5;
        a += 5;
        System.out.println(a);
        
        a++;
        System.out.println(a); // 31
        
        a-=2; // a = a -2;
        
        System.out.println(a); // 29
        
        a -= 19;
        
        System.out.println(a);
        
        
        a *= 10; // a = a *10
        
        System.out.println(a); // 100
        
        a /= 10; // a = a / 10;
        
        System.out.println(a);
        
        
        // 
        
        
        int num = 90;
        
    
        int summerIsMyFirstDigit = num / 10;
        
        System.out.println(summerIsMyFirstDigit);
        
        
        int lastDigit = num%10;
        System.out.println(lastDigit);
        
        
        int num2 = 19;
//        output = 52
        
//        Write a program to reverse user input using arithmetic operator
        
        int firstDigit = num2/10;
        
        System.out.println(firstDigit);
        
        lastDigit = num2%10;
        System.out.println(lastDigit);
        
        //System.out.println(lastDigit +""+ firstDigit);
        
        int reverse = lastDigit*10 + firstDigit;
        
        System.out.println(reverse);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}
	{
	}

}
