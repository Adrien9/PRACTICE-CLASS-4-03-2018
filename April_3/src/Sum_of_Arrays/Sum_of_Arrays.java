package Sum_of_Arrays;

public class Sum_of_Arrays {

	public static void main(String[]args){


		int[]num={1,2,3,4,5};

		int[]num2={6,7,8,9,10};


		int[] totalsum=new int[5];


		for(int i=0; i<num.length; i++){

			totalsum[i]=num[i]+num2[i];

			System.out.println(totalsum[i]);

		}
	}
}