package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCalendarMain {

	public static void main(String[] args) throws Exception{
		/*
		 * java.util.Date
		 *  - The class Date represents a specific instant in time, with millisecond precision.
		 *    
		 */
		Date now=new Date();
		/*
		 * real os의 현재시간을가짐
		 */
		
		String nowString = now.toString();
		System.out.println(nowString);
		String korNowString = now.toLocaleString();
		System.out.println(korNowString);
		System.out.println("---시간저장형식---");
		long currentTimeMillis1 = now.getTime();
		System.out.println(currentTimeMillis1);
		/*
		 Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT
		 represented by this date 
		 */
		
		long currentTimeMillis2 = new Date().getTime();
		System.out.println(currentTimeMillis2);
		long duration = currentTimeMillis2-currentTimeMillis1;
		System.out.println(duration+ " ms took.. ");
		
		System.out.println("-------------SimpleDateFormat[Data-->String]-----------");
		/*
		 * SimpleDateFormat :Data객체의 시간을 문자열로변경해주는클래스
		 */
		
		Date today=new Date();
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy 년 MM 월 dd 일");
		String formatStr1 = sdf1.format(today);
		System.out.println(formatStr1);
		
		sdf1.applyPattern("yyyy/MM/dd HH:mm:ss.SSSS");
		String formatStr2=sdf1.format(today);
		System.out.println(formatStr2);
		
		sdf1.applyPattern("yyyy");
		String yearStr = sdf1.format(today);
		System.out.println(yearStr);
		
		
		System.out.println("-------------SimpleDateFormat[String-->Date]-----------");
		SimpleDateFormat sdf2=new SimpleDateFormat();
		sdf2.applyPattern("yyyy-MM-dd");
		Date myBirthDay=sdf2.parse("2000-06-12");
		System.out.println(myBirthDay.toString());
		System.out.println("myBirthDay:"+myBirthDay.getTime());
		
		
		sdf2.applyPattern("yyyy/MM/dd HH:mm:ss");
		Date yourBirthDay = sdf2.parse("2000/03/03 04:24:19");
		System.out.println(yourBirthDay.toString());
		System.out.println("yourBitrhDay:"+yourBirthDay.getTime());
		
		
		System.out.println("--------------Date객체메쏘드-----------");
		Date date1=new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-10");
		Date date2=new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-10");
		Date date3=new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-11");
		System.out.println("equals:"+date1.equals(date2));
		System.out.println("equals:"+date1.equals(date3));
		System.out.println("compareTo:"+date1.compareTo(date2));
		System.out.println("compareTo:"+date1.compareTo(date3));
		System.out.println("compareTo:"+date3.compareTo(date1));
		long gapMiliSec = date3.getTime()-date1.getTime();
		System.out.println("gapMiliSec:"+gapMiliSec);
		System.out.println("min:"+gapMiliSec/1000/60);
		System.out.println("hour:"+gapMiliSec/1000/60/60);
		System.out.println("day:"+gapMiliSec/1000/60/60/24);
		System.out.println("------------java.util.Date --> java.sql.Date-------------------");
		Date utilDate1=new Date();
		Date utilDate2=new Date(System.currentTimeMillis());
		System.out.println(utilDate1);
		System.out.println(utilDate2);
		
		java.sql.Date utilDate1ToSqlDate1=new java.sql.Date(utilDate1.getTime());
		java.sql.Date utilDate2ToSqlDate2=new java.sql.Date(utilDate2.getTime());
		System.out.println(utilDate1ToSqlDate1);
		System.out.println(utilDate2ToSqlDate2);
		
		System.out.println("------------java.sql.Date --> java.util.Date-------------------");
		java.sql.Date sqlDate1=new java.sql.Date(System.currentTimeMillis());
		java.sql.Date sqlDate2=java.sql.Date.valueOf("2022-07-27");
		System.out.println(sqlDate1);
		System.out.println(sqlDate2);
		/*
		Date sqlDate1ToUtilDate1 = sqlDate1;
		Date sqlDate1ToUtilDate2 = sqlDate2;
		*/
		
		Date sqlDate1ToUtilDate1 = new Date(sqlDate1.getTime());
		Date sqlDate1ToUtilDate2 = new Date(sqlDate2.getTime());
		System.out.println(sqlDate1ToUtilDate1);
		System.out.println(sqlDate1ToUtilDate2);
		
	}

}
