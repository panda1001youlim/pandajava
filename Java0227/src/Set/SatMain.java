package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SatMain {

	public static void main(String[] args) {
		// ������ ������ �� ����� Ŭ������ �������̽��� ������ ��쿡��
		// ������ �Ʒ�ó�� ���� Ŭ������ �������̽� Ÿ������ ������ �� �ֽ��ϴ�.
		Set<String> set = new TreeSet<String>();
		set.add("Korea");
		set.add("China");
		set.add("Newziland");
		set.add("England");
		set.add("Holland");
		set.add("Korea");
		
		// ��� ������ ����
		for(String nation : set) {
			System.out.printf("%s\n",nation);
		}

	}

}
