package java100_workspace.com.hj.practice.example;

import java.util.Scanner;

public class ArrayPractice {

	Scanner sc = new Scanner(System.in);

	public void method1() {
		
		System.out.println("양의 정수 입력 : ");
		
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}
	
	public void method2() {
		String[] arr= {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(arr[1]);
		
	}
	
	public void method3(){
	
		// 1. 사용자한테 문자입력받기
		System.out.print("문자 : ");
		String str = sc.nextLine();
		
		// 2. 카운트할 문자입력받기
		System.out.print("검색할 문자열: ");
		char ch = sc.nextLine().charAt(0);
		
		// 3. 사용자가 입력한 문자열의 문자길이만큰 배열 할당
		char[] arr = new char[str.length()];
		
		// 4. 배열에 문자하나하나 담기
		for(int i=0; i<arr.length; i++) {
			arr[i]=str.charAt(i);
		}
		
		// 5. 반복문으로 문자 카운트하기
		int count = 0;
		
		for(int i=0; i<arr.length;i++) {
			// 인덱스값과 문자열이 같은 경우 카운트 증가
			if(arr[i] == ch) {
				count++;
			}
		}
		
		System.out.println();
		System.out.println(ch + "의 개수 : " + count);
		
	}
	
	public void method4() {
		
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			// 5  => 1 2 3 2 1
			// 7  => 1 2 3 4 3 2 1
			// 시작값은 1이고 중간까진 1씩 증가, 그 이후로 부터 1씩 감소
			
			if(num >= 3 && num % 2==1) {
				
				// 배열의 크기 할당
				int[] arr = new int[num];
				
				// 시작값
				int count=1;
				
				for(int i=0; i<arr.length; i++) {
					
					arr[i]=count;
					
					if(i<arr.length/2) {
						count++;
					}else {
						count--;
					}
					
				}
				
				for(int i=0; i<arr.length; i++) {
					if(i<arr.length-1) {
						System.out.print(arr[i] + ", ");
					}else {
						System.out.println(arr[i]);
					}
				}
				
				break;
				
			}else {
				System.out.println("다시입력하세요");
				
			}
		}
		
	}
	
}
