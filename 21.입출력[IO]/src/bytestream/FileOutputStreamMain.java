package bytestream;

import java.io.FileOutputStream;

/*
 * 
 * <<출력스트림(OutputStream)사용방법>>
 * 1. 데이타 목적지(target,destination) 선정(파일)
 * 2. 출력스트림(OutputStream)객체생성(FileOutputStream)
 * 3. 출력스트림(OutputStream)에 한바이트씩 쓴다(write)
 * 4. 출력스트림(OutputStream)닫는다.(close)
 * -- 타깃이 존재하지 않으면 알아서 만든다. 
 */
public class FileOutputStreamMain {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("fileOut.dat");
		/*
		 * 65 --> 00000000|00000000|00000000|01000001 비트열의 이동.
		 */
		fos.write(65
				); // int 타입 값을 넣는다.

		/*
		 * 66 --> 00000000|00000000|00000000|01000001 비트열의 이동.
		 */
		fos.write(66);
		/*
		 * 67 --> 00000000|00000000|00000000|01000011 비트열의 이동.
		 */
		fos.write(67);
		
		/*
		 * 2147483647 --> 00000000|00000000|00000000|11111111 비트열의 이동.
		 */
		fos.write(2147483647);
		/*
		 0 -- 00000000|00000000|00000000|00000000
		 
		 255 -- 00000000|00000000|00000000|11111111
		 */
		
		
		
		for(int i=0;i<256;i++) {
			fos.write(i);
		}
		
		// 결론 write 메소드는 한 바이트씩 보낸다. 00000000|00000000|00000000|11111111 맨 끝 11111111부분 자리만 보냄.
		
		
		fos.close(); // 연결객체를 닫아준다.
		// dat 파일은 저장하는 파일임.
		System.out.println("FileOutputStream.write()-->fileOut.dat");
		System.out.println();
	}

}
