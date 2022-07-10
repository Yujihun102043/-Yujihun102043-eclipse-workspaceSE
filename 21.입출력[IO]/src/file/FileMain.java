package file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) throws Exception {
		/*
		 * 현재경로[기준경로]
		 *   eclipse --> C:\2022-05-JAVA-DEVELOPER\eclipse-workspaceSE\21.입출력[IO]
		 *   
		 * 상대(relative)경로
		 *    현재경로를 기준으로 경로를 기술
		 * 절대(absolute)경로 
		 *    C:,D: 드라이브를 기준으로 경로기술
		 *     - C:\2022-05-JAVA-DEVELOPER
		 *     - D:\TOOL
		 */
		File file1 = new File("데미안.txt");
		File file2 = new File("sample/JAVAAPI_URL.md");
		File file3 = new File("sample/subSample1/00.VariableDeclare.txt");
		File file4 = new File("C:/2022-05-JAVA-DEVELOPER/eclipse-workspaceSE/21.입출력[IO]/sample/자바문서생성시인코딩설정.txt");
		System.out.println("-------1.file path[relative]------");
		System.out.println(file1.getPath());
		System.out.println(file2.getPath());
		System.out.println(file3.getPath());
		System.out.println(file4.getPath());
		System.out.println("------2.file absolute path-----");
		System.out.println(file1.getAbsolutePath());
		System.out.println(file2.getAbsolutePath());
		System.out.println(file3.getAbsolutePath());
		System.out.println(file4.getAbsolutePath());
		System.out.println("------3.file name-----");
		System.out.println(file1.getName());
		System.out.println(file2.getName());
		System.out.println(file3.getName());
		System.out.println(file4.getName());
		System.out.println("------4.file parent[directory]-----");
		System.out.println(file1.getParent());
		System.out.println(file2.getParent());
		System.out.println(file3.getParent());
		System.out.println(file4.getParent());

		File dir1 = new File("sample");
		File dir2 = new File("sample/subSample1");
		File dir3 = new File("sample", "subSample2");
		System.out.println("-----5.isDirectory,isFile------");
		System.out.println(dir1.isDirectory());
		System.out.println(dir2.isDirectory());
		System.out.println(dir3.isDirectory());

		System.out.println(dir1.isFile());
		System.out.println(dir2.isFile());
		System.out.println(dir3.isFile());

		System.out.println("-------6.디렉토리안에 파일(디렉토리)목록(String[])-------");
		String[] fileNameList = dir1.list();
		for (String fileName : fileNameList) {
			System.out.println(fileName);
		}
		System.out.println("-------7.디렉토리안에 파일(디렉토리)목록(File[])---------");
		File[] fileList = dir1.listFiles();
		for (File file : fileList) {
			if (file.isDirectory()) {
				System.out.println("\tD:" + file.getName());
				File[] subFileList = file.listFiles();
				for (File subFile : subFileList) {
					System.out.println("\t\t" + subFile.getName());
				}
			} else {
				System.out.println("\tF:" + file.getName());
			}
		}
		System.out.println("------8. root directory목록-------");
		File[] rootDriveFileList = File.listRoots();
		for (File rootFile : rootDriveFileList) {
			System.out.println(rootFile.getPath());
		}
		System.out.println("------9.c:/ 파일목록출력");
		
		File cDrive = rootDriveFileList[0];
		File[] cDriveFileList=cDrive.listFiles();
		for(File file:cDriveFileList) {
			System.out.println(file.getName());
		}
		System.out.println("------10.directory생성--------");
		File newDir1=new File("newDir1");
		File newDir2=new File("newDir2");
		File newDir3=new File("sample","subSample3");
		File newDir4=new File("C:/2022-05-JAVA-DEVELOPER/newDir4");
		
		System.out.println("newDir1의존재여부:"+newDir1.exists());
		System.out.println("newDir2의존재여부:"+newDir2.exists());
		System.out.println("newDir3의존재여부:"+newDir3.exists());
		System.out.println("newDir4의존재여부:"+newDir4.exists());
		
		System.out.println("newDir1의생성여부:"+newDir1.mkdir());
		System.out.println("newDir2의생성여부:"+newDir2.mkdir());
		System.out.println("newDir3의생성여부:"+newDir3.mkdir());
		System.out.println("newDir4의생성여부:"+newDir4.mkdir());
		System.out.println("------11.directory이름변경--------");
		newDir2.renameTo(new File("renameDir2"));
		System.out.println("------12.directory삭제--------");
		System.out.println("newDir3의삭제여부:"+newDir3.delete());
		System.out.println("------13.파일생성,삭제,이름변경--------");
		File newFile1=new File("newDir1","newFile1.txt");
		File newFile2=new File("newDir1","newFile2.txt");
		File newFile3=new File("C:/2022-05-JAVA-DEVELOPER/newDir4/newFile3.txt");
		
		System.out.println("newFile1생성여부:"+newFile1.createNewFile());
		System.out.println("newFile2생성여부:"+newFile2.createNewFile());
		System.out.println("newFile3생성여부:"+newFile3.createNewFile());
		
		System.out.println("newFile1삭제여부:"+newFile1.delete());
		
		
	}
}
