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
	
	public void method4() {
		// 컴퓨터와 가위바위보 하기
		// 1. 이름 입력받기
		System.out.print("사용자의 이름을 입력하시오. : ");
		String name = sc.nextLine();
		
		// 2. 마지막에 몇전 몇승 몇무 몇패를 출력할꺼임 --> 각 결과를 담을 변수 선언
		int count = 0; // 0전 횟수
		int win = 0;   // 0승 횟수
		int draw = 0;  // 0무 횟수
		int lose = 0;  // 0패 횟수 
		
		String result = "";			  	// 결과를 담을 변수
		String winStr = "이겼습니다!!";	// 이겼을 시, result에 담기
		String drawStr = "비겼습니다.";
		String loseStr = "졌습니다...";
		
		// 3. 종료전까지 무한 가위바위보
		while(true) {
			// 4. 컴퓨터에서 랜덤으로 가위바위보  정하기
			int comRan = (int)(Math.random()*3); // 0, 1, 2 이 랜덤으로 출력되게
			String computer = "" ; 					// 컴퓨터의 값을 담을 변수
			
			switch(comRan) {
			case 0: computer="가위"; break; 
			case 1: computer="바위"; break;
			case 2: computer="보"; break;
			
			}
			
			// 5. 사용자에게 가위바위보 /종료 입력 유도하기
			System.out.print("가위/바위/보 중 하나를 입력하시오 (단, 종료하시려면 exit 입력) : ");
			String user = sc.nextLine();
		
			
			// 6. 컴퓨터랑 사용자랑 한 판 한 결과
			if(user.equals("exit")) {
				//  _1. exit를 입력했을 시
				break;
				
			}else if(user.equals("가위") || user.equals("바위") || user.equals("보")) {
				//  _2. 사용자가 가위/바위/보 중 하나를 입력했을 시
				
				// 컴퓨터 == 사용자(비겼을 경우)
				if(computer.equals(user)) {
					result = drawStr;
					draw++;
					
				}else if(computer.equals("가위")) {
					// swith문
					switch(user) {
					case "바위" : result = winStr; win++; break;
					case "보" : result = loseStr; lose++; break;
					}
					
				}else if(computer.equals("바위")) {
					// if-else if문
					if(user.equals("가위")) {
						result = loseStr; 
						lose++;
						
					}else if(user.equals("보")) {
						result = winStr;
						win++;
					}
					
				}else {
					// 삼항 연산자
					result = user.equals("가위")? winStr : loseStr;
					
					if(result.equals(winStr)) {
						win++;
					}else {
						lose++;
					}
						
				}
				
				// 가위바위보 결과 담아 낼때 마다 수행 횟수 증가
				count++; 
				
			}else {
				// 그 외 잘못 입력했을 경우?  --> 다시 처음으로 
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주십시오");
				continue;
			}
			
			System.out.println("컴퓨터 : " + computer);
			System.out.println(name + " : " + user);
			System.out.println(result);
			System.out.println("-----------------------------------------");
			
		}
		
		System.out.println(count + "전 " + win + "승 " + draw + "무 " + lose + "패");
			
	}
	
	public void method5() {
		
		// 1부터 100 사이의 정수 중에서 임의의 랜덤값이 정해짐
		// 사용자는 임의의 랜덤값을 맞추는데 몇번만에 맞추는지 출력
		
		// 1. 1~100 사이 랜덤값 뽑기
		int random = (int)(Math.random()*100 +1);
		
		// 2. 사용자가 몇번 만에 맞추는기 카운트할 변수
		int count = 0;
		
		// 3. 사용자가 맞추때까지 무한반복
		while(true) {
			
			System.out.print("1~100 사이의 임의의 숫자를 맞춰보세요!!");
			int user = sc.nextInt();
			
			// 4. 사용자가 입력한 숫자가 1과 100 사이의 숫자인지 확인
			if(user>=1 && user <=100) {	
		
				// 5. 숫자가 다를 경우
				if(user != random) {
					if(user < random) {
						// 5_1. 사용자가 말한 숫자 보다 클 경우 --> up
						System.out.println("UP↑");
	
					}else {
						// 5_2. 사용자가 말한 숫자 보다 작을 경우 --> down
						System.out.println("DOWN↓");
						
					}
					
					count++;
					
				}else {
					// 같을 경우(게임종료)
					count++;
					System.out.println("정답입니다!!!!!");
					System.out.println();
					break;
				}
				
				
				
			}else { 
				System.out.println("1~100사이의 숫자를 입력해주세요!");
				System.out.println();
				continue;
			}
			
		}
		// 6. 출력해서 확인해 보기
		System.out.println(count+"회 만에 맞추셨습니다!");
		
		
	}
	
	
}
