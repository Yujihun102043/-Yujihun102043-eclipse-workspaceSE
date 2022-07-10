package bytestream;

import java.io.FileInputStream;

/*
 * <<입력스트림(InputStream)사용방법>>
 * 1. 데이타 source 선정(파일) -- 데이터 소스에 빨대를 꽂는다.
 * 2. 입력스트림(InputStream)객체생성(FileInputStream)
 * 3. 입력스트림(InputStream)으로부터 한바이트씩  읽는다(read) -- int 타입으로 읽는다?
 * 4. 입력스트림(InputStream)닫는다.(close) 
 */
public class FileInputStreamain {

	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("fileOut.dat"); // 
		
		int readByte = fis.read();
		System.out.println("1.byte:"+Integer.toBinaryString(readByte));
		
		readByte = fis.read();
		System.out.println("2.byte:"+Integer.toBinaryString(readByte));
		readByte = fis.read();
		System.out.println("3.byte:"+Integer.toBinaryString(readByte));
		// 파일을 처음부터 다시 읽으려면 빨대를 다시꽂아야함. 선입선출에 의거
		int byteCount = 0;
		while(true) {
			readByte = fis.read();
			if(readByte == -1) {
				break;
			}
			byteCount++;	
			System.out.println(Integer.toBinaryString(readByte));
		}
		System.out.println("FileInputStream.read()<---fileOut.date:"+byteCount+"바이트 읽음");
		fis.close();
		
		// 지금 출력하는 0~255의 숫자들은 자료의 구성요소다.
		// 파일의 끝은 -1이다.
		
	}

}
