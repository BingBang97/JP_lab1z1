import java.util.Scanner;

public class prime_number {
	
public static int strong (int n)
{
	if (n == 0) 
	      return 1;
	    else 
	      return n * strong(n - 1);
}
	
public static void find_prm(int x)
{
	long sum=0;
	
	System.out.println("Funkcja do wyszukiwania liczb pierwszych uruchomiona!");
	
	for(int i=3;i<x;i++)
	{
		sum+=strong(i-2)-Math.floor(i*(strong(i-2)/i));
	}
	sum=sum-1;
	System.out.println("Ilosc liczb pierwszych dla zadanego prawego zakresu: "+sum);
}


	public static void main(String[] args) {
		int numamount=0;
		int x=0;
		Scanner getinfo= new Scanner(System.in);
		
		System.out.print("Podaj prawy zakres do wyszukania liczb pierwszych: ");
		numamount=getinfo.nextInt();
		
		if(numamount>2)
		{x++;}
		
		do{
		if(numamount>2 && x==1)
		{
		find_prm(numamount);
		x++;
		}
		else
		{
			System.out.print("Podaj prawy zakres do wyszukania liczb pierwszych: ");
			numamount=getinfo.nextInt();
		}
		}
		while(x<1);
		
	}

}
