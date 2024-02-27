import java.util.Scanner;
public class pgm2
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		{
			int a,b,sum;
			System.out.println("Enter First No.");
			a=in.nextInt();
			System.out.println("Enter Second No.");
			b=in.nextInt();
			sum=a+b;
			System.out.println("The sum is " +sum);
		}
	}
}