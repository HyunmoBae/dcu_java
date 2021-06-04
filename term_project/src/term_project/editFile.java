package term_project;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class editFile {
	static File fis = new File("C:\\Users\\BHM\\Desktop\\학생명부.txt");//열어볼 파일 경로입력
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		System.out.println("1.파일 출력하기 2.파일 자바로 불러오기 3.불러온파일 원본파일로 저장하기 4.파일 열기");
		System.out.println("메뉴를 선택하세요 : ");
		int num = scanner.nextInt();
		
		switch(num) {
		case 1 ://파일 경로를 입력해서 파일의 내용을 콘솔에 출력한다
			try(FileReader fis = new FileReader("C:\\Users\\BHM\\Desktop\\학생명부.txt")){
				int i;
				while((i=fis.read()) != -1) {
					System.out.print((char)i);
				}
				System.out.println();
			} catch (IOException e) {
				e.printStackTrace();
			}
		break;
		case 2 ://파일을 카피해서 자바로 txt문서를 만들어서 가져온뒤 txt문서를 열어서 편집한다.
		try(FileInputStream fis = new FileInputStream("C:\\Users\\BHM\\Desktop\\학생명부.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\BHM\\eclipse-workspace\\term_project\\src\\term_project\\copy.txt")){
			
		int i;
		while(( i = fis.read( ))!=-1){
			fos.write(i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일복사가 완료되었습니다. 복사한 파일을 열어서 편집하세요.");
		break;
		case 3 ://편집이 완료된 파일을 외부에 있는 파일로 복사해서 저장한다.
			try(FileInputStream fis = new FileInputStream("C:\\Users\\BHM\\eclipse-workspace\\term_project\\src\\term_project\\copy.txt");
			FileOutputStream fos = new FileOutputStream("C:\\Users\\BHM\\Desktop\\학생명부.txt")){
				
			int i;
			while(( i = fis.read( ))!=-1){
				fos.write(i);
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
			System.out.println("편집한 파일을 원본데이터에 저장시켰습니다.");
			break;
		case 4 ://외부에 있는 파일을 열어본다. 만약 파일이 없다면 만들어서 연다.
			try {
				if(fis.exists()) {
				Desktop.getDesktop().edit(fis);
				}
				else { //파일이 없으면 적어논 경로에 만들어서 연다
					fis.createNewFile();
					Desktop.getDesktop().edit(fis);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		default :
			System.out.println("다시 입력하세요");
			}
		}
	}
}
