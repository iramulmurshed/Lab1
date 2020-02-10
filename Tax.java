
package tax;

import java.util.Scanner;

public class Tax {

    
    public static void main(String[] args) {
        // TODO code application logic here
        double amount, tax;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter money");
		amount = in.nextInt();
	
		tax = amount * .15;
		
		System.out.println("Tax is : " + tax);
    }
    
}
