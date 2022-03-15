package Basic;
import java.util.Scanner;
public class CheckNum {

   public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
	
		System.out.println("Enter your number :");
		num = s.nextInt();
		
		String r=num<0 ? "your number is negative" : "your number is positive";
		System.out.println(r);
		// TODO Auto-generated method stub

	}

}
