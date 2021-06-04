package project;

import java.io.FileReader;
import java.io.IOException;

public class printFile {

	public static void main(String[] args) {
		
		try(FileReader fis = new FileReader("C:\\Users\\BHM\\Desktop\\read.txt")){
			int i;
			while((i=fis.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
