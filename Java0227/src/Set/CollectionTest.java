package Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		// Collection클래스의 static메소드를 이용하면
		// List, Set, Map에 작업을 수행할 수 있습니다.
		// reverse, shuffle, unmodifiableList등의 메소드가 있습니다.
		List<String> list = new ArrayList<String>();
		list.add("요한 크루이프");
		list.add("마르코 반바스텐");
		list.add("루드 굴리트");
		list.add("데니스 베르캄프");
		list.add("에드위 반데사르");
		
		//Collections.reverse(list);
		//System.out.printf("%s\n", list);
		
		// 데이터를 섞어주는 함수 호출
		//Collections.shuffle(list);
		//System.out.printf("%s\n", list);
		
		List<String> readOnlyList = Collections.unmodifiableList(list);
		readOnlyList.add("아이언 로번");

	}

}
