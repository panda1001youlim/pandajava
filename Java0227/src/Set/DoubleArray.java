package Set;

import java.util.HashMap;
import java.util.Map;

public class DoubleArray {

	public static void main(String[] args) {
		// 프로야구 각 팀의 선수 명단
		String[] kia = { "안치홍", "최형우", "김주찬", "이범호" };
		String[] dusan = { "권혁", "배영수" };
		String[] nc = { "나성범" };// 두산으로 출력됨
		// 위 2개의 배열을 하나의 배열로 만들기
		// 배열안의 각 요소가 변경된 경우는 그대로 출력가능
		String[][] players = { kia, dusan, nc };
		// 팀이름과 선수 명단을 출력
		for (int i = 0; i < players.length; i = i + 1) {
			if (i == 0) {
				System.out.printf("기아\n");
			} else {
				System.out.printf("두산\n");
			}
			// 각 팀의 선수 명단
			String[] player = players[i];
			// 배열을 순회해서 출력
			for (String temp : player) {
				System.out.printf("\t%s\n", temp);
			}
		}
		System.out.printf("=================\n");

		// 각 배열을 Map으로 저장
		Map<String, Object> map1 = new HashMap<String, Object>();
		// 팀 이름을 team이라는 키로 저장
		map1.put("team", "기아");
		// 선수명단 배열을 palyer라는 키로 저장
		map1.put("player", kia);

		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("team", "두산");
		map2.put("player", dusan);
		
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("team", "NC");
		map3.put("player", nc);

		// Map의 배열의 생성
		Map[] kbo = { map1, map2, map3};
		for (Map map : kbo) {
			// 팀 이름 출력
			System.out.printf("%s\n", map.get("team"));
			// map에서 데이터를 가져와서 출력하지 않고 사용할 때는 원래의 자료형으로 형변환해서 사용
			String[] temp = (String[]) map.get("player");
			for (String imsi : temp) {
				System.out.printf("\t%s\n", imsi);
			}

		}

	}

}
