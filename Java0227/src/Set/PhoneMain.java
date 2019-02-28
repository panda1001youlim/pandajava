package Set;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PhoneMain {

	public static void main(String[] args) {
		// PhoneNumberŬ������ �ν��Ͻ� �����
		// Ŭ������ ������ 1���� ��� ù���ڸ� �ҹ��ڷ� �����ؼ� ����ϴ� ��찡 ����
		PhoneNumber phoneNumber = new PhoneNumber(1, "������", "010-5504-0668");

		// ������Ҹ� �ϳ��� ���
		System.out.printf("��ȣ:%d\n", phoneNumber.getNum());
		System.out.printf("�̸�:%s\n", phoneNumber.getName());
		System.out.printf("��ȭ��ȣ:%s\n", phoneNumber.getPhone());

		// ������ �����͸� Map�� �̿��� ����
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("num", 1);
		map.put("name", "������");
		map.put("phone", "010-5504-0668");

		// key�� �̸��� ���� �Է����� �ʰ� ���
		// map�� key�� ����Ǵ��� ����ϴ� �κ��� ������ �ʿ� ����
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.printf("%s:%s\n", key, map.get(key));
		}

	}

}
