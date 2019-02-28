package Set;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PhoneMain {

	public static void main(String[] args) {
		// PhoneNumber클래스의 인스턴스 만들기
		// 클래스의 변수가 1개인 경우 첫글자만 소문자로 변경해서 사용하는 경우가 있음
		PhoneNumber phoneNumber = new PhoneNumber(1, "김유림", "010-5504-0668");

		// 구성요소를 하나씩 출력
		System.out.printf("번호:%d\n", phoneNumber.getNum());
		System.out.printf("이름:%s\n", phoneNumber.getName());
		System.out.printf("전화번호:%s\n", phoneNumber.getPhone());

		// 동일한 데이터를 Map을 이용해 저장
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("num", 1);
		map.put("name", "김유림");
		map.put("phone", "010-5504-0668");

		// key의 이름을 직접 입력하지 않고 출력
		// map의 key가 변경되더라도 출력하는 부분을 수정할 필요 없음
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.printf("%s:%s\n", key, map.get(key));
		}

	}

}
