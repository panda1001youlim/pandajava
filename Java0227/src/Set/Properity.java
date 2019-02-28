package Set;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properity {

	public static void main(String[] args) {
		// Properity저장을 위한 Properities인스턴스 생성
		Properties pro = new Properties();
		pro.setProperty("name", "아이린");
		pro.setProperty("job", "가수");
		pro.setProperty("hometown", "대구");
		
		
		try {
			pro.store(new FileOutputStream("C:\\Users\\503_09\\Desktop"), "irin");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
