package thread.ex01;

public class ThreadMain01 {

	public static void main(String[] args) {
		
		// 객체 2개 스레드 2개(각각 실행)
		
		ThreadTest01 t1 = new ThreadTest01();
		ThreadTest01 t2 = new ThreadTest01();
		
		Thread test1 = new Thread(t1, "A"); // 스레드 이름 A
		Thread test2 = new Thread(t2, "B"); // 스레드 이름 B
		
		test1.start();
		test2.start();
		
		System.out.println("메인 스레드 종료");
	}
	
}
