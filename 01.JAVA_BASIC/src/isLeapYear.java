
public class isLeapYear {

	public static void main(String[] args) {

		/*
		 * Quiz: 윤년여부판단
		 *    - 4의배수(4로나누어떨어지는수)이면서 100의배수가아닌수(100로나누어떨어지는않는수) 이거나
		 *    - 400의배수(400로나누어떨어지는수)
		 */
		
		System.out.println("---윤년여부판단---");
		int year = 2022 , year1 = 2000;
		boolean isLeapYear;
		
		
		boolean isMultiple4 = year%4 == 0; // 나누어 떨어지면 나머지가 0 이라서 true
		boolean isMultiple100 = year%100 != 0; // 나누어 떨어지지 않으면  true
		boolean isMultiple400 = year%400 == 0; // 나누어 떨어지면 나머지가 0 이라서 true
		
		
		isLeapYear = (isMultiple4 && isMultiple100) || isMultiple400;
		
		
		System.out.println(year+ " 의 윤년여부 : "+isLeapYear);

		isMultiple4 = year1%4 == 0; // 나누어 떨어지면 나머지가 0 이라서 true
		isMultiple100 = year1%100 != 0; // 나누어 떨어지지 않으면  true
		isMultiple400 = year1%400 == 0; // 나누어 떨어지면 나머지가 0 이라서 true
		
		isLeapYear = (isMultiple4 && isMultiple100) || isMultiple400;
	
		System.out.println(year1+ " 의 윤년여부 : "+isLeapYear);
	}

}
