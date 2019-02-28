package Set;

public class PhoneNumber {

	// ����ó ������ �ϳ��� ��Ƽ� �����ϱ� ���� Ŭ����
	// ��ȣ(int), �̸�(String), ��ȭ��ȣ(String)
	private int num;
	private String name;
	private String phone;

	// �Ű������� ���� ������ - default constructor
	public PhoneNumber() {
		super();
	}

	// �Ű������� �ִ� ������
	public PhoneNumber(int num, String name, String phone) {
		super();
		this.num = num;
		this.name = name;
		this.phone = phone;
	}

	// ������ �޼ҵ� - getters & setters
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

	// ������� ���� �޼ҵ� - toSting : ����� ��簪�� Ȯ���ϱ� ���� �޼ҵ�
	@Override
	public String toString() {
		return "PhoneNumber [num=" + num + ", name=" + name + ", phonenumber=" + phone + "]";
	}

}
