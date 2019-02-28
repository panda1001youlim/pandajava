package Java0226;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		VO[] data = new VO[3];
		VO vo = new VO(1, "panda", "1111", "라디오", 24);
		data[0] = vo;

		vo = new VO(2, "icebear", "1212", "나비", 7);
		data[1] = vo;

		vo = new VO(3, "bonobono", "1001", "다람쥐", 18);
		data[2] = vo;

		// 배열의 데이터 확인
		for (VO temp : data) {
			System.out.printf("%s\n", temp);
		}

		// 배열의 데이터 정렬 - data의 구성요소 자료형인 VO클래스가
		// Comparable인터페이스를 implements하지 않았으면 예외 발생
		Arrays.sort(data);
		System.out.printf("========정렬========\n");
		// 배열의 데이터 확인
		for (VO temp : data) {
			System.out.printf("%s\n", temp);
		}
		System.out.printf("========정렬========\n");

		// VO타입을 비교할 수 있는 Comparator인터페이스의
		// Anonymous class->Instance
		Comparator<VO> numAscComp = new Comparator<VO>() {
			// 크기 비교할 때 사용하는 메소드
			@Override
			public int compare(VO o1, VO o2) {
				return o1.getNum() - o2.getNum();
			}

		};

		Comparator<VO> numDescComp = new Comparator<VO>() {
			// 크기 비교할 때 사용하는 메소드
			@Override
			public int compare(VO o1, VO o2) {
				return o2.getNum() - o1.getNum();
			}

		};

		// name의 오름차순 정렬을 할 수 있는 Comparator
		Comparator<VO> nameAscComp = new Comparator<VO>() {
			// 크기 비교할 때 사용하는 메소드
			@Override
			public int compare(VO o1, VO o2) {
				return o1.getName().compareTo(o2.getName());
			}

		};

		// name의 내림차순 정렬을 할 수 있는 Comparator
		Comparator<VO> nameDescComp = new Comparator<VO>() {
			// 크기 비교할 때 사용하는 메소드
			@Override
			public int compare(VO o1, VO o2) {
				return o2.getName().compareTo(o1.getName());
			}

		};

		// 비교할 수 있는 인스턴스를 대입해서 사용
		Arrays.sort(data, nameDescComp);
		for (VO temp : data) {
			System.out.printf("%s\n", temp);
		}

		// 1번부터 4번까지 입력을 받기 위한 코드를 작성
		Scanner sc = new Scanner(System.in);
		System.out.printf("정렬할 조건을 선택(1-4)\n1:num오름차순 2:num내림차순 3:name오름차순 4:name내림차순\n=");
		final int num오름차순 = 1;
		final int num내림차순 = 2;
		final int name오름차순 = 3;
		final int name내림차순 = 4;
		int input = sc.nextInt();
		Comparator<VO> comparator = numAscComp;
		switch (input) {
		case num오름차순:
			comparator = numAscComp;
			break;
		case num내림차순:
			comparator = numDescComp;
			break;
		case name오름차순:
			comparator = nameAscComp;
			break;
		case name내림차순:
			comparator = nameDescComp;
			break;
		default:
			System.out.printf("잘못된 메뉴 선택입니다.\n");
			break;
		}
		// 배열 정렬
		Arrays.sort(data, comparator);
		// 배열의 데이터 확인
		for (VO temp : data) {
			System.out.printf("%s\n", temp);
		}

		sc.close();
		
		
		int [] ar = {20,30,50,10,40,70,60};
		// 20이 몇번째에 있는지
		// 정렬되어 있지 않아서 이분검색을제대로 수행할 수 없음
		int pos = Arrays.binarySearch(ar, 20);
		System.out.printf("20:%d번째\n", pos);
		Arrays.sort(ar);
		// {10,20,30,40,50,60,70}
		pos = Arrays.binarySearch(ar, 20);
		System.out.printf("20:%d번째\n", pos);
	}

}
