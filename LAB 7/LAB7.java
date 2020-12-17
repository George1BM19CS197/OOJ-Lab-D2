import java.util.*;
import java.lang.*;

class gen<A, B>{
	
	A ob1;
	B ob2;

	gen(A x, B y){
		
		ob1 = x;
		ob2 = y;
		
	}

	void showTypes(){

		System.out.println("Type of A is::>" + ob1.getClass().getName());
		System.out.println("Type of B is::>" + ob2.getClass().getName());

	}

	A getob1(){
		
		return ob1;
	
	}

	B getob2(){
		
		return ob2;
	
	}
	
}

class Generics{
	public static void main(String[]args){
	
		gen<Integer, String>obtObj = 
		new gen<Integer, String>(45, "Generics");
		
		obtObj.showTypes();

		int a = obtObj.getob1();
		System.out.println("value::>" + a);
		String b = obtObj.getob2();
		System.out.println("value::>" + b);
			
	}
}