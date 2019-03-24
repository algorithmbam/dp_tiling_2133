package algorithm_3xn_tiling;

import java.util.Scanner;

public class Tiling {

	private static int dp[] = new int[31];

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		int result = dp(input);

		System.out.println(result);
	}

	public static int dp(int input) {
	
		if((input != 0) && ((input % 2) != 0)) { // 홀수가 입력될 경우는 0 처리
			dp[input] = 0;
			return dp[input];
		}
		
		if (input == 0) { // 2 * dp(input - i) 호출시 0 이 입력될 수 있으므로  return 1 처리
			dp[input]= 1;
			return dp[input];
			
		} else { // dp[input] 에 기존에 계산한 값이 들어있거나, 짝수일 경우는 아래 로직을 수행
			if (dp[input] != 0) {
				return dp[input];

			} else {
				int result = 3 * dp(input - 2); // 점화식
				for (int i = 4; i <= input; i++) { // 4이상 짝수일 경우에 나타나는 패턴이 2개 추가로 생기기때문에 4이상의 매 짝수마다 * 2 를 해서 더해줘야 함
					if ((i % 2) == 0) {
						result = result + (2 * dp(input - i));
					}
				}
				
				dp[input] = result;
				
				return dp[input];
			}
		}
	}
}