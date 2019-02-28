package Set;

import java.util.ArrayList;
import java.util.Comparator;

public class PrimeList {

	public static void main(String[] args) {
		// 2부터 100까지 소수를 찾아서 ArrayList에 저장하고 내림차순으로 출력
		// 소수는 2부터 자신의 절반이 되는 숫자까지 나누어 떨어지지 않으면 소수

		// 정수를 저장할 수 있는 ArrayList를 생성
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		// 2부터 100까지
		for (int i = 2; i <= 100; i = i + 1) {
			// 나누어 떨어졌는지 확인하기 위한 변수
			int flag = 0;
			
			// 2부터 자신의 절반까지
			for (int j = 2; j <= i / 2; j = j + 1) {
				// 나누어 떨어지면 반복문 중단
				if (i % j == 0) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				primeList.add(i);
			}
		}

		Comparator<Integer> comp = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		};
		primeList.sort(comp);
		
		System.out.printf("%s\n", primeList);

	}

}
