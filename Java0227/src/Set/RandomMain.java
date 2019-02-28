package Set;

//import java.util.Random;
import java.util.StringTokenizer;

public class RandomMain {

	public static void main(String[] args) {
		/*
		// 인스턴스를 생성할 때 seed번호를 대입하면 일정한 패턴으로 숫자가 생성
		// seed번호를 대입하지않으면 정말 랜덤
		Random r = new Random();
		// nextInt는 정수 범위 내에서 랜덤한 숫자를 리턴
		// System.out.printf("%d\n", r.nextInt());

		int[] ar = { 1, 2, 3, 4, 5, 6, 2, 3, 4, 5, 6, 3, 4, 5, 6 };
		// nextInt(정수)는 정수로 나눈 나머지에서 랜덤하게 숫자를 리턴
		int len = ar.length;
		int su = r.nextInt(len);
		System.out.printf("%d\n", ar[su]);

		// 빨강, 파랑, 노랑, 초록 네가지 중 하나가 랜덤하게 나오도록 작성
		String[] colors = { "빨강", "파랑", "노랑", "초록" };
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("%s\n", colors[r.nextInt(colors.length)]);
		}
		*/
		
		StringTokenizer st = new StringTokenizer("죽는 날까지 하늘을 우러러 한점 부끄럼없기");
		// hashMoreTokens가 false를 리턴할때까지 반복
		// 데이터베이스에서 데이터를 가져와서 읽는 방법과 동일★★
		while(st.hasMoreTokens()){
			String e = st.nextToken();
			System.out.printf("%s\n", e);
		}

	}

}
