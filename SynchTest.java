package thread.ex02.synch;

public class SynchTest implements Runnable{

	int j = 0;
	
	@Override
	public synchronized void run() {
		
		for(int i = 1; i <= 10; i++) {
			
			if(Thread.currentThread().getName().equals("A")) { 
				j++;
			}
			
			System.out.println("스레드 이름:" + Thread.currentThread().getName() + " num:" + i);
			
			try {
				Thread.sleep(500);
				
			} catch (Exception e) {

			}
		}
		
	}

}
