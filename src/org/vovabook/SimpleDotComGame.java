
package org.vovabook;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Shishkov A.V. on 22.03.2014.
 */
public class SimpleDotComGame
{
	public static void main( String... args )
	{
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		SimpleDotCom theDotCom = new SimpleDotCom();
		int randomNum = ( int ) ( Math.random() * 5 );
		ArrayList<Integer> locations = new ArrayList<Integer>(
				Arrays.asList( randomNum, randomNum + 1, randomNum + 2 ) );

		theDotCom.setLocationCells( locations );

		boolean isAlive = true;

		while ( isAlive )
		{
			String guess = helper.getUserInput( "Введите число" );
			String result = theDotCom.checkYourself( guess );

			numOfGuesses++;

			if ( result.equals( "Потопил" ) )
			{
				isAlive = false;
				System.out.println( "Вам потребовалось " + numOfGuesses + " попыток(и)" );
			}
		}
	}
}
