import java.util.Scanner;

public class Przedzial_domkniety
{
	static Scanner scanner = new Scanner(System.in);	
	public static void main(String[] args) 
	{
		System.out.println("Podaj a:	" );
		int a = scanner.nextInt();
		System.out.println("Podaj b:	" );
		int b = scanner.nextInt();
		for(int i = a ;i <= b ;i++ )
		{ 
			
			System.out.print(i + ", ");
		
			
		}
	}

}
