import javax.swing.*;
import java.text.ParseException;
import java.util.Arrays;

class Parent {
	public Parent() {

	}
}

class Child extends Parent {
	public Child() {
	}

	public Child(int x) {
		this();

	}
}

class Outer {
	final int data;

	Outer(int data) {
		this.data = data;
	}

	private static String foo() {
		System.out.println("Inside foo()");
		return "Stand By Me";
	}

	static {
		System.out.println("Static block");
	}

	static String text = foo();

	public final long LENGTH = 10L;
}

public class Main extends JFrame {
	public static final int WIDTH = 10;

	public void bar(int w) {
		w++;
		System.out.println("Width = " + w);
	}

	private static void foo(int[] mas) {
		for (int num : mas) {
			System.out.println(num);
		}
	}

	public static void main(String[] args) throws ParseException {
//		Date date = new Date( );
//		System.out.println( String.format( "%td.%<tm.%<tY", date ) );
//        System.out.println("Hello");
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
//        System.out.println(dateFormat.format(new Date()));

		for (int i = 1; i < 10; i++)
			for (int j = 1; j < 10; j++)
				for (int k = 1; k < 10; k++)
					for (int a = 1; a < 10; a++)
						for (int b = 1; b < 10; b++) {
							if (((i * 100 + j * 10 + k) * (a * 10 + j)) == (j * 10000 + i * 1000 + b * 100 +
									i * 10 + b)) {
								System.out.println("Перевернутый треугольник = " + i);
								System.out.println("Квадрат = " + j);
								System.out.println("Круг = " + k);
								System.out.println("Пятиугольник = " + a);
								System.out.println("Треугольник = " + b);
							}

						}
	}

	private static void outArray(int[][] mas) {
		System.out.println(Arrays.deepToString(mas));
		//		for ( int[] arr : mas )
		//			System.out.println( Arrays.toString( arr ) );
	}

	private static int[][] XXX(int[][] smile, int number_Col) {
		if (smile.length >= number_Col) {
			int bad_Smile[][] = new int[smile.length][smile[0].length - 1];
			for (int i = 0; i < smile.length; i++) {
				System.arraycopy(smile[i], 0, bad_Smile[i], 0, number_Col - 1);
				System.arraycopy(smile[i], number_Col, bad_Smile[i], number_Col - 1,
						smile[i].length - number_Col);
			}
			return bad_Smile;
		}
		return smile;
	}
}
