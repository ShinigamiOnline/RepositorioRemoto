package clases;
/**
 * 
 * Esta clase suma, resta, multiplica y divide.
 * Esta clase se usará para ser compartida con GitHub
 * @author Shinigami2
 * @version 1.0 10/02/2017
 * 
 *
 */

public class Calculadora {
/**
 * 
 * @param x primer sumando
 * @param y segundo sumando
 * @return x+y
 */

	public static float suma(float x, float y){
		return (x+y);
	}
	public static float resta(float x, float y){
		return (x - y);
	}
	public static float multiplicacion(float x, float y){
		return (x * y);
	}
	/**
	 * Divide x entre y
	 * @param x dividendo
	 * @param y divisor
	 * @return cociente
	 */
	public static float division(float x, float y){
		return (x / y);
	}

}
