import java.util.*;
import java.lang.*;

class Father {
	int age;
	Scanner ss = new Scanner(System.in);
	Father() throws WrongAge {
		System.out.print("Enter the Father's age::> ");
		age = ss.nextInt();
		if(age < 0){
			throw new WrongAge(age);
		} 
	}
}

class Son extends Father {
	int age;
	Son() throws WrongAge {
		super();
		System.out.print("Enter the Son's age::> ");
		age = ss.nextInt();
		if(age < 0){
			throw new WrongAge(age);
		} 
		if(age > super.age || age == super.age){
			throw new WrongAge(age);
		} 
		System.out.println("Nothing wrong here..");		
	}
}



class LAB8 {
	public static void main(String args[]) {
		try{
			Son so = new Son();	
		}
		catch(WrongAge e){
			System.out.println(e);
		}		
	}
}