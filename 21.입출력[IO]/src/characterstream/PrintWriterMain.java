package characterstream;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterMain {

	public static void main(String[] args) throws Exception{
		PrintWriter pw=new PrintWriter(new FileWriter("printWriter.txt"));
		
		pw.write(65);
		pw.println();
		pw.print(65);
		pw.println();
		//pw.write(54);
		//pw.write(53);
		pw.write(45345);
		pw.println();
		pw.print(45345);
		pw.println();
		boolean b=true;
		pw.print(b);
		pw.println();
		pw.write('t');
		pw.write('r');
		pw.write('u');
		pw.write('e');
		pw.println();
		pw.println("------------------");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("</head>");
		pw.println("<body>");
		for(int i=0;i<5;i++) {
			pw.println("<h1>");
			pw.println("안녕 !!! HTML"+i);
			pw.println("</h1>");
		}
		pw.println("</body>");
		pw.println("</html>");
		pw.println(0.125412);
		pw.println(true);
		pw.println('X');
		pw.println();
		pw.println();
		pw.println();
		
		
		
		pw.flush();
		pw.close();
		
		System.out.println("--------PrintWriter.print --> printWriter.txt -----------");
		
		
		
		
		
		
		
		
	
	}

}
