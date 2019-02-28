package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SatMain {

	public static void main(String[] args) {
		// 변수를 선언할 때 사용한 클래스나 인터페이스를 구현한 경우에는
		// 변수를 아래처럼 상위 클래스나 인터페이스 타입으로 성절할 수 있습니다.
		Set<String> set = new TreeSet<String>();
		set.add("Korea");
		set.add("China");
		set.add("Newziland");
		set.add("England");
		set.add("Holland");
		set.add("Korea");
		
		// 모든 데이터 접근
		for(String nation : set) {
			System.out.printf("%s\n",nation);
		}

	}

}
