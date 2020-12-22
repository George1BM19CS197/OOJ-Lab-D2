import java.util.*;
import java.lang.*;

class OddSum implements Runnable {
	int sum=0;
	String s;
	Thread t;
	OddSum(String s) {
		this.s = s;
		t = new Thread(this, s);
		System.out.println(s + "Thread Created.");
		t.start();
	}

	public void run() {
		for(int i = 0; i < 100; i++){
			if(i%2 != 0)
				sum += i;
		}
		System.out.println("Sum of Odd numbers: " + sum);
	}
}

class LAB10 { 
	public static void main(String[] args) {
		int s = 0;
		new OddSum("Odd");
		Thread t1 = Thread.currentThread();
		System.out.println("Main Thread Active");
		for (int i = 0; i < 100; i++) {
			if(i%2 == 0) {
				s += i;
			}
		}
		System.out.println("Sum of all Even numbers: " + s);
	}
}