package Java0226;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Stack;

public class DSMain {

	public static void main(String[] args) {
		// 문자열을 저장할 수 있는 스택을 생성
		// Stack : LIFO(Last In First Out)
		Stack<String> stack = new Stack<String>();

		// 데이터 저장
		stack.push("프로그래밍 언어");
		stack.push("자료구조");
		stack.push("알고리즘");
		stack.push("디자인패턴");
		stack.push("데이터베이스");
		stack.push("Front-End");

		// 데이터 꺼내서 출력
		String data = stack.pop();
		System.out.printf("%s\n", data);

		for (String temp : stack) {
			System.out.printf("%s\n", temp);
		}
		System.out.printf("==========================\n");

		// Queue - FIFO(First In First Out)
		// PriorityQueue는 데이터를 오름차순 정렬한 큐
		// PriorityQueue는 정말로 정렬을 하는 것이 아니고
		// 데이터를 삽입하면서 정렬된 것처럼 트리구조로 저장합니다.
		// 데이터를 저장하고 하나씩 poll을 순서대로 나오지만
		// 한꺼번에 출력하면 출력순서를 알 수 없습니다.

		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("엠마 스톤");
		queue.add("라이언 고슬링");
		queue.add("테일러 스위프드");
		queue.add("엠마 왓슨");

		// 데이터 꺼내기
		data = queue.poll();
		System.out.printf("%s\n", data);
		for (String temp : queue) {
			System.out.printf("%s\n", temp);
		}
		System.out.printf("==========================\n");

		// Deque : 양쪽에서 데이터를 삽입하고 삭제할 수 있는 자료구조
		// Deque는 인터페이스고 이를 구현한 클래스가 ArrayDeque
		ArrayDeque<String> ad = new ArrayDeque<String>();
		ad.addFirst("Encapsulation(캡슐화)");
		ad.addLast("Inheritance(상속)");
		ad.addLast("Polymorphism(다양성)");
		System.out.printf("마지막 데이터:%s\n", ad.getLast());
		System.out.printf("첫번째 데이터:%s\n", ad.getFirst());

	}

}
