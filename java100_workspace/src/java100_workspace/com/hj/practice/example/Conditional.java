package java100_workspace.com.hj.practice.example;

import java.util.Scanner;

public class Conditional {

	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		// 사용자에게 한 개의 정수를 입력받고
		// 1부터 입력 받은 수까지 홀수/짝수를 나눠서
		// 홀수면 박, 짝수면 수 출력
		
		// 단, 입력받은 수가 양수가 아니면 "양수가 아닙니다" 출력
		
		// 예시 ) 4 입력시  -->  박수박수 출력
		
		System.out.println("정수를 입력해주세요.");
		int num = sc.nextInt();
		
		if(num > 0) {	
			// 반복문으로 홀짝 검사, 범위를 사용자가 입력한 숫자까지
			for(int i=1; i<=num; i++) {
				if(i%2==1) { // 홀수일 경우
					System.out.print("박");
					
				}else {		// 짝수일 경우
					System.out.print("수");
				}
			}
			
		}else {		// 잘 못 입력한 경우
			System.out.println("양수가 아닙니다.");
		}
	}
	
	public void method2() {
		// 업그레이드
		// 입력한 숫자가 양수가 아닐경우 숫자 입력 유도
		
		while(true) {
			
			System.out.println("정수를 입력해주세요.");
			int num = sc.nextInt();
			
			if(num > 0) {	
				// 반복문으로 홀짝 검사, 범위를 사용자가 입력한 숫자까지
				for(int i=1; i<=num; i++) {
					if(i%2==1) { // 홀수일 경우
						System.out.print("박");
						
					}else {		// 짝수일 경우
						System.out.print("수");
					}
				}
				// 양수를 입력한 경우 while 반복문 종료
				break;
				
			}else {		// 잘 못 입력한 경우
				System.out.println("양수가 아닙니다.");
				System.out.println("---------------------------------");
			}
			
			// 다시 숫자 입력 받도록 반복문 첨으로 가기
		}
	}
	
	
	public void method3() {
		
		// 문자열을 입력 받고 					(str)
		// 입력받은 문자열에서 검색하고 싶은 문자도 입력받는다.	(ch)
		
		// 문자열에 그 문자가 몇 개 있는지 개수 출력
		
		// 예시 ) banana, a 를 입력 받게 되면 3출력
		System.out.print("문자열을 입력하세요. ");
		String str = sc.nextLine();
		
		System.out.print("검색하고 싶은 문자를 입력하세요. ");
		char ch = sc.nextLine().charAt(0);
		
		// 문자의 갯수를 셀 변수 선언 및 초기화
		int count = 0;
		
		// 입력한 문자열의 문자갯수만큼 반복시켜서
		for(int i=0; i<str.length(); i++) {
			
			// ch와 일치하는(조건검사) 문자가 있을 때마다 count값이 1씩 증가
			if(str.charAt(i)==ch) {
				count++;
			}
			
		}
		System.out.printf("%s 중 %s는 %d개 있다.", str, ch, count);
		
		
		
	}
	
}
