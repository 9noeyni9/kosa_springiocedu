package sample4;
import java.util.Calendar;
import java.util.GregorianCalendar;
public abstract class AbstractTest {
	public abstract String dayInfo();/*미완성 메서드*/	
	public static AbstractTest getInstance(){
		GregorianCalendar cal=new GregorianCalendar();
		int day=cal.get(Calendar.DAY_OF_WEEK);
		AbstractTest test = null;
		switch(day)/*요일마다 결과가 달라짐*/
		{
			case 1 : test = new Sunday(); break;
			case 2 : test = new Monday(); break;
			case 3 : test = new Tuesday(); break;
			case 4 : test = new Wednesday(); break;
			case 5 : test = new Thursday(); break;
			case 6 : test = new Friday(); break;
			case 7 : test = new Saturday(); break;
		}
		return test;
	}
}
