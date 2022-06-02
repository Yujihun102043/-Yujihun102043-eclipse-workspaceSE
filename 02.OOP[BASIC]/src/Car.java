/*
 * class 선언
 *  - 형식
 *       접근제한자  class  클래스이름{
 *       	- 접근제한자:public,protected,없는거
 *       
 *       } 
 *       ex> public class Car{
 *           }
 *           
 *  -구성요소
 *     1.멤버변수선언(속성)
 *        접근제한자(public,proected,없는거,private) 타입 indentifier;
 *        ex> public String carName;
 *        
 *     2.멤버메쏘드 선언(행위)    
 *        접근제한자 리턴타입 메쏘드이름(매개변수선언){
 *           - 매개변수선언: 나를 호출한놈이 데이타를 넣어줄 통로
 *        	 - 리턴타입    : 나를 호출한놈에게 줄 데이타타입 
 *               void --> 줄데이타가 없는경우
 *        }
 *        ex> public int test(int a){
 *        	  	
 *            }
 */

public class Car {
	/*
	클래스의 구성요소
	   1. 멤버필드(변수)[속성] (차객체의 속성데이타를 저장할변수)
	   2. 멤버메쏘드[기능](차객체가 가지고있는 기능 )
	*/
	/*
	 * 멤버필드(변수)[속성]
	 */
	String no;	//차량번호
	int inTime;	//입차시간
	int outTime;//출차시간
	int fee;	//주차요금
	/*
	 * 멤버메쏘드[기능](차객체가 가지고있는 기능 )
	 */
	
	/*
	 *입차시데이타(번호,시간)대입 
	 */
	void setIpChaData(String no,int inTime) {
		this.no=no;
		this.inTime=inTime;
	}
	/*
	 * 출차시간 필드outTime에 출차시간데이타 대입(set)
	 */
	void setOutTime(int outTime) {
		this.outTime=outTime;
	}
	
	
	/*
	 * 요금계산
	 */
	void calculateFee() {
		this.fee =(this.outTime-this.inTime)*1000;
	}
	/*
	 * 헤더출력
	 */
	void headerPrint() {
		System.out.println("-----------------------------------");
		System.out.printf("%s %s %s %s\n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("-----------------------------------");
	}
	/*
	 * 차량정보출력
	 */
	void print() {
		
		System.out.printf("%7s %7d %9d %8d\n",this.no,this.inTime,this.outTime,this.fee);
	}
	
}




















