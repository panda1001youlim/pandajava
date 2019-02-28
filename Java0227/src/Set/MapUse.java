package Set;

import java.util.HashMap;
import java.util.Map;

public class MapUse {

	public static void main(String[] args) {
		// 번호(int), 이름(String), 나이(int)를 묶어서 저장

		// 자료구조를 생성
		Map<String, Object> map = new HashMap<String, Object>();
		// 데이터 삽입
		map.put("num", 1);
		map.put("name", "홍범도");
		map.put("age", 34);
		
		// 데이터를 꺼내서 출력
		System.out.printf("%s\n", map.get("name"));
		// 없는 key를 사용해서 데이터를 가져오면 null
		System.out.printf("%s\n", map.get("address"));
		
		// 데이터 추가 - 없는 key사용
		map.put("job", "독립군");
		// 데이터 갱신 - 이미 존재하는 key에 데이터 추가
		map.put("num", 2);
		// 데이터 삭제
		map.remove("age");

	}

}
