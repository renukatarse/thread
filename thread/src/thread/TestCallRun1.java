package thread;

public class TestCallRun1 extends Thread{  
	 public void run(){  
		   System.out.println("running...");  
		 }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCallRun1 t1=new TestCallRun1();  
		  t1.run();//fine, but does not start a separate call stack  
		 }

	}

//What if we call run() method directly instead start() method?

//Each thread starts in a separate call stack.
//Invoking the run() method from main thread, 
//the run() method goes onto the current call stack rather than at
//the beginning of a new call stack.


