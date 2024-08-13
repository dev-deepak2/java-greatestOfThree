// Heres the code

import java.util.Scanner;

public class Gretest_of_Three {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter term 1 :");
		int n1=s.nextInt();
		System.out.println("enter term 2:");
		int n2=s.nextInt();
		System.out.println("enter term 3:");
		int n3=s.nextInt();
		
        //Here I used ternary operator
		int greatest= n1>=n2 ? ((n1>n3) ? n1:n3 ) : ((n2>=n3) ? n2:n3);

		System.out.println("The greatest number of the three is " +greatest);

	}

}