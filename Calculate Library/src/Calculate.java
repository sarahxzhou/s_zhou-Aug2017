/*Sarah Zhou
 * September 6, 2017
 * Our self written math library
 * It contains a series of methods to do basic math functions.
 */
public class Calculate {

	/* Part 1: Methods, Headers, and Basic Math
	 * square the input
	 * one integer to one integer
	 */
	public static int square(int operand) {
		return operand * operand;
	}

	/*cube the input
	 * one integer to one integer
	 */
	public static int cube(int operand) {
		return operand * operand * operand;
	}

	/* determine the average of two doubles
	 * two doubles to one double
	 */
	public static double average(double operand1, double operand2) {
		return (operand1 + operand2) / 2;
	}

	/*determine the average of three doubles
	 * three doubles to one double
	 */
	public static double average(double operand1, double operand2, double operand3) {
		return (operand1 + operand2 + operand3) / 3;
	}

	/*convert an angle measure given in radians into degrees
	 * two doubles to one double
	 */
	public static double toDegrees(double operand, double pi) {
		return ((operand / pi) * 180);
	}

	/*convert an angle given in degrees into radians
	 * two doubles to one double
	 */
	public static double toRadians(double operand, double pi) {
		return ((operand * pi) / 180);
	}

	/*determine the discriminant
	 * three doubles and returns a double
	 */
	public static double discriminant(double a, double b, double c) {
		return ((b * b) - (4 * a * c));
	}

	/*converts mixed number into an improper fraction
	 * three integers into a string
	 */
	public static String toImproperFrac(int a, int b, int c) {
		return ((a * c) + b) + "/" + c;
	}

	/*converts improper fraction into a mixed number
	 * two integers into a string
	 */
	public static String toMixedNum(int a, int b) {
		return (a / b) + " " + a % b + "/" + b;
	}

	/*converts binomial multiplication of form (ax+b)(cx+d) into quadratic equation of ax^2 +bx +c
	 * accepts four integers and a String, returns a String
	 */
	public static String foil(int a, int b, int c, int d) {
		return a*c + "n^2" + " " + "+" + " " + (a*d + b*c) + "n" + " " + "+" + " " + b*d;
	}
	 /*Part 2: Methods with Conditionals
	  * determine whether one integer (a) is divisible by another integer (b)
	  * accepts two integers and returns a boolean
	  */
	public static boolean isDivisibleBy(int a, int b) {
		if(a%b==0) {
			return true;
		}else {
			return false;
		}
	}
	/*return absolute value of number
	 * accepts a double and returns a double
	 */
	public static double absValue(double value) {
		if (value<0) {
			return value*-1;
		}else {
			return value*1;
		}
	}
	/*return the larger of the values passed
	 * accepts two doubles and returns a double
	 */
	public static double max(double value1, double value2) {
		if (value1<value2) {
			return value2;
		}else {
			return value1;
		}
	}
	/*return the larger of the values passed
	 * accepts three doubles and returns a double
	 */
	public static double max(double value1, double value2, double value3) {
		if (value1>value2 && value1>value3) {
			return value1;
		}else if (value2>value1 && value2>value3) {
			return value2;
		}else {
			return value3;
		}
	}
	/*returns the smaller of the values passed
	 * accepts two integers and returns an int
	 */
	public static int min(int value1, int value2) {
		if (value1<value2) {
			return value1;
		}else {
			return value2;
		}
	}
	/*rounds a double correctly to 2 decimal places and returns a double
	 */
	public static double round2(double value) {
		if 
		}
	}
