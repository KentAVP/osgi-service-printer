package osgi.service.printer;

import java.util.Date;
import java.text.DateFormat;

public class PrinterImpl implements IPrinter 
{
	public void print(String message)
	{
		DateFormat dtf = DateFormat.getTimeInstance(DateFormat.LONG);
		String time = dtf.format(new Date());
		System.out.println(time + " : " + message);
	}
}
