package generic;

public class MyArrayList<T> {
	private int size;
	private Object[] elementData;
	public MyArrayList() {
		elementData = new Object[10];
		size=0;
	}
	
	public void add(T element) {
		elementData[size]=element;
		size++;
	}
	public int size() {
		return size;
	}
	public T get(int index) {
		return (T)elementData[index];
		
	}
	
	

}
