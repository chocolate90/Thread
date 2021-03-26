package thread.thread;

public class ThreadTest extends Thread {

	@Override
	public void run() {
		
		System.out.println("현재 스레드 이름:" + getName());
		System.out.println("스레드 시작~");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

	
}
