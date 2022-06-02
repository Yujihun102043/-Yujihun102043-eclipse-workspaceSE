/*
 * 난 절대로 자식클래스타입을 사용안할래요
 * 난 부모타입[GajunVolume,GajunOnOff]만사용할래요
 * 그래야 가전제품검사 프로그램을 한번만들어서 변경없이 
 *   계속사용할수있으니까요
 */
public class GajunGumsa {
	/*
	private GajunAudio[] gajuns1;
	private GajunTV[] gajuns2;
	private GajunSmartPhone[] gajuns3;
	*/
	private GajunOnOff[] gajuns;
	
	public GajunGumsa() {
		// TODO Auto-generated constructor stub
	}
	public GajunGumsa(GajunOnOff[] gajuns) {
		super();
		this.gajuns = gajuns;
	}
	

	public GajunOnOff[] getGajuns() {
		return gajuns;
	}
	public void setGajuns(GajunOnOff[] gajuns) {
		this.gajuns=gajuns;
	}
	public void gumsa() {
		for (int i = 0; i < gajuns.length; i++) {
			
			gajuns[i].on();
			GajunVolume tempGajun=(GajunVolume)gajuns[i];
			tempGajun.volumeUp();
			tempGajun.volumeDown();
			gajuns[i].off();
			System.out.println("----검사끝 출고----");
		}
	}
	
}
