package nogeneric;
import java.util.ArrayList;

public class ObjectArrayMain {

	public static void main(String[] args) {

		System.out.println("--------Account-->Object형변환------------");
		Object o1 = new Account(1111, "BING", 3300, 0.5);
		Object o2 = new Account(2222, "KING", 2300, 0.1);
		Object o3 = new Account(3333, "KING", 5600, 0.2);
		Object o4 = new Account(4444, "YING", 8900, 0.5);
		Object o5 = new Account(5555, "SING", 9900, 0.8);

		Object[] objectTypeArray = new Object[5];
		objectTypeArray[0] = o1;
		objectTypeArray[1] = o2;
		objectTypeArray[2] = o3;
		objectTypeArray[3] = o4;
		objectTypeArray[4] = o5;

		for (int i = 0; i < objectTypeArray.length; i++) {
			Account tempAccount = (Account) objectTypeArray[i];
			tempAccount.print();
		}
		System.out.println("--------Car-->Object형변환------------");
		Object[] objectTypeArray2 = new Object[5];
		objectTypeArray2[0] = new Car("2343", 1);
		objectTypeArray2[1] = new Car("4542", 2);
		objectTypeArray2[2] = new Car("3882", 3);
		objectTypeArray2[3] = new Car("0892", 4);
		objectTypeArray2[4] = new Car("7711", 5);

		for (int i = 0; i < objectTypeArray2.length; i++) {
			Car tempCar = (Car) objectTypeArray2[i];
			tempCar.print();
		}

	}

}
