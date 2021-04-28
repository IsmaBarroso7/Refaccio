public class BarrosoIsmaelApp {

	private static final int PRIMER = 10;
	private static final int SEGON = 5;
	private static String mesage_camp;

	public static void main(String[] args) {

		//Declaramos las variables
		int num1=PRIMER;
		int num2=SEGON;

		/*Realizamos las operaciones.
		 * Tambien lo podemos guardar el resultado en variables. */

		mesage_camp = "El resultado de la suma es ";
		System.out.println(mesage_camp+(num1+num2));

		String msg2 = "El resultado de la resta es ";
		System.out.println(msg2+(num1-num2));

		String msg3 = "El resultado de la multiplicación es ";
		System.out.println(msg3+(num1*num2));

		String msg4 = "El resultado de la división es ";
		System.out.println(msg4+(num1/num2));
		

		System.out.println("El resultado de la división es " + (num1/num2));
	}
}