package chapter02;

public class ExceptionTest {
	public static void main(String[] args) {
		int a = 0;
		int k = 0;
		
		try {
		
			System.out.println("파일을 열었음");
			k = 1000 / a;
			System.out.println("more codes...");
			
		} catch (ArithmeticException ex) {
			// 1. 로그 남기기(파일
			//
			//
			
			// 2. 사과(정상종료)
			System.out.println("죄송합니다. 예기치 않은...");

			// 3. 이거라도 못하겠으면,
			// ex.printStackTrace();
			
			return;
		} finally { // return 실행되고 finally는 실행된다
			System.out.println("자원정리");
		}

		System.out.println("결과는:" + k);
	}
}
