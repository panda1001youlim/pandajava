package Java0226;
// 번호, 아이디, 비밀번호, 이름, 나이를 같이 저장하는 클래스
public class VO implements Comparable<Object>{
	private int num;
	private String id;
	private String pw;
	private String name;
	private int age;
	
	public VO() {
		super();
	}
	// 생성자
	public VO(int num, String id, String pw, String name, int age) {
		super();
		this.num = num;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
	// 접근자 메소드
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// 디버깅을 위한 메소드 : 멤버의 값을 확인하기 편리한 메소드
	// 출력하는 메소드에 인스턴스 이름만 대입하면 호출되는 메소드
	@Override
	public String toString() {
		return "VO [num=" + num + ", id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
	}

	// 크기 비교를 위한 메소드
	// 앞쪽의 데이터가 더 크면 양수, 2개의 데이터가 동일하면 0, 앞쪽의 데이터가 더 작으면 음수 리턴
	// 오름차순 정렬 - 내림차순을 하고자하면 부호를 반대로 리턴
	@Override
	public int compareTo(Object o) {
		// Object타입의 데이터를 사용할 때는 원래의 자료형으로 형변환해서 사용
		// 여기는 클래스가 VO이므로 VO타입으로 형 변환
		VO other = (VO)o;
		// 숫자 데이터는 뺄셈을 이용
		// return other.age - this.age;//내림차순
		// return this.age - other.age;//오름차순
		// 문자열을 가지고 할 때는 문자열 크기를 비교해는 메소드 사용//compareTo
		return this.name.compareTo(other.name);
	}

}
