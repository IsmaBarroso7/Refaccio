public class BarrosoIsmaelApp {

	private static final int PRIMER = 10;
	private static final int SEGON = 5;

	public static void main(String[] args) {

		//Declaramos las variables
		int num1=PRIMER;
		int num2=SEGON;

		/*Realizamos las operaciones.
		 * Tambien lo podemos guardar el resultado en variables. */

		String mesage1 = "El resultado de la suma es ";
		System.out.println(mesage1+(num1+num2));

		String msg2 = "El resultado de la resta es ";
		System.out.println(msg2+(num1-num2));

		String msg3 = "El resultado de la multiplicación es ";
		System.out.println(msg3+(num1*num2));

		String msg4 = "El resultado de la división es ";
		System.out.println(msg4+(num1/num2));
	}
}