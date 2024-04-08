package Workspace.Example.Arrays;

public class Arrays {

	public static void main(String[] args) {
		//Variable Initialization
		String[] alpha = {"Alpha", "Beta", "Charlie"};
		int[] 	 num   = {1,2,3,4,5};
		
		//Print of individual elements of string array
		System.out.println(alpha[0]);
		System.out.println(alpha[1]);
		System.out.println(alpha[2]);
		//Loop to iterate through each element
		for (int i = 0; i <= 2; i++) {
            System.out.print(alpha[i] + " ");
        }
		//Punctuation for console readability
		System.out.println();
		
		//Print of individual elements of integer array
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		//Loop to iterate through each element
		for (int i = 0; i <= 4; i++) {
            System.out.print(num[i] + " ");
        }
		
	}

}
