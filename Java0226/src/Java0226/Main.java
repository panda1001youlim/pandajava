package Java0226;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		VO[] data = new VO[3];
		VO vo = new VO(1, "panda", "1111", "����", 24);
		data[0] = vo;

		vo = new VO(2, "icebear", "1212", "����", 7);
		data[1] = vo;

		vo = new VO(3, "bonobono", "1001", "�ٶ���", 18);
		data[2] = vo;

		// �迭�� ������ Ȯ��
		for (VO temp : data) {
			System.out.printf("%s\n", temp);
		}

		// �迭�� ������ ���� - data�� ������� �ڷ����� VOŬ������
		// Comparable�������̽��� implements���� �ʾ����� ���� �߻�
		Arrays.sort(data);
		System.out.printf("========����========\n");
		// �迭�� ������ Ȯ��
		for (VO temp : data) {
			System.out.printf("%s\n", temp);
		}
		System.out.printf("========����========\n");

		// VOŸ���� ���� �� �ִ� Comparator�������̽���
		// Anonymous class->Instance
		Comparator<VO> numAscComp = new Comparator<VO>() {
			// ũ�� ���� �� ����ϴ� �޼ҵ�
			@Override
			public int compare(VO o1, VO o2) {
				return o1.getNum() - o2.getNum();
			}

		};

		Comparator<VO> numDescComp = new Comparator<VO>() {
			// ũ�� ���� �� ����ϴ� �޼ҵ�
			@Override
			public int compare(VO o1, VO o2) {
				return o2.getNum() - o1.getNum();
			}

		};

		// name�� �������� ������ �� �� �ִ� Comparator
		Comparator<VO> nameAscComp = new Comparator<VO>() {
			// ũ�� ���� �� ����ϴ� �޼ҵ�
			@Override
			public int compare(VO o1, VO o2) {
				return o1.getName().compareTo(o2.getName());
			}

		};

		// name�� �������� ������ �� �� �ִ� Comparator
		Comparator<VO> nameDescComp = new Comparator<VO>() {
			// ũ�� ���� �� ����ϴ� �޼ҵ�
			@Override
			public int compare(VO o1, VO o2) {
				return o2.getName().compareTo(o1.getName());
			}

		};

		// ���� �� �ִ� �ν��Ͻ��� �����ؼ� ���
		Arrays.sort(data, nameDescComp);
		for (VO temp : data) {
			System.out.printf("%s\n", temp);
		}

		// 1������ 4������ �Է��� �ޱ� ���� �ڵ带 �ۼ�
		Scanner sc = new Scanner(System.in);
		System.out.printf("������ ������ ����(1-4)\n1:num�������� 2:num�������� 3:name�������� 4:name��������\n=");
		final int num�������� = 1;
		final int num�������� = 2;
		final int name�������� = 3;
		final int name�������� = 4;
		int input = sc.nextInt();
		Comparator<VO> comparator = numAscComp;
		switch (input) {
		case num��������:
			comparator = numAscComp;
			break;
		case num��������:
			comparator = numDescComp;
			break;
		case name��������:
			comparator = nameAscComp;
			break;
		case name��������:
			comparator = nameDescComp;
			break;
		default:
			System.out.printf("�߸��� �޴� �����Դϴ�.\n");
			break;
		}
		// �迭 ����
		Arrays.sort(data, comparator);
		// �迭�� ������ Ȯ��
		for (VO temp : data) {
			System.out.printf("%s\n", temp);
		}

		sc.close();
		
		
		int [] ar = {20,30,50,10,40,70,60};
		// 20�� ���°�� �ִ���
		// ���ĵǾ� ���� �ʾƼ� �̺а˻�������� ������ �� ����
		int pos = Arrays.binarySearch(ar, 20);
		System.out.printf("20:%d��°\n", pos);
		Arrays.sort(ar);
		// {10,20,30,40,50,60,70}
		pos = Arrays.binarySearch(ar, 20);
		System.out.printf("20:%d��°\n", pos);
	}

}
