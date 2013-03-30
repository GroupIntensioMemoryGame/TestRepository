import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



public class main {
	public static void main(String[] args) {
		int end = 0;
		Scanner input = new Scanner(System.in);
		ArrayList prime = new ArrayList();
		while(true)
		{
			System.out.println("How many numbers?");
			try
			{
				end = Integer.parseInt(input.next());
				break;
			}
			catch(NumberFormatException e)
			{
				System.out.println("\nPlease enter a number");
			}
		}//While
		
		int primeCount = 2;
		int size = 1;
		boolean loop = true;
		prime.add(primeCount);
		if(end > 0)
		{
			System.out.println(primeCount);
		}
		while(size < end)
		{
			loop = true;
			primeCount++;
			for(int j = 0; j < size; j++)
			{
				if(primeCount%(int)prime.get(j) == 0)
				{
					loop = false;
					break;
				}
			}
			if(loop)
			{
				size++;
				prime.add(primePrimeCount);
				System.out.println(primeCount);
			}
		}
	}

}
