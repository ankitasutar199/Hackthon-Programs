package Hackthonprograms;

import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Date_Format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="05-12-1987";
		String s2="08-11-2010";
		
		try {
		DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("The older one is : ");
		compareDatesByCompareTo(df, df.parse(s1) , df.parse(s2));
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
		}
		
		public static void compareDatesByCompareTo(DateFormat df, Date oldDate, Date newDate)
		{
			DateFormat df1=new SimpleDateFormat("MM-dd-yyyy");
			
			if(oldDate.compareTo(newDate) == 0) {
				System.out.println(df1.format(oldDate) +"is equal" +df1.format(newDate));
				}
			
			if(oldDate.compareTo(newDate) < 0) {
				System.out.println(df1.format(oldDate) +"  is older");
				}
			if(oldDate.compareTo(newDate) > 0) {
				System.out.println(df1.format(newDate) +"  is newer");
				
			}
			
			
		}
}



/*Scanner sc=new Scanner(System.in);
String str1;
String str2;
str1="05-12-1987";
str2="08-11-2010";
try {
	Date start=new SimpleDateFormat("dd-MM-yyyy", Locale.ROOT).parse(str1);
	
	Date end=new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).parse(str2);
	
	System.out.println(start);
	System.out.println(end);
	
	if(start.compareTo(end) > 0) {
		Date op1=new SimpleDateFormat("MM-dd-yyyy",Locale.ENGLISH).parse(str2);
		System.out.println(op1);
		
	}
	else if(start.compareTo(end) < 0) {
		Date op2=new SimpleDateFormat("MM-dd-yyyy",Locale.ENGLISH).parse(str1);
		System.out.print(op2);
	}
		else {
			System.out.println("something weird happen");
		}
	
	
	
	
	}
catch(ParseException e) {
	e.printStackTrace();
}*/

