import java.util.Scanner;
public class Evenodd1 {
	void evenodd1()
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num=reader.nextInt();
		
		if (num%2==0)
			System.out.println("number is even ");
		else
			System.out.println("number is odd ");
		
	}


	
	 
	public static void main(String[] args) {
		Evenodd1 e = new Evenodd1();
		e.evenodd1();
		
		
		// TODO Auto-generated method stub

	}

}
