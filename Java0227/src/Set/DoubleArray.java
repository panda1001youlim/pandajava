package Set;

import java.util.HashMap;
import java.util.Map;

public class DoubleArray {

	public static void main(String[] args) {
		// ���ξ߱� �� ���� ���� ���
		String[] kia = { "��ġȫ", "������", "������", "�̹�ȣ" };
		String[] dusan = { "����", "�迵��" };
		String[] nc = { "������" };// �λ����� ��µ�
		// �� 2���� �迭�� �ϳ��� �迭�� �����
		// �迭���� �� ��Ұ� ����� ���� �״�� ��°���
		String[][] players = { kia, dusan, nc };
		// ���̸��� ���� ����� ���
		for (int i = 0; i < players.length; i = i + 1) {
			if (i == 0) {
				System.out.printf("���\n");
			} else {
				System.out.printf("�λ�\n");
			}
			// �� ���� ���� ���
			String[] player = players[i];
			// �迭�� ��ȸ�ؼ� ���
			for (String temp : player) {
				System.out.printf("\t%s\n", temp);
			}
		}
		System.out.printf("=================\n");

		// �� �迭�� Map���� ����
		Map<String, Object> map1 = new HashMap<String, Object>();
		// �� �̸��� team�̶�� Ű�� ����
		map1.put("team", "���");
		// ������� �迭�� palyer��� Ű�� ����
		map1.put("player", kia);

		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("team", "�λ�");
		map2.put("player", dusan);
		
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("team", "NC");
		map3.put("player", nc);

		// Map�� �迭�� ����
		Map[] kbo = { map1, map2, map3};
		for (Map map : kbo) {
			// �� �̸� ���
			System.out.printf("%s\n", map.get("team"));
			// map���� �����͸� �����ͼ� ������� �ʰ� ����� ���� ������ �ڷ������� ����ȯ�ؼ� ���
			String[] temp = (String[]) map.get("player");
			for (String imsi : temp) {
				System.out.printf("\t%s\n", imsi);
			}

		}

	}

}
