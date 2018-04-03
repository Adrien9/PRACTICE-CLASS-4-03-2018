package TwoD_Array;
import java.util.Scanner;
public class TwoD_Array {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		int num[][]={{50,60,55,67,70},{62,65,70,70,81}};

		int[] totalsum=new int[5];

		for(int i=0; i<totalsum.length; i++){

			System.out.println(num[0][i]+num[1][i]);
		
		}
	}
}
