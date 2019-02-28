package Set;

public class PhoneNumber {

	// 연락처 정보를 하나로 모아서 저장하기 위한 클래스
	// 번호(int), 이름(String), 전화번호(String)
	private int num;
	private String name;
	private String phone;

	// 매개변수가 없는 생성자 - default constructor
	public PhoneNumber() {
		super();
	}

	// 매개변수가 있는 생성자
	public PhoneNumber(int num, String name, String phone) {
		super();
		this.num = num;
		this.name = name;
		this.phone = phone;
	}

	// 접근자 메소드 - getters & setters
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	// 디버깅을 위한 메소드 - toSting : 멤버의 모든값을 확인하기 위한 메소드
	@Override
	public String toString() {
		return "PhoneNumber [num=" + num + ", name=" + name + ", phonenumber=" + phone + "]";
	}

}
