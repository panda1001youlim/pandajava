package Set;

//import java.util.Random;
import java.util.StringTokenizer;

public class RandomMain {

	public static void main(String[] args) {
		/*
		// �ν��Ͻ��� ������ �� seed��ȣ�� �����ϸ� ������ �������� ���ڰ� ����
		// seed��ȣ�� �������������� ���� ����
		Random r = new Random();
		// nextInt�� ���� ���� ������ ������ ���ڸ� ����
		// System.out.printf("%d\n", r.nextInt());

		int[] ar = { 1, 2, 3, 4, 5, 6, 2, 3, 4, 5, 6, 3, 4, 5, 6 };
		// nextInt(����)�� ������ ���� ���������� �����ϰ� ���ڸ� ����
		int len = ar.length;
		int su = r.nextInt(len);
		System.out.printf("%d\n", ar[su]);

		// ����, �Ķ�, ���, �ʷ� �װ��� �� �ϳ��� �����ϰ� �������� �ۼ�
		String[] colors = { "����", "�Ķ�", "���", "�ʷ�" };
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("%s\n", colors[r.nextInt(colors.length)]);
		}
		*/
		
		StringTokenizer st = new StringTokenizer("�״� ������ �ϴ��� �췯�� ���� �β�������");
		// hashMoreTokens�� false�� �����Ҷ����� �ݺ�
		// �����ͺ��̽����� �����͸� �����ͼ� �д� ����� ���ϡڡ�
		while(st.hasMoreTokens()){
			String e = st.nextToken();
			System.out.printf("%s\n", e);
		}

	}

}
