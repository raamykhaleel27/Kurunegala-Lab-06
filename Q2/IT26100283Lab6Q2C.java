import java.util.Scanner;

public class IT26100283Lab6Q2C{
	public static void main(String[] args){
		int count, sum, number;
		double average;
		count = 1;
		sum = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 10 numbers:");
		while (count <= 10) {
			System.out.print("Enter number "+count + ": ");
			number = input.nextInt();
			sum = sum + number;
			count = count + 1;
		}
		System.out.println("");
		
		System.out.println("Sum of the numbers : "+sum);
		average = (sum/count);
		
		System.out.println("Average of the numbers : "+average);
	}
}