import com.itwill.shop.ShopService;
/*
import com.itwill.shop.member.Member;
import com.itwill.shop.member.MemberService;
 */
import com.itwill.shop.member.*; // 사용하고자 하는 클래스들이 동일한 패키지 소속이면 *를 사용해서 패키지에 소속된 클래스들을 사용할 것을 알려준다.

import com.itwill.shop.product.Product;
/*
 * 패키지를 제외한 클래스 이름이 동일한 클래스는 import 불가능하다.
 * import com.itwill.shop.admin.Product;
 */
import com.itwill.shop.product.ProductService;

public class PackageImportMain {

	public static void main(String[] args) {
		ShopService shopService = new ShopService();	
		System.out.println(shopService);
		/*com.itwill.shop.ShopService shopService =
				new com.itwill.shop.ShopService();
		System.out.println(shopService);
		 */
		
		
		Member m1 = new Member();
		System.out.println(m1);
		/*
		com.itwill.shop.member.Member m1 =
				new com.itwill.shop.member.Member();
		System.out.println(m1);
		 */
		
		/* << 자동 import 단축키 >>
		 *     Ctrl + shift + o
		 */
		
		MemberService memberService = new MemberService();
		System.out.println(memberService);
		/*
		com.itwill.shop.member.MemberService memberService =
				new com.itwill.shop.member.MemberService();
		System.out.println(memberService);
		 */
		
		System.out.println("-----com.itwill.shop.product.Product, com.itiwll.shop.product.ProductService-----");
		
		Product product = new Product();
		System.out.println(product);
		/*
		com.itwill.shop.product.Product product = 
				new com.itwill.shop.product.Product();
		System.out.println(product);
		*/
		
		ProductService productService = new ProductService();
		System.out.println(productService);
		/*
		com.itwill.shop.product.ProductService productService = 
				new com.itwill.shop.product.ProductService();
		System.out.println(productService);
		*/
		
		System.out.println("-----com.itwill.shop.admin.product, com.itwill.shop.admin.ProductService-----");
		com.itwill.shop.admin.Product adminProduct = new com.itwill.shop.admin.Product();
		System.out.println(adminProduct);
		
		com.itwill.shop.admin.ProductService adminProductService = 
				new com.itwill.shop.admin.ProductService();
		System.out.println(adminProductService);

	}

}
