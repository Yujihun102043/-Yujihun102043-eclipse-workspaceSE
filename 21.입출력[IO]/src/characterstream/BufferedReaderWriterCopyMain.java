package characterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderWriterCopyMain {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new FileReader("죄와벌.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("죄와벌[LINENO].txt"));
		int lineNo=0;
		while(true) {
			String readLine=br.readLine();
			if(readLine==null)break;
			
			if(readLine.equals("")) {
				continue;
			}
			
			lineNo++;
			bw.write(lineNo+":"+readLine);
			bw.newLine();
		}
		bw.flush();
		
		br.close();
		bw.close();
		System.out.println("----BufferedReaderWriterCopy "+ lineNo+ " line copy-------");
		
	}

}
