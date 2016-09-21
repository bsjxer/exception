package chapter02;

import java.io.IOException;

public class MyClass {
	public void dangerousMethod() throws MyException, IOException {
		System.out.println( "normal.." );
		
		boolean isDanger = true;
		if( isDanger ){
			//예외 상황이 발생
			//ex) network 오류, io 오류
			throw new MyException( "예외상황 발생" );
		}
		
		System.out.println( "normal.." );
	}
}
