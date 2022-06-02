
public class Car {
	/*
	 * 차량의생산대수를 저장할 정적(클래스,static,공용)변수
	 */
	/**
	 * 차량의생산대수를 저장할 정적(클래스,static,공용)변수
	 */
	public  static int count;
	
	private int no;//차량번호
	private String model;//모델명
	private String color;//차색상
	
	public Car(int no, String model, String color) {
		this.no = no;
		this.model = model;
		this.color = color;
		//Car.count=Car.count+1;
		Car.count++;
	}
	/**
	 * 헤더프린트
	 */
	public static void headerPrint() {
		/*
		 * this사용불가능
		 */
		System.out.println("--------------------");
		System.out.println("번호 \t  모델 \t 색상");
		System.out.println("--------------------");
	}
	
	public void print() {
		
		System.out.println(this.no+"\t"+this.model+"\t"+this.color);
	}
	
	
	/*
	 * 정적변수 count get,set
	 */
	/*
	public static int getCount() {
		return Car.count;
	}
	public static void setCount(int count) {
		Car.count=count;
	}
	*/
	
	
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
