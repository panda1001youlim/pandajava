package Set;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properity {

	public static void main(String[] args) {
		// Properity������ ���� Properities�ν��Ͻ� ����
		Properties pro = new Properties();
		pro.setProperty("name", "���̸�");
		pro.setProperty("job", "����");
		pro.setProperty("hometown", "�뱸");
		
		
		try {
			pro.store(new FileOutputStream("C:\\Users\\503_09\\Desktop"), "irin");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
