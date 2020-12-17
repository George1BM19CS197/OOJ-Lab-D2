import java.util.*;
import java.lang.*;

class NewThread implements Runnable {
	String name;
	int interval;
	int repeat;
	Thread t;
	NewThread(String name,int interval,int repeat){
		this.name = name;
		this.repeat = repeat;
		this.interval = interval;
		t = new Thread(this,name);
		t.start();
	}
	public void run(){
		try{
			for(int i=repeat;i>0;i--){
				System.out.println(""+name);
				Thread.sleep(interval);
			}
		}catch(InterruptedException e){
			System.out.println("Child Interrupted "+name);
		}
	}
}

class LAB9 {
	public static void main(String args[]){
		new NewThread("BMS College of Engineering",10000,5);
		new NewThread("CSE",2000,20);
		try{
			for(int i=5;i>0;i--){
				Thread.sleep(10000);
			}
		}
		catch(InterruptedException e){
			System.out.println("Main Thread Interrupted");
		}	
	}
}