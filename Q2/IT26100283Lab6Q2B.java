import java.util.Scanner;

public class IT26100283Lab6Q2B{
	public static void main(String[] args){
		int count, number;
		count = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 10 numbers:");
		while (count <= 10) {
			System.out.print("Enter number "+count + ": ");
			number = input.nextInt();
			count = count + 1;
		}
	}
}