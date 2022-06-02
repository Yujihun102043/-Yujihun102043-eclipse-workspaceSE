import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.sql.Connection;

import com.itwill.shop.ShopService;
import com.itwill.shop.member.Member;
import com.itwill.shop.product.Product;

/*
import java.lang.String;
java.lang package에있는 클래스들은 import 구문생략가능
*/
public class JavaClassImportMain {

	public static void main(String[] args) {
		/*
		 * java.lang package에있는 클래스들은 import 구문생략가능
		 */
		java.lang.String str1 = "임포트";
		String str2 = "김경호";
		Object obj = new Object();
		System.out.println(Math.random());
		/*
		 * import 단축키
		 *  ctrl + shift + o
		 *  
		 *  ctrl + space -->클래스리스트-->클래스선택-->import 구문추가
		 */

		InputStream in;
		OutputStream out;
		Socket socket;

		Connection con;

		ShopService shopService;
		Member member;
		Product p;

	}

}
