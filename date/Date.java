/**
 * This course project is copyright of CyberTek ©CyberTek[2017]. All rights reserved. 
 * Any redistribution or reproduction of part or all of the contents in any form is 
 * prohibited without the express consent of CyberTek.
 */

package date;
import static org.junit.Assert.assertEquals;

import java.util.Calendar;

public class Date implements Comparable<Date>{

	private static final int[] DAYS = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	protected final int month;
	protected final int day;
	protected final int year;

	/*
	 * Initialized a new date from the month, day and year.
	 * @param month the month (between 1 and 12)
	 * @param day the day (between 1 and 28-31, depending on the month)
	 * @param year the year
	 
	 */

	public Date(int month, int day, int year){
		if(!isValid(month, day, year)){
			System.out.println("Invalid Date");
			throw new IllegalArgumentException();
		}
		this.year = year;
		this.month = month;
		this.day = day;
	}

	/*
	 * @return month of that month
	 */
	public int getMonth(){
		return this.month;
	}

	/*
	 * @return day of that day
	 */
	public int getDay(){
		return this.day;
	}

	/*
	 * @return year of that year
	 */
	public int getYear(){
		return this.year;
	}

	/**
	 * This method checks if a given date is a valid calendar date
	 * 
	 * @param m  month
	 * @param d  day
	 * @param y  year. (A year is no less than 1900, and no greater than 2100)
	 * @return  true if the given date is a valid calendar date. false otherwise
	 */
	public static boolean isValid(int m, int d, int y){
		if(y<1900 || y>2100) {
			return false;
		}
		else if (m<=12 || m>=1) {
			if ((m==1 && d<=31) || (m==2 && d<=28) || (m==3 && d<=31) || (m==4 && d<=30) || (m==5 && d<=31) || (m==6 && d<=30) || (m==7 && d<=31) || (m==8 && d<=31) || (m==9 && d<=30) || (m==10 && d<=31) || (m==11 && d<=30) || (m==12 && d<=31)) {
				return true;
			}
			else {
				return false;
			}
		}
		
		return true;
	}

	
	/** 
	 * @param year
	 * @return true if the given year is a leap year. false otherwise.
	 */
	public static boolean isLeapYear(int year){
		if(year%400==0 || (year%4==0 && year%100!=0))
		return true;
		else
			return false;
	}

	/**
	 * Compare this date to that day.
	 * @return {a negative integer or zero or a positive integer}, depending on whether this date is {before, equal to, after} that date
	 */

	public int compareTo(Date that) {
		if (this.year<that.year) {
			return -1;
		}
		else if (this.year>that.year) {
			return 1;
		}
		else {
		return 0; }
	}

	/**
	 * Return a string representation of this date.
	 * @return the string representation in the format MM/DD/YYYY
	 */
	public String toString(){
		Integer.toString(month);
		Integer.toString(day);
		Integer.toString(year);
		
		return Integer.toString(month) + "/" + Integer.toString(day) + "/" + Integer.toString(year);
	}

	
	/**
	 * 
	 * @return the word representation of the date.
	 * Example: (new Date(12,1,2017)).dateToWords() returns "December One Two Thousand Seventeen" 
	 */
	public String dateToWords() {
		String[] monthWords = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November", "December"};
		String[] numbersLessThanTen = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
		String[] numbersBetweenTenAndTwenty = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		String[] multiplesOfTen = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
		String[] yearWords = {"Hundred", "Thousand"};
		
		String m = "";
		String d = "";
		
		for (int i=1; i<=12; i++) {
			if (month==i) {
				m = monthWords[i];
			}
		}
		for (int j=1; j<=10; j++) {
			if (day==j) {
				d = numbersLessThanTen[j];
			}
		}
		
		return m;
	}
	
	public int age(){
	    Calendar cal = Calendar.getInstance();
	    int d = cal.get(Calendar.DAY_OF_MONTH);
	    int m = cal.get(Calendar.MONTH);		//starts from 0 to 11
	    int y = cal.get(Calendar.YEAR);
	    
	    int age = 0;
	    // TO DO
	    
	    return age;
	}


}
