package Java;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\juni3\\Desktop\\JPA-Study\\jex01\\Java\\src\\Java\\FileInputStreamExample.java");
			int data;
			while((data = fis.read() )!= -1) {
				System.out.write(data);
			}
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
