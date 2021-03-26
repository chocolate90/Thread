package thread.runable;

public class RunnableTest implements Runnable {

	@Override
	public void run() {
		
		System.out.println("현재 스레드:" + Thread.currentThread().getName());
		
		System.out.println("스레드 시작");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000); // 1초 멈춤
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

	
}
