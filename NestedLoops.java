package Workspace.Example.Loops;

public class NestedLoops {

	public static void main(String[] args) {
		//Variable Initialization
		String s = "*";
		
		//Example Loop #1
			//Outer Loop
		for(int i = 1; i<=3;i++) 
		{
			System.out.print("Week " + i+": ");
			
			//Inner loop
			for(int j = 1; j<=3;j++) 
				System.out.print(" Day: " + j);
			
			//Punctuation for Console readability
			System.out.println();
		}
		
		//Punctuation for Console readability
		System.out.println();
		
		//Example Loop #2
			//Outer loop
		for(int i = 1; i<=5;i++) 
		
		{		
			//Inner loop
			for(int j = 1; j<=i;j++) 
				System.out.print(s);
			
			//Punctuation for Console readability
			System.out.println();
		}
			
	}

}
