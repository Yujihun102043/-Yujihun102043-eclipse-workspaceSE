package characterstream;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class WebServerDataReadMain {

	public static void main(String[] args) throws Exception{
		String urlStr="https://aladin.co.kr/home/welcome.aspx";
		URL url=new URL(urlStr);
		InputStream in = url.openStream();
		while(true) {
			int readByte = in.read();
			if(readByte==-1)break;
			System.out.print((char)readByte);
		}
	}

}
