package Java;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {//버퍼 사용여부에 따른 성능비교
	public static void main(String[] args) throws Exception{
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream(
				"C:\\Users\\juni3\\Desktop\\병원 로그인.png");
		start = System.currentTimeMillis();
		while(fis1.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("사용하지 않았을 때: "+(end-start)+"ms");
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream(
				"C:\\Users\\juni3\\Desktop\\병원 로그인.png");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while(fis2.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("사용했을 때: "+(end-start)+"ms");
		bis.close();
		fis2.close();
	}

}
