package Basic;
import java.util.Scanner;


public class Compare {

	public static void main(String[] args) {
		
		int num1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number : ");
		num1 = s.nextInt();
		
		int num2;
		Scanner t = new Scanner(System.in);
		System.out.println("Enter second number : ");
		num2 = t.nextInt();
		
		int res;
		
		res = num1> num2  ? num1 : num2;
		System.out.println("Greater number is : "+ res);
		
		
		
		// TODO Auto-generated method stub

	}

}
