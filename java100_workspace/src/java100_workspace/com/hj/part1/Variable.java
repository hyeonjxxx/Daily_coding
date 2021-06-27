package java100_workspace.com.hj.part1;

	/*
	 * 문제3. 자바 코드가 작성되어 져서 최종 실행되는 과정을 설명하시오
	 * 파이썬과 비교해서, 자바로 작성된 코드는 확장자는 어떻게되는지?
	 */

	// 자바(컴파일 언어)
	// 자바 코드 작성(Test.java) --> 자바코드 컴파일(Compile)(Test.class)-->자바코드 실행(Run) (test.java)
	// 자바코드 컴파일시 javac 사용

	// 파이썬(인터프리터 언어)
	// 파이싼 코드 작성 (Test.py)--> 파이썬 코드 실행(Run)

public class Variable  {
	
	/*
	 *  문제2. 오류를 찾아 다시 작성해보시오
	  	public static void main(string[] args) {
		System.out.println('Hello World!')
			}

	*/
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
	
	// 클래스명의 첫번째 문자는 대문자로
	// String로 대문자로 시작
	// 출력문구는 '가 아닌 "으로 묶어줘야 됨
	// 출력문구 세미클론 누락
	
	
	
	/*  
	 *  문제3.자바의 기본적인 코드 구성에서 각 키워드를 간략하게 설명하시오
	 *  (자바 코드의 주요 키워드드렝 대해서 각각의 의미와 용도에 대해 묻는 문제)
		public class exercise_01  {
			public static void main(String[] args) {
				System.out.println("Hello World!");
			}
		}
	 */
	
	 
//	 접근제한자 클래스선언 클래스명  {
//			접근제한자 static 반환타입 메서드이름(파라미터) { // 메인메소드선언
//				// 구현할 코드 작성
//			}
//	 }
	
	/*
	 * 접근제한자 --> public, private, protected, default
	 * 		   --> 클래스나 메소드네 접근할 수 있는 범위를 지정
	 * 
	 * 클래스 선언 --> class
	 * 		   --> 객체를 생성하는 틀, 프레임, 공장
	 * 클래스 이름 --> 카멜케이스(단어와 단어사이 구분-->대문자 표기)	
	 * 
	 */

	

}
