class Call{
	void call_msg(String msg){
		System.out.print("{"+msg);
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			System.out.println("Interrupted");
		}
		System.out.println("}");	
	}
}

class NewThread implements Runnable {
	String msg;
	Call ob;
	Thread t;
	
	NewThread(Call ob, String msg) {
		this.ob = ob;
		this.msg = msg;
		t = new Thread(this);
		t.start();
	}

	public void run(){
		synchronized(ob){
			ob.call_msg(msg);
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				System.out.println("Interrupted");
			}
		}
	}
}

class labtest2_Prog4{
	public static void main(String args[]){
		Call ob = new Call();
		NewThread ob1 = new NewThread(ob,"USN");
		NewThread ob2 = new NewThread(ob,"CSE");
		NewThread ob3 = new NewThread(ob,"BMSCE");
		NewThread ob4 = new NewThread(ob,"BANGALORE");
	
		try{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
			ob4.t.join();
		}catch(InterruptedException e){
			System.out.println("Main Thread Interrupted");
		}
	}
}