package Hackthonprograms;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Calendar;


public class StringProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Sample Input");
		String s1=sc.next();
		try {
		DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
		
		getNoOfDaysInMonth(df,df.parse(s1));
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
		
		
 }
	public static void getNoOfDaysInMonth(DateFormat df,Date date) {
		Calendar cal=Calendar.getInstance();
		//System.out.println(cal);
		cal.setTime(date);
		System.out.println("The no. of days in a Month: ");
		System.out.println(cal.getActualMaximum(Calendar.DATE));
	}
	
	

}
