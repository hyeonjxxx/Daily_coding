package java100_workspace.com.hj.part1;

public class DataType {
	public static void main(String[] args) {
		
		/*
		 * 문제6. 자바의 데이터타입(자료형)에 대해서 각 타입의 사이즈와 함께 설명해보시오.
		 *       정의형의 경우 사이즈와 범위도 말해보시오.
		 *       (이 문제는 자바의 자료형의 종류와 각 타입의 사이즈에 대해서 아는지 묻는 문제)
		 */
		
		// 기본형 타입 과 참조형 타입
		
		// 01. 기본형 타입(Primitive Data Type) --> 8개
		
		byte num1;			// 정수형, 1byte
		short num2;			//     , 2byte
		int num4;			//     , 4byte  ★	
		long num8;			//     , 8byte
		
		float num44;		// 실수형, 4byte
		double num88;		//     , 8byte  ★
		
		char text1;			// 문자형, 2byte --> 문자 한개, 문자열을 다루는 타입은 x
		boolean test;		// 논리형(참 or 거짓), 1byte  --> true, false 
		
		// 02. 참조형 타입(Reference Data Type) --> 위 기본형에 속하지 않는 데이터형들
		//     대표적으로 --> 클래스(class), 배열(array), 인터페이스(interface), 문자열(String/immutable) 
		// 특징! --> 데이터가 저장된 메모리의 주소값을 저장하는 변수임!!
		String text2;		//
		
		/*
		 * 문제07. 자바의 Primitive Data Type 의 바이트 크기와 비트 크기를 출력하는 코드를 구현 하시오
		 *         정수형 타입과 문자형 타입에 대해서만 구현 한다
		 *         이때 , 각 타입의 최댓값과 최솟값도 같이 구하여 출력 하시오
		 *         아래 결과에서 문자형의 최댓값 , 최솟값이 제대로 출력이 안되었는데 그 이유를 설명하고 수정해보시오
		 *         
		 * -----------결과 출력 -----------   
		 * byte : 1바이트) ----> 8비트 128 ~127
		   short: 2바이트 ) ----> 16비트 32768 ~32767
		   int : 4바이트 ) ----> 32비트 2147483648 ~2147483647
		   long : 8바이트 ) ----> 64비트 9223372036854775808 ~9223372036854775807
		   char : 2바이트 ) ----> 16비트 ◦ --> 출력 안됨
		   char : 2바이트 ) ----> 16비트 0 ~65535     
		 */
		
		//대문자로 작성
		System.out.println(Byte.BYTES);	// 바이트 계산
		System.out.println(Byte.SIZE);	// 비트 계산
		System.out.println("byte: " + Byte.BYTES + "바이트 -->"+ Byte.SIZE + "비트\t " 
				+ "최댓값 "+ Byte.MIN_VALUE + "~최솟값"+ Byte.MAX_VALUE);	
		System.out.println("short: " + Short.BYTES + "바이트 -->"+ Short.SIZE + "비트\t " 
				 + "최댓값 "+ Short.MIN_VALUE + "~최솟값"+ Short.MAX_VALUE);	
		System.out.println("int: " + Integer.BYTES + "바이트 -->"+ Integer.SIZE + "비트\t " 
				 + "최댓값 "+ Integer.MIN_VALUE + "~최솟값"+ Integer.MAX_VALUE);	
		System.out.println("long : " + Long.BYTES + "바이트 -->"+ Long.SIZE + "비트\t " 
				 + "최댓값 "+ Long.MIN_VALUE + "~최솟값"+ Long.MAX_VALUE);
		System.out.println("char : " + Character.BYTES + "바이트 -->"+ Character.SIZE + "비트\t " 
				 + "최댓값 "+ Character.MIN_VALUE + "~최솟값"+ Character.MAX_VALUE);
		// 문자현 타입을 숫자로 범위를 알수 없기 때문에, int형으로 강제형변환! 
		System.out.println("char : " + (int)Character.BYTES + "바이트 -->"+ (int)Character.SIZE + "비트\t " 
				 + "최댓값 "+ (int)Character.MIN_VALUE + "~최솟값"+ (int)Character.MAX_VALUE);
	}
	 

}
