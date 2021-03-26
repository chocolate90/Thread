package thread.ex02.synch;

public class SynchMain {

	public static void main(String[] args) {
		
		SynchTest st = new SynchTest();
		
		Thread t1 = new Thread(st, "A");
		Thread t2 = new Thread(st, "B");
		
		t1.start();
		t2.start();
	}
}
