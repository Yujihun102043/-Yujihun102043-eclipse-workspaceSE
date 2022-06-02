import com.itwill.shop.ShopService;
/*
import com.itwill.shop.member.Member;
import com.itwill.shop.member.MemberService;
*/
import com.itwill.shop.member.*;
import com.itwill.shop.product.Product;
/*
<< The import com.itwill.shop.admin.Product collides with another import statement >>
import com.itwill.shop.admin.Product;
패키지를 제외한 클래스이름이 동일한 클래스는 import불가능하다.
*/
import com.itwill.shop.product.ProductService;
public class PackageImportMain {
	public static void main(String[] args) {
		ShopService shopService = new ShopService();
		System.out.println(shopService);
		
		Member m1 = new Member();
		System.out.println(m1);
		/* << 자동 import 단축키 >>
		 	  ctrl + shift + o
		 */
		MemberService memberService = new MemberService();
		System.out.println(memberService);
		
		System.out.println("-----com.itwill.shop.product.Product,com.itwill.shop.product.ProductService------");
		Product product = new Product();
		System.out.println(product);

		ProductService productService = new ProductService();
		System.out.println(productService);
		System.out.println("-----com.itwill.shop.admin.Product,com.itwill.shop.admin.ProductService--------");
		com.itwill.shop.admin.Product adminProduct = new com.itwill.shop.admin.Product();
		System.out.println(adminProduct);
		com.itwill.shop.admin.ProductService adminProductService = new com.itwill.shop.admin.ProductService();
		System.out.println(adminProductService);
		

	}

}
