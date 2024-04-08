package Workspace.Example.Loops;

public class Loops {

	public static void main(String[] args) {
		//Variable Initialization
		int i = 0;
		
		//Example of a While Loop
		System.out.println("While Loop: ");
		while(i<=10)
		{
			//Example of an if/else statement
			if(i == 10)
				System.out.print(i);
			else
			System.out.print(i + ", ");
			i++;
		}
		//Punctuation for Console readability
		System.out.println();
		
		//Example of a For Loop
		System.out.println("For Loop: ");
		for(int j = 0;j <= 10; j++)
		{
			//Example of an if/else statement
			if(j == 10)
				System.out.print(j);
			else
			System.out.print(j + ", ");
		}

		
	}

}
