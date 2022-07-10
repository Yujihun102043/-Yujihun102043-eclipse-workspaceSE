package characterstream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterReaderMain {

	public static void main(String[] args)throws Exception {
		//FileWriter fw=new FileWriter(new File("fileWriter.txt"));
		FileWriter fw=new FileWriter("fileWriter.txt");
		/*
		 public void write(int c) throws IOException;
		  - Writes a single character. 
		  - The character to be written is contained in the 16 low-order bits 
		    of the given integer value; the 16 high-order bits are ignored.
		 */
		
		fw.write(44356);
		fw.write('A');
		fw.write('김');
		/*
		 * 버퍼에남아있는 데이타를 출력스트림에쓴다.
		 */
		for(int i=0;i<65536;i++) {
			fw.write(i);
			if(i%100==0)
				fw.write('\n');
		}
		fw.write('\n');
		fw.write("문자열을 맘대로 막써요!!!!");
		fw.write('\n');
		/**************************************
		String str="문자열을 맘대로 막써요!!!!";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			fw.write(c);
		}
		fw.write('\n');
		************************************/
		fw.write("한라인");
		fw.write("\n");
		fw.write("두라인\n");
		fw.write("세라인\n");
		fw.flush();
		fw.close();
		System.out.println("FileWriter.write() -->fileWriter.txt");
		
		System.out.println("FileReader.read() <--- fileWriter.txt");
		
		FileReader fr=new FileReader("fileWriter.txt");
		/*
		public int read() throws IOException;
			- Reads a single character. 
			- This method will block until a character is available, 
			   an I/O error occurs, or the end of the stream is reached.

			Returns:
				The character read, as an integer in the range 0 to 65535 (0x00-0xffff),
				 or -1 if the end of the stream has been reached
		 */
		
		
		int readChar = fr.read();
		System.out.println("1.readChar:"+(char)readChar);
		readChar=fr.read();
		System.out.println("2.readChar:"+(char)readChar);
		int charCount=0;
		int lineCount=0;
		while(true) {
			readChar=fr.read();
			if(readChar==-1)break;
			charCount++;
			if(readChar=='\n') {
				lineCount++;
			}
			System.out.print((char)readChar);
			
		}
		fr.close();
		System.out.println();
		System.out.println(charCount+ " 문자 읽음");
		System.out.println(lineCount+ " 라인 읽음");
		
		
		
		
		
	}

}
