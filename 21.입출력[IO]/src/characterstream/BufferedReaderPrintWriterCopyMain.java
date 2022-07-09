package characterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class BufferedReaderPrintWriterCopyMain {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new FileReader("죄와벌.txt"));
		PrintWriter pw=new PrintWriter(new FileWriter("죄와벌[LINENO].txt"));
		int lineNo=0;
		while(true) {
			String readLine=br.readLine();
			if(readLine==null)break;
			
			if(readLine.equals("")) {
				continue;
			}
			
			lineNo++;
			pw.println(lineNo+":"+readLine);
			
		}
		pw.flush();
		
		br.close();
		pw.close();
		System.out.println("----BufferedReaderPrintWriterCopy "+ lineNo+ " line copy-------");
		
	}

}
