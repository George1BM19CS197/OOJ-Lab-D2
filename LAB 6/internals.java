package CIE;
import java.util.*;
public class internals
{
	public double cie[];
	
	public void accept()
	{
		cie= new double[5];
		Scanner ss = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("CIE mark for subject "+(i+1)+" : ");
			cie[i]= ss.nextDouble();
		}
	}
	
	
	
}