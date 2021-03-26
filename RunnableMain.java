package thread.runable;

public class RunnableMain {

	public static void main(String[] args) {

		/* 
		 * Runnable 인터페이스를 상속하는 방법
		 * 스레드 클래스의 생성자 매개변수로 Runnable 인터페이스를
		 * 구현하는 클래스를 전달
		 */
		
		RunnableTest test = new RunnableTest();
		
		Thread t = new Thread(test, "스레드");
		t.start();
		
		System.out.println("메인스레드 종료");

	}
}
