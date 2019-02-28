package Java0226;
// ��ȣ, ���̵�, ��й�ȣ, �̸�, ���̸� ���� �����ϴ� Ŭ����
public class VO implements Comparable<Object>{
	private int num;
	private String id;
	private String pw;
	private String name;
	private int age;
	
	public VO() {
		super();
	}
	// ������
	public VO(int num, String id, String pw, String name, int age) {
		super();
		this.num = num;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
	// ������ �޼ҵ�
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
	// ������� ���� �޼ҵ� : ����� ���� Ȯ���ϱ� ���� �޼ҵ�
	// ����ϴ� �޼ҵ忡 �ν��Ͻ� �̸��� �����ϸ� ȣ��Ǵ� �޼ҵ�
	@Override
	public String toString() {
		return "VO [num=" + num + ", id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
	}

	// ũ�� �񱳸� ���� �޼ҵ�
	// ������ �����Ͱ� �� ũ�� ���, 2���� �����Ͱ� �����ϸ� 0, ������ �����Ͱ� �� ������ ���� ����
	// �������� ���� - ���������� �ϰ����ϸ� ��ȣ�� �ݴ�� ����
	@Override
	public int compareTo(Object o) {
		// ObjectŸ���� �����͸� ����� ���� ������ �ڷ������� ����ȯ�ؼ� ���
		// ����� Ŭ������ VO�̹Ƿ� VOŸ������ �� ��ȯ
		VO other = (VO)o;
		// ���� �����ʹ� ������ �̿�
		// return other.age - this.age;//��������
		// return this.age - other.age;//��������
		// ���ڿ��� ������ �� ���� ���ڿ� ũ�⸦ ���ش� �޼ҵ� ���//compareTo
		return this.name.compareTo(other.name);
	}

}
