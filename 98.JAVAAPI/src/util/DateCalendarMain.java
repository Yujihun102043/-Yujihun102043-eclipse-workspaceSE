package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCalendarMain {

	public static void main(String[] args) throws Exception {
		/*
		 * java.util.Date
		 */
		Date now = new Date();
		/*
		 * real os 의 현재시간을 가짐
		 */

		String nowString = now.toString(); //toString = 객체가 가지고 있는 정보나 값들을 문자열로 리턴.
		System.out.println(nowString);

		String korNowString = now.toLocaleString(); //toLocaleString = 현재 날짜와 시간을 출력하는 메소드.
		System.out.println(korNowString);

		System.out.println("---시간저장형식---");
		now.getTime(); // getTime = 1970년 1월 1일 0시0분0초로부터 시간을 1/1000초 단위로 반환한다. > 써먹으려면 x1000해서 계산하는게 편함.

		long currentTimeMillis1 = now.getTime();
		System.out.println(currentTimeMillis1);

		long currentTimeMillis2 = new Date().getTime();
		System.out.println(currentTimeMillis2);

		long duration = currentTimeMillis2 - currentTimeMillis1;
		System.out.println(duration + "ms took.. ");

		System.out.println("----------simpleDateFormat[Data-->String]----------");
		/*
		 * SimpleDateFormat : Data객체의 시간을 문자열로 변경해주는 클래스
		 */
		Date today = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy 년 mm 월 dd 일");
		String formatStr1 = sdf1.format(today);
		System.out.println(formatStr1);

		sdf1.applyPattern("yyyy/MM/dd HH:mm:ss.SSSS");
		String formatStr2 = sdf1.format(today);
		System.out.println(formatStr2);

		sdf1.applyPattern("yyyy");
		String yearStr = sdf1.format(today);
		System.out.println(yearStr);

		System.out.println("----------simpleDateFormat[String --> Date]----------");
		SimpleDateFormat sdf2 = new SimpleDateFormat();
		sdf2.applyPattern("yyyy-MM-dd");
		Date myBirthDay = sdf2.parse("2000-06-12");
		System.out.println(myBirthDay.toString());
		System.out.println("myBirthDay:" + myBirthDay.getTime());

		sdf2.applyPattern("yyyy/MM/dd HH:mm:ss");
		Date yourBirthDay = sdf2.parse("2000/03/03 04:24:19");
		System.out.println(yourBirthDay.toString());
		System.out.println("yourBirthDay:" + yourBirthDay.getTime());
		
		System.out.println("----------Date객체메소드----------");
		Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-10");
		Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-10");
		Date date3 = new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-11");
		
		System.out.println("equals:"+date1.equals(2));
		System.out.println("equals:"+date1.equals(3));
		
		System.out.println("compareTo:"+date1.compareTo(date2));
		System.out.println("compareTo:"+date1.compareTo(date3));
		System.out.println("compareTo:"+date3.compareTo(date1));
		long gapMiliSec = date3.getTime()-date1.getTime();
		System.out.println("gapMiliSec:"+gapMiliSec);
		System.out.println("min:"+gapMiliSec/1000/60);
		System.out.println("hour:"+gapMiliSec/1000/60/60);
		System.out.println("day:"+gapMiliSec/1000/60/60/24);
		
		System.out.println("----------java.util.Date --> java.sql.Date----------");
		Date utilDate1 = new Date();
		Date utilDate2 = new Date(System.currentTimeMillis());
		System.out.println(utilDate1);
		System.out.println(utilDate2);
		
		java.sql.Date utilDate1TosqlDate1 = new java.sql.Date(utilDate1.getTime());
		java.sql.Date utilDate2TosqlDate2 = new java.sql.Date(utilDate2.getTime());
		System.out.println(utilDate1TosqlDate1);
		System.out.println(utilDate2TosqlDate2);
		
		System.out.println("----------java.sql.Date --> java.util.Date----------");
		java.sql.Date sqlDate1 = new java.sql.Date(System.currentTimeMillis());
		java.sql.Date sqlDate2 = java.sql.Date.valueOf("2022-06-27");
		
		System.out.println(sqlDate1);
		System.out.println(sqlDate2);
		/*
		Date sqlDate1ToUtilDate1 = sqlDate1;
		Date sqlDate1ToUtilDate2 = sqlDate2;
		*/
		
		Date sqlDate1ToUtilDate1 = new Date(sqlDate1.getTime());
		Date sqlDate2ToUtilDate2 = new Date(sqlDate2.getTime());
		System.out.println(sqlDate1ToUtilDate1);
		System.out.println(sqlDate2ToUtilDate2);
		
		
	}
}
