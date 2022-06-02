
public class Engine {
	private String type;
	private int cc;
	public Engine() {
	}
	/*
	 * 생성자생성단축키
	 * alt+shift+s --> o
	 */
	public Engine(String type, int cc) {
		
		this.type = type;
		this.cc = cc;
	}
	public void print() {
		System.out.println(this.type+"\t"+this.cc);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	
}
