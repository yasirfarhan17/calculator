package calculator;
import java.util.*;
public class calculator {
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			int a,b,choice;
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Enter 1 for add or 2 for subtract or 3 for multiple or 4 for divide");
			choice=sc.nextInt();
			calculator ob=new calculator();
			if(choice==1)
			System.out.println(ob.add(a,b));
			if(choice==2)
			System.out.println(ob.sub(a,b));
			if(choice == 3)
			System.out.println(ob.mul(a,b));
			if(choice ==4)
			System.out.println(ob.div(a,b));
			sc.close();
		}
		
		public int add(int a,int b) {
			return (a+b);
		}
		public int sub(int a,int b) {
		 return (a-b);
		}
		public int mul(int a,int b) {
			return (a*b);
		}
		public int div(int a,int b) {
			return (a/b);
		}

	}
