public class IT26100283Lab6Q2A{
	public static void main(String[] args){
		int count, sum;
		count = 1;
		sum = 0;
		while (count <= 10) {
			System.out.print(+count +" ");
			sum = sum + count;
			count = count + 1;
		}
		System.out.println("Total is : "+sum);
	}
}