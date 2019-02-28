package Java0226;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LottoNumber {

	public static void main(String[] args) {
		// 로또 번호 저장하기
		// 정수 6개를 저장할 수 있는 자로구조를 생성
		Set<Integer> lotto = new TreeSet<Integer>();
		Scanner sc = new Scanner(System.in);

		while (lotto.size() != 6) {
			System.out.printf("로또번호 입력: ");
			int su = sc.nextInt();
			// 1부터 45까지가 아니라면
			if (su < 1 || su > 45) {
				// 다시입력
				System.out.printf("1-45사이의 숫자만 입력하시오.\n");
				continue;
			}
			// 중복체크
			if (lotto.add(su) == false) {
				System.out.printf("같은 숫자를 중복해서 입력할 수 없습니다.\n다시 입력하세요.\n");
			}

		}
		for (Integer temp : lotto) {
			System.out.printf("%d\t", temp);
		}

		sc.close();

	}

}
