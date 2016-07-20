# Oddnos
import java.util.Scanner;
public class Odd {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start interval : ");
		int a1=sc.nextInt();
		System.out.println("Enter the end interval : ");
		int a2=sc.nextInt();
		for(int i=a1;i<=a2;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
				
			}
		}
		

	}

}
