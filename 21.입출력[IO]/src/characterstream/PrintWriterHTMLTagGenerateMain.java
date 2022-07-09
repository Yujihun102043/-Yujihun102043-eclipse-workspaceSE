package characterstream;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterHTMLTagGenerateMain {

	public static void main(String[] args) throws Exception{
		PrintWriter out=new PrintWriter(new FileWriter("hello.html"));
		out.println("<html>");
		out.println("<head>");
		out.println("<title>나의HTML</title>");
		out.println("</head>");
		out.println("<body>");
		for(int i=0;i<1000;i++) {
			out.println("<h1>안녕 HTML["+i+"]</h1><hr>");
		}
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
		System.out.println("PrintWriter-->hello.html");

	}

}
