package java100_workspace.com.hj.practice.example;

import java.util.Scanner;

public class Vairable {

	Scanner sc = new Scanner(System.in);

	public void method1() {
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();   			//nextLine() : 사용자가 입력한 값을 모두 읽어 옴!
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);	//nextChar() : 존재하지 않음!! 따라서  입력값을 문자열로 가져온뒤 인덱스로 원하는 값 가져와 담기
		
		System.out.print("키을 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("키 " + height + "인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다 :)" );
	}
	
	public void method2() {
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 몫 결과 : " + (num1 / num2));
		
	}
	
	public void method3(){
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		System.out.println("면적 : " + (width * height));
		System.out.println("둘레 : " + (width + height) * 2);
		
	}
	
	public void method4() {
		System.out.print("문자열을 입력하시오 : ");
		String str1 = sc.nextLine();
		
		System.out.println("첫 번쨰 문자 : " + str1.charAt(0));
		System.out.println("두 번쨰 문자 : " + str1.charAt(1));
		System.out.println("세 번쨰 문자 : " + str1.charAt(2));
	}
	
}
