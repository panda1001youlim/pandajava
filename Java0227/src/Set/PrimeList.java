package Set;

import java.util.ArrayList;
import java.util.Comparator;

public class PrimeList {

	public static void main(String[] args) {
		// 2���� 100���� �Ҽ��� ã�Ƽ� ArrayList�� �����ϰ� ������������ ���
		// �Ҽ��� 2���� �ڽ��� ������ �Ǵ� ���ڱ��� ������ �������� ������ �Ҽ�

		// ������ ������ �� �ִ� ArrayList�� ����
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		// 2���� 100����
		for (int i = 2; i <= 100; i = i + 1) {
			// ������ ���������� Ȯ���ϱ� ���� ����
			int flag = 0;
			
			// 2���� �ڽ��� ���ݱ���
			for (int j = 2; j <= i / 2; j = j + 1) {
				// ������ �������� �ݺ��� �ߴ�
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
