import java.util.*;
import java.lang.*;

class First implements Runnable{
	int rand;
	Thread f;
	First() {
		f = new Thread(this, "First");
		System.out.println("First Thread created.");
		f.start();
	}

	public void run() {
		System.out.println("                  PRESS Ctrl + C TO EXIT.");
		while(true){
			Random r = new Random();
			rand = r.nextInt(10);
			if(rand%2 == 0){
				new Square(rand);
			}
			else {
				new Cube(rand);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught.");
			}
		}
	}
}

class Square implements Runnable {
	Thread s;
	int x;
	Square(int x){
		this.x = x;
		s = new Thread(this, "Square");
		s.start();
	}
	public void run() {
		System.out.println(x + " is Even and its square is " + (x*x));
	} 
}

class Cube implements Runnable {
	Thread c;
	int x;
	Cube(int x){
		this.x = x;
		c = new Thread(this, "Cube");
		c.start();
	}
	public void run() {
		System.out.println(x + " is Odd and its cube is " + (x*x*x));
	} 
}

class ThreeThreads{
	public static void main(String[] args) {
		new First();
	} }
