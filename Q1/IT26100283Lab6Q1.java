import java.util.Scanner;

public class IT26100283Lab6Q1{
	public static void main(String[] args){
		
		double number;
		double number_squared;
		double number_sqrt;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		number = input.nextDouble();
		
		number_squared = number*number;
		number_sqrt = Math.sqrt(number);
		
		System.out.println("The square of "+number + " is : "+number_squared);
		System.out.println("The squareroot of "+number + " is : "+number_sqrt);	
	}
}