import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Shishkov A.V. on 22.03.2014.
 */
public class GetTime20 extends Thread
{
	DateFormat dateFormat;
	DateFormat timeFormat;
	Locale locale = new Locale( "en" );
	Date rightNow;
	String timeOut;
	String dateOut;

	private void showDateTime()
	{
		while ( true )
		{
			rightNow = new Date();
			dateFormat = DateFormat.getDateInstance( DateFormat.DEFAULT, locale );
			timeFormat = DateFormat.getTimeInstance( DateFormat.DEFAULT, locale );

			timeOut = timeFormat.format( rightNow );
			dateOut = dateFormat.format( rightNow );

			System.out.println( timeOut );
			System.out.println( dateOut );

			try
			{
				Thread.sleep( 1000 );
			}
			catch ( InterruptedException ex )
			{

			}
		}
	}

	@Override
	public void run()
	{
		showDateTime();
	}
}
