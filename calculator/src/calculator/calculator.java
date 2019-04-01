package calculator;
import java.util.*;
public class calculator {
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			int a,b;char choice;
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Enter + for add or - for subtract or * for multiple or / for divide");
			choice=sc.next().charAt(0);
			if(choice=='+') {
				System.out.println(a+b);
			}
			if(choice=='-') {
				System.out.println(a-b);
			}
			if(choice=='*') {
				System.out.println(a*b);
				
			}
			if(choice=='/')
				System.out.println(a/b);
			sc.close();
		}

	}
