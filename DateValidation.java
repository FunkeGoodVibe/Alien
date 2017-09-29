/**
 *  Transforms the date into Ripley Format.
 *  Checks the Ripley Earliest / Latest year
 *  Checks the date range. 
 */
package requirementX;

import api.ripley.Ripley;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * @authors Miriam Tamara Grodeland Aarag.
 *		Florence Anyakwo.
 *		Sharon Mazor.
 *		Funke Sowole.
 */
public class DateValidation {
	 
	private Ripley theRipley = new Ripley("90tLI3CStdmyVD6ql2OMtA==", "lBgm4pRs8QnVqL46EnH7ew==");
	private boolean dateTooEarly = true;
	private boolean dateTooLate = true; 
	private boolean dateSpanFine = false; 
	private static final int MAXIMUM_DATE_RANGE = 50;	//user cannot search greater than 50 years. 
	
	private Calendar cal;
	private Date theRipleyDate;
	private SimpleDateFormat ripleyDateFormat; 
	private int year;
	private int fromYear;
	private int toYear;
	
	
	public boolean checkStart(Date from){
		cal.setTime(from);
		int fromYear = cal.get(Calendar.YEAR);
		
		if ( fromYear < theRipley.getStartYear()){	//date can't be earlier than the earliest record.
			dateTooEarly = true;
		}
		return dateTooEarly;	
	}
	public boolean checkEnd(Date to){
		cal.setTime(to);
		int toYear = cal.get(Calendar.YEAR);
		
		if (toYear > theRipley.getLatestYear()){
			dateTooLate = true;					//date can't be later than the latest record. 
		}
		return dateTooLate;
	}
	public Date convertDateToRipleyFormat(Date date) throws ParseException{
		ripleyDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	
		//how to parse a Date into the correct format. 
		//theRipleyDate = ripleyDateFormat.parse(dDate);		
		return theRipleyDate;			// User date converted to ripley format
	}
	
	public boolean checkDateSpan(){
		if (fromYear <= toYear){	//i.e. If from is in correct format. (from cannot be greater than to) 
			dateSpanFine = true;
		}
		if ((fromYear - toYear) < MAXIMUM_DATE_RANGE){	//i.e. if range fine. User cannot search over '50' years. 
			dateSpanFine = true;		
		}
		return dateSpanFine;
		
	}
	public static void main(String[] args) throws ParseException{
		
		DateValidation r = new DateValidation();
		//r.convertDateToRipleyFormat("11/3/2000"); //test

	}
}
