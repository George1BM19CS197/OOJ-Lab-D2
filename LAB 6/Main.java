import CIE.*;
import SEE.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n= sc.nextInt();
		CIE.internals in[]= new CIE.internals[n];
		SEE.externals en[]= new SEE.externals[n];
		CIE.student gn[]=new CIE.student[n];
		int i,j;
		for(i=0;i<n;i++)
		{
			System.out.println("Student "+(i+1));
			in[i] = new CIE.internals();
			en[i] = new SEE.externals();
			gn[i] = new CIE.student();
			gn[i].getDetails();
			
			
			System.out.println("CIE MARKS:");
			in[i].accept();
			System.out.println("SEE MARKS:");
			en[i].get();
			System.out.println();
			gn[i].display();
			for(j=0;j<5;j++)
			
			System.out.println("Total Marks "+(j+1)+": "+(in[i].cie[j] + (en[i].see[j]/2)));
		}
	}
}