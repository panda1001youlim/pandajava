package Java0226;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LottoNumber {

	public static void main(String[] args) {
		// �ζ� ��ȣ �����ϱ�
		// ���� 6���� ������ �� �ִ� �ڷα����� ����
		Set<Integer> lotto = new TreeSet<Integer>();
		Scanner sc = new Scanner(System.in);

		while (lotto.size() != 6) {
			System.out.printf("�ζǹ�ȣ �Է�: ");
			int su = sc.nextInt();
			// 1���� 45������ �ƴ϶��
			if (su < 1 || su > 45) {
				// �ٽ��Է�
				System.out.printf("1-45������ ���ڸ� �Է��Ͻÿ�.\n");
				continue;
			}
			// �ߺ�üũ
			if (lotto.add(su) == false) {
				System.out.printf("���� ���ڸ� �ߺ��ؼ� �Է��� �� �����ϴ�.\n�ٽ� �Է��ϼ���.\n");
			}

		}
		for (Integer temp : lotto) {
			System.out.printf("%d\t", temp);
		}

		sc.close();

	}

}
