package project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class saveFile {
	public static void main(String[] args) {
		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("C:\\Users\\BHM\\eclipse-workspace\\Term proejct\\copy.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\BHM\\Desktop\\read.txt")){
		millisecond = System.currentTimeMillis();
			
		int i;
		while(( i = fis.read( ))!=-1){
			fos.write(i);
		}
		millisecond = System.currentTimeMillis() - millisecond;
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일을 복사하는데 "+millisecond + " miliisecons 소요되었습니다");
	}
}
