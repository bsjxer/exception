package chapter02;

import java.io.IOException;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
		try {
			myClass.dangerousMethod();
		} 
		catch ( IOException e) {
			e.printStackTrace();
		}
		catch ( MyException e) {
			e.printStackTrace();
		}

		
//		catch ( Exception e) {
//			e.printStackTrace();
//		}
//		
//		catch( IOException | MyException e) {
//			e.printStackTrace();
//		}
	}

}
