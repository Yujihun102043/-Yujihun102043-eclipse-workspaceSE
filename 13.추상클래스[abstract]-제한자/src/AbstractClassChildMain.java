
public class AbstractClassChildMain {

	public static void main(String[] args) {
		/*
		<< Cannot instantiate the type AbstractClass >>
		AbstractClass ac=new AbstractClass();
		*/
		System.out.println("----------------acc1----------------");
		AbstractClassChild acc1=new AbstractClassChild();
		acc1.method1();
		acc1.method2();
		
		System.out.println("----------------acc2----------------");
		AbstractClass acc2=new AbstractClassChild();
		acc2.method1();
		acc2.method2();
	}
}
