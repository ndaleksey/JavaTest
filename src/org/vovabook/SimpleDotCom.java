package org.vovabook;

import java.util.ArrayList;

/**
 * Created by Shishkov A.V. on 22.03.2014.
 */
public class SimpleDotCom
{
	ArrayList<Integer> locationCells;
	int numOfHits = 0;

	public void setLocationCells( ArrayList<Integer> locationCells )
	{
		this.locationCells = locationCells;
		System.out.println( this.locationCells.toString() );
	}

	public String checkYourself( String stringGuess )
	{
		int guess = Integer.parseInt( stringGuess );
		String result = "Мимо";

		for ( int cell : locationCells )
		{
			if ( guess == cell )
				result = "Попал";

			numOfHits++;

			break;
		}

		if ( numOfHits == locationCells.size() )
			result = "Потопил";

		System.out.println( result );

		return result;
	}
}
