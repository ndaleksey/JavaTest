package org.vovabook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Shishkov A.V. on 22.03.2014.
 */
public class GameHelper
{
	public String getUserInput( String prompt )
	{
		String inputLine = null;

		System.out.print( prompt + "  " );

		try
		{
			BufferedReader is = new BufferedReader( new InputStreamReader( System.in ) );
			inputLine = is.readLine();

			if ( inputLine.length() == 0 )
				return null;
		}
		catch ( IOException ex )
		{
			System.out.println( "IOException: " + ex );
		}

		return inputLine;
	}
}
