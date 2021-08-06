package java100_workspace.com.hj.programmers;

import java.util.Scanner;

public class Solution_1 {


	// 21.08.06  - 부족한 금액 계산하기 
	
	public long solution(int price, int money, int count) {
        long answer = -1;

        long total = 0;
        for(int i = 1; i<= count; i++){
    
            total += price * i;
        }
        
        return money >= total ? 0 : total-money;
        
        // 테스트 4번 오류 -> 금액이 부족하지 않은 경우
        // 테스트 18~22번 오류  total과 sum의 변수형을  long으로 동일해야 함
        
    }
	
	
	// 다른 사람 답안 --> 등차수열의 합 --> 등비 수열만 생각함

	/*
	 * public long solution(long price, long money, long count) {
	        return Math.max(price * (count * (count + 1) / 2) - money, 0);
	    }
	 * 
	 */
	

	
}
