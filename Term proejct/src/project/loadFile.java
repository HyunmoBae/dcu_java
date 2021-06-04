package project;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class loadFile {
	static File fis = new File("C:\\Users\\BHM\\Desktop\\read.txt");
	public static void main(String[] args) throws IOException {
		try {
			if(fis.exists()) {
			Desktop.getDesktop().edit(fis);
			}
			else {
				fis.createNewFile();
				Desktop.getDesktop().edit(fis);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		}
	}