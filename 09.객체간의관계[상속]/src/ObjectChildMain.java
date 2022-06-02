
public class ObjectChildMain {

	public static void main(String[] args) {
		ObjectChild oc1=new ObjectChild();
		int hashCode=oc1.hashCode();
		System.out.println(hashCode);
		System.out.println(Integer.toHexString(hashCode));
		String str1=oc1.toString();
		System.out.println(str1);
	}

}
