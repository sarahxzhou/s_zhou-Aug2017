/*Sarah Zhou
 * September 6, 2017
 * This is the runner for the calculate library. 
 * It is used to test math methods in Calculate.
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(9));
		System.out.println(Calculate.cube(3));
		System.out.println(Calculate.average(5, 4));
		System.out.println(Calculate.average(6, 2, 4));
		System.out.println(Calculate.toDegrees(90, 3.14159));
		System.out.println(Calculate.toRadians(90, 3.14159));
		System.out.println(Calculate.discriminant(3, 1, 2));
		System.out.println(Calculate.toImproperFrac(2, 1, 3));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7));
		System.out.println(Calculate.isDivisibleBy(4, 2));
		System.out.println(Calculate.absValue(-3));
		System.out.println(Calculate.max(5,3));
		System.out.println(Calculate.max(5, 3, 6));
		System.out.println(Calculate.min(5, 3));
		System.out.println(Calculate.round2(5.467));
		System.out.println(Calculate.exponent(2,3));
	}

}
