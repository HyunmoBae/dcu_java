package term_project;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class editFile {
	static File fis = new File("C:\\Users\\BHM\\Desktop\\�л����.txt");//��� ���� ����Է�
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		System.out.println("1.���� ����ϱ� 2.���� �ڹٷ� �ҷ����� 3.�ҷ������� �������Ϸ� �����ϱ� 4.���� ����");
		System.out.println("�޴��� �����ϼ��� : ");
		int num = scanner.nextInt();
		
		switch(num) {
		case 1 :
			try(FileReader fis = new FileReader("C:\\Users\\BHM\\Desktop\\�л����.txt")){
				int i;
				while((i=fis.read()) != -1) {
					System.out.print((char)i);
				}
				System.out.println();
			} catch (IOException e) {
				e.printStackTrace();
			}
		break;
		case 2 :
		try(FileInputStream fis = new FileInputStream("C:\\Users\\BHM\\Desktop\\�л����.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\BHM\\eclipse-workspace\\term_project\\src\\term_project\\copy.txt")){
			
		int i;
		while(( i = fis.read( ))!=-1){
			fos.write(i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("���Ϻ��簡 �Ϸ�Ǿ����ϴ�. ������ ������ ��� �����ϼ���.");
		break;
		case 3 :
			try(FileInputStream fis = new FileInputStream("C:\\Users\\BHM\\eclipse-workspace\\term_project\\src\\term_project\\copy.txt");
			FileOutputStream fos = new FileOutputStream("C:\\Users\\BHM\\Desktop\\�л����.txt")){
				
			int i;
			while(( i = fis.read( ))!=-1){
				fos.write(i);
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
			System.out.println("������ ������ ���������Ϳ� ������׽��ϴ�.");
			break;
		case 4 :
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
			break;
			}
		}
	}
}