package thread.thread;

public class ThreadMain {

	public static void main(String[] args) {
		
		/*
		 * Thread 클래스를 상속받아서 사용하는 방법
		 */
		
		ThreadTest t = new ThreadTest();
		
		t.setName("스레드");
		t.start();
		
		System.out.println("메인스레드 종료!");
	}
}
