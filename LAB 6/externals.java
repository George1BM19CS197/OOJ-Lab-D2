package SEE;
import java.util.*;
import CIE.*;
public class externals extends student
{
	public double see[];
	
	public void get()
	{
		see= new double[5];
		Scanner in = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("SEE mark for subject "+(i+1)+" : ");
			see[i]= in.nextDouble();
		}
	}
	
	
}