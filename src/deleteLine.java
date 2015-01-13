import java.util.Arrays;

/**
 * Created by Shishkov A.V. on 23.03.2014.
 */
public class deleteLine
{

	public static void main( String[] args )
	{
		int[][] ar = { { 1, 2, 3 }, { 11, 22, 33 }, { 111, 222, 333 } };
		System.out.println( Arrays.deepToString( ar ) );
		System.out.println( "---------------" );
		ar = deleteline( ar, 1 );
		System.out.println( Arrays.deepToString( ar ) );
		System.out.println( "---------------" );

	}

	private static int[][] deleteline( int[][] ar, int value )
	{
		for ( int i = 0; i < ar.length; i++ )
		{
			ar[ i ] = deleteElement( ar[ i ], value );
		}
		return ar;
	}

	private static int[] deleteElement( int[] ar, int index )
	{
		int[] mat = new int[ ar.length - 1 ];
		if ( index > 0 )
		{
			System.arraycopy( ar, 0, mat, 0, ar.length - 1 );
			System.arraycopy( ar, index + 1, mat, index, ar.length - index - 1 );
			return mat;
		}
		else
		{
			System.arraycopy( ar, 1, mat, 0, ar.length - 1 );
			System.arraycopy( ar, index + 1, mat, index, ar.length - index - 1 );
		}
		return mat;
	}


}

class deliteRow
{
	public static void main( String[] args )
	{
		int[][] ar = { { 1, 2, 3 }, { 11, 22, 33 }, { 111, 222, 333 }, { 4444, 4444, 4444 } };
		System.out.println( Arrays.deepToString( ar ) );
		System.out.println( "---------------" );
		ar = deliterow( ar, 0 );
		System.out.println( Arrays.deepToString( ar ) );
		System.out.println( "---------------" );
	}

	private static int[][] deliterow( int[][] matrix, int indexRow )
	{
		int[][] mat = new int[ matrix.length - 1 ][];
		if ( indexRow > 0 )
		{
			System.arraycopy( matrix, 0, mat, 0, matrix.length - indexRow );
			System.arraycopy( matrix, indexRow + 1, mat, indexRow, matrix.length - indexRow - 1 );
			return mat;
		}
		else
		{
			System.arraycopy( matrix, 1, mat, 0, matrix.length - 1 );
			System.arraycopy( matrix, indexRow + 1, mat, indexRow, matrix.length - indexRow - 1 );
		}
		return mat;
	}
}
