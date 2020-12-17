package CIE;
import java.util.*;
public class student
{
	public String name;
	public int sem;
	public String usn;
	
	public void getDetails()
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the name");
		name = ss.next();
		System.out.println("Enter the semester");
		sem = ss.nextInt();
		System.out.println("Enter the USN:");
		usn = ss.next();
	}
	public void display()
	{
		System.out.println("Student details: ");
		System.out.println("Name: "+ name);
		System.out.println("USN: "+ usn);
		System.out.println("Semester: "+ sem);
	}
		
	
}