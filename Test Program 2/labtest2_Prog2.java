import java.util.*;
import java.lang.*;

class Company {
	Scanner s = new Scanner(System.in);
	int yoj;
	Company() throws wrongyear{
		System.out.println("Enter year of joining: ");
		yoj = s.nextInt();
		if (yoj < 2005) {
			throw new wrongyear("Year of joining is before 2005 -- ", yoj);
		}
		else{
			System.out.println("The year of joining is::> " + yoj);
		}
	}
}

class Employee extends Company {
	Scanner s = new Scanner(System.in);
	int age;
	public Employee() throws wrongyear {
		System.out.println("Enter your age: ");
		age = s.nextInt();
		if (age<18) {
			throw new wrongyear("Age cannot be less than 18", age);
		}
		else if(age>60){
			throw new wrongyear("Age cannot be greater than 60", age);
		}
		else{
			System.out.println("The age is::> " + age);
		}
	}
}

class wrongyear extends Exception {
	String s;
	int n;
	wrongyear(String s, int n) {
		this.s = s;
		this.n = n;
		System.out.println("INVALID VALUE!!!" + s);
		System.out.println("");
	}
}

class labtest2_Prog2 {
	public static void main(String[] args) {
		try{
			Employee e = new Employee();
		} catch(wrongyear n){
		}
	}
}