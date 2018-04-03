package Sum_of_Arrays_Scanner;
import java.util.Scanner;
public class Sum_of_Arrays_Scanner {

	public static void main(String[]args){

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter 5 numbers");

		int[]num={scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt()};

		System.out.println("Enter 5 numbers");

		int[]num2={scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt()};

		
		int[] totalsum=new int[5];


		for(int i=0; i<totalsum.length; i++){

			totalsum[i]=num[i]+num2[i];

			System.out.println(totalsum[i]);

		}
	}
}

