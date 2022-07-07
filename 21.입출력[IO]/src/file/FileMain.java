package file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		/*
		 * 현재경로[기준경로]
		 * 	eclipse --> C:\2022-05-JAVA-DEVELOPER\eclipse-workspaceSE\21.입출력[IO]
		 * 
		 * 상대(relative)경로
		 *		현재경로를 기준으로 경로를 기술
		 * 절대(absolute)경로
		 * 		C:, D: 드라이브를 기준으로 경로를 기술한다.
		 * 		- C:\2022-05-JAVA-DEVELOPER
		 * 		- D:\TOOL
		 */
		File file1 = new File("데미안.txt"); // 상대경로
		File file2 = new File("sample/JAVAAPI_URL.md"); // File은 파일 정보를 가지고 있는 객체일 뿐이다. 
		File file3 = new File("sample/subSample1/00.VariableDeclare.txt"); //파일 정보가 틀려도 읽는다.
		File file4 = new File("C:\\2022-05-JAVA-DEVELOPER\\eclipse-workspaceSE\\21.입출력[IO]\\sample\\자바문서생성시인코딩설정.txt");
		System.out.println("------1. file path[relative]-------");
		System.out.println(file1.getPath()); // 객체를 생성할 때 넣어준 경로를 그대로 반환한다.
		System.out.println(file2.getPath()); 
		System.out.println(file3.getPath());
		System.out.println(file4.getPath());
		System.out.println("------2.file absolute path------");
		System.out.println(file1.getAbsolutePath()); // 프로그램을 실행시킨 위치 정보도 함께 반환한다.
		System.out.println(file2.getAbsolutePath());
		System.out.println(file3.getAbsolutePath());
		System.out.println(file4.getAbsolutePath());
		System.out.println("------3.file name------");
		System.out.println(file1.getName()); //파일 이름을 출력한다.
		System.out.println(file2.getName());
		System.out.println(file3.getName());
		System.out.println(file4.getName());
		System.out.println("------4.file parent[directory]------");
		System.out.println(file1.getParent()); // 기준경로는 없다고 뜬다.
		System.out.println(file2.getParent()); // parent는 디렉토리를 출력한다.
		System.out.println(file3.getParent());
		System.out.println(file4.getParent());
		
		File dir1 = new File("sample");
		File dir2 = new File("sample/subSample1");
		File dir3 = new File("sample", "subSample2");
		System.out.println("------5. isDirectory, isFile------"); // 디렉토리인지 파일인지 알려줌
		System.out.println(dir1.isDirectory()); // 디렉토리가 맞다면 true
		System.out.println(dir2.isDirectory());
		System.out.println(dir3.isDirectory());
		
		System.out.println(dir1.isFile()); // 파일이 맞다면 true 틀리면 false
		System.out.println(dir2.isFile());
		System.out.println(dir3.isFile());
	}

}
