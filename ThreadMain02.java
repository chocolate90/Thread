package thread.ex01;

public class ThreadMain02 {

	public static void main(String[] args) {
		
		// 객체 한개 스레드 여러개 (1개의 객체를 실행)
		
		ThreadTest01 t = new ThreadTest01();
		
		Thread test1 = new Thread(t, "A");
		Thread test2 = new Thread(t, "B");
		
		test1.start();
		test2.start();
		
		System.out.println("메인 스레드 종료");
	}
}
