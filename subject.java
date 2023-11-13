package  marks;
import java.util.Scanner;
public class subject{

public static void main (String args[])
	{
		int i,total=0,avg,n;
		int sub[]=new int[20];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of subjects:");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("Enter the  subject "+i+" mark:");
			sub[i]=s.nextInt();
		}
		for(i=1;i<=n;i++)
		{
		 total=total+sub[i];
		}
		System.out.println("The total is:"+total);
		avg=total/n;
		System.out.println("Average is:"+avg);
		if(avg>90)
		{
			System.out.println("Grade:S");
		}
		else if((avg>80)&&(avg<=90))
		{
			System.out.println("Grade:A");
		}
		else if((avg>70)&&(avg<=80))
		{
			System.out.println("Grade:B");
		}
		else if((avg>60)&&(avg<=70))
		{
			System.out.println("Grade:C");
		}
		else if((avg>50)&&(avg<=60))
		{
			System.out.println("Grade:D");
		}
		else
		{
			System.out.println("Grade:E");
		}
		
		
	}

}
