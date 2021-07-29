package java100_workspace.com.hj.practice.example;

import java.util.Scanner;

public class Operator {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num >= 0) {
			System.out.println("양수다.");
		}else {
			System.out.println("양수가 아니다.");
		}
	}
	
	public void practice2() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다.");
		}else if(num == 0) {
			System.out.println("0이다.");
		}else {
			System.out.println("음수다.");
		}
	}
	
	public void practice3() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if((num%2) == 0) {
			System.out.println("짝수다.");
		}else {
			System.out.println("홀수다.");
			
		}
		
		// 삼항 연산자?
		String result = (num%2==0? "짝수다" : "홀수다");
		System.out.println("정수값은 " + result);
		
	}

	public void practice4() {
		System.out.print("인원 수 : ");
		int person = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + candy/person);
		System.out.println("남는 사탕 개수 : " + candy % person);
	}
	
	public void practice5() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int year = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int ban = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		int gender = sc.nextLine().charAt(0);
		String result = gender == 'M' ? "남학생" : "여학생";
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double grade = sc.nextDouble();
		
		//printf
		System.out.printf("%d학년 %d반 %d번 %s %s의  성적은 %.2f이다", 
				           year, ban, num, name, result, grade);
		
	}
	
	public void practice8() {
		System.out.print("주민번호를 입력하세요(-포함) : ");
		String pId = sc.nextLine();
		
		String gender = (pId.charAt(7) == '1') || (pId.charAt(7) == '3') ? "남자" : (pId.charAt(7) == '2') || (pId.charAt(7) == '4') ? "여자" : "잘못입력";

		System.out.println(gender);
		
	}
	
	
	
}
