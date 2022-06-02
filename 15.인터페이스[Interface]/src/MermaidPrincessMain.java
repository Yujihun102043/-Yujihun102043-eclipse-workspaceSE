
public class MermaidPrincessMain {

	public static void main(String[] args) {
		System.out.println("-----------MermaidPrincess------");
		MermaidPrincess mp=new MermaidPrincess();
		mp.speak();
		mp.think();
		mp.fastSwim();
		mp.liveSea();
		System.out.println("-----------Mermaid------------");
		Mermaid m=null;
		m=mp;
		m.fastSwim();
		m.liveSea();
		System.out.println("-----------Princess------------");
		Princess p=mp;
		p.speak();
		p.think();
		System.out.println("-------Princess<-->Mermaid------------");
		Mermaid m2 =(Mermaid)p;
		m2.fastSwim();
		m2.liveSea();
	}

}
