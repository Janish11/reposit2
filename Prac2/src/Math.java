import java.util.*;
public class Math{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		System.out.println("Enter any number");
		Scanner reader = new Scanner(System.in); 
		int num = reader.nextInt();
		if((num%2!=0)&&(num>=100))
		{
		System.out.println("Success!!!");
		}
		else if((num%2==0)&&(num<=100)) {
			System.out.println("Even!!!");
		}
		else 
			System.out.println("Failure");
		reader.close();
	}

}
