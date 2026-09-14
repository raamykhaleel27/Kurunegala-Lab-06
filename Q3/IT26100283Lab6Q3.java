import java.util.Scanner;

public class IT26100283Lab6Q3{
	public static void main(String[] args){
		
		int number, number_squared, N, total_of_squares;
		double root_mean_square;
		
		total_of_squares = 0;
		N = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter positive integers (terminate input with -99)");
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		while (number != -99){
			
			number_squared = number*number;
			
			if (number < 0) {
				System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
			}
				else { total_of_squares = total_of_squares + number_squared;
				       N = N + 1;
				}
			System.out.print("Enter a number: ");
			number = input.nextInt();
		}
		
		root_mean_square = Math.sqrt(total_of_squares/N);
		System.out.println("");
		System.out.println("The Root Mean Square (RMS) is: "+root_mean_square);
	}
}