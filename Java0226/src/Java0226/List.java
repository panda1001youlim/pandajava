package Java0226;

import java.util.ArrayList;
import java.util.LinkedList;

public class List {

	public static void main(String[] args) {
		// 정수를 저장할 수 있는 ArrayList생성
		LinkedList<Integer> al = new LinkedList<Integer>();
		// 데이터 2개 추가
		al.add(10);
		al.add(30);
		// 작업하기 전의 시간을 기록
		// long start = System.currentTimeMillis();
		// al의 2번째 자리에 데이터를 10만번 삽입
		for (int i = 0; i < 100000; i = i + 1) {
			al.add(20);
		}
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i = i + 1) {
			Integer integer = al.get(i);
		}
		// 작업 종류의 시간을 기록
		long end = System.currentTimeMillis();
		// 작업에 걸린 시간 출력
		System.out.printf("작업에 걸린 시간:%d\n", (end - start));
		// List의 모든 테이터 출력
		for (Integer i : al) {
			System.out.printf("%d\n", i);
		}
		

	}

}
