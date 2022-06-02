/*
      package 
      1. 관련있는(업무) 클래스의 모음(패키지)
      2. 패키지의 이름은 계층적으로 큰범위부터작은범위로구성  
      3. 클래스의 완전한이름은 패키지를 포함한이름이다. (외워야함)
      4. 이름충돌을 피하기위해서 
     ex> package samson.sds.chongmu;
	     public class Chongmu1{
		 
		 }
       
	  4.compile 방법 
			>javac -d . XXX.java  	
*/
public class PackageMain {

	public static void main(String[] args) {

		com.itwill.shop.ShopService shopService =
				new com.itwill.shop.ShopService();
		System.out.println(shopService);

		com.itwill.shop.member.Member m1 =
				new com.itwill.shop.member.Member();
		System.out.println(m1);

		com.itwill.shop.member.MemberService memberService =
				new com.itwill.shop.member.MemberService();
		System.out.println(memberService);
		System.out.println("-----com.itwill.shop.product.Product, com.itiwll.shop.product.ProductService-----");
		com.itwill.shop.product.Product product = 
				new com.itwill.shop.product.Product();
		System.out.println(product);
		
		com.itwill.shop.product.ProductService productService = 
				new com.itwill.shop.product.ProductService();
		System.out.println(productService);
		
		System.out.println("-----com.itwill.shop.admin.product, com.itwill.shop.admin.ProductService-----");
		com.itwill.shop.admin.Product adminProduct = 
				new com.itwill.shop.admin.Product();
		System.out.println(adminProduct);
		
		com.itwill.shop.admin.ProductService adminProductService = 
				new com.itwill.shop.admin.ProductService();
		System.out.println(adminProductService);

	}
}