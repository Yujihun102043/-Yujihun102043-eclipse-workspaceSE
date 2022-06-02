/*
 * 객체간의 관계
 * Car  has a no(int)   
 * Car  has a model(String)
 * Car  has a engine(Engine)
 */
public class Car {
	private int no;//차량번호
	private String model;//차량모델명
	private Engine engine;//차량엔진객체주소를 저장할멤버필드
	public Car() {
	}
	public Car(int  no,String model,Engine engine) {
		this.no=no;
		this.model=model;
		this.engine=engine;
	}
	public void print() {
		//System.out.print(this.no+"\t"+this.model+"\t"+this.engine.getType()+"\t"+this.engine.getCc());
		System.out.print(this.no+"\t"+this.model+"\t");
		this.engine.print();
		return;
	}
	//setter,getter
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	public Engine getEngine() {
		return this.engine;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
}
