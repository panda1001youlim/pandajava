package Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		// CollectionŬ������ static�޼ҵ带 �̿��ϸ�
		// List, Set, Map�� �۾��� ������ �� �ֽ��ϴ�.
		// reverse, shuffle, unmodifiableList���� �޼ҵ尡 �ֽ��ϴ�.
		List<String> list = new ArrayList<String>();
		list.add("���� ũ������");
		list.add("������ �ݹٽ���");
		list.add("��� ����Ʈ");
		list.add("���Ͻ� ����į��");
		list.add("������ �ݵ��縣");
		
		//Collections.reverse(list);
		//System.out.printf("%s\n", list);
		
		// �����͸� �����ִ� �Լ� ȣ��
		//Collections.shuffle(list);
		//System.out.printf("%s\n", list);
		
		List<String> readOnlyList = Collections.unmodifiableList(list);
		readOnlyList.add("���̾� �ι�");

	}

}
