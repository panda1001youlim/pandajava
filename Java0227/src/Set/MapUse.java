package Set;

import java.util.HashMap;
import java.util.Map;

public class MapUse {

	public static void main(String[] args) {
		// ��ȣ(int), �̸�(String), ����(int)�� ��� ����

		// �ڷᱸ���� ����
		Map<String, Object> map = new HashMap<String, Object>();
		// ������ ����
		map.put("num", 1);
		map.put("name", "ȫ����");
		map.put("age", 34);
		
		// �����͸� ������ ���
		System.out.printf("%s\n", map.get("name"));
		// ���� key�� ����ؼ� �����͸� �������� null
		System.out.printf("%s\n", map.get("address"));
		
		// ������ �߰� - ���� key���
		map.put("job", "������");
		// ������ ���� - �̹� �����ϴ� key�� ������ �߰�
		map.put("num", 2);
		// ������ ����
		map.remove("age");

	}

}
