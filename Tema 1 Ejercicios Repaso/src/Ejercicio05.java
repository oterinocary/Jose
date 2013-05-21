/* Algoritmo correspondiente a un programa que lea un n�mero entero y positivo y seguidamente escriba el car�cter "*" un n�mero
 * de veces igual al valor num�rico. En el caso de que el valor le�do no sea un n�mero entero y positivo se escribir� el mensaje
 * "ERROR" y se finalizar� la ejecuci�n del programa. */

import utilidades.*;

public class Ejercicio05
{
	public static void main(String[] args)
	{
		int asterisco;
		
		do
		{
			System.out.println("Introduce un n�mero:");
			asterisco = Keyboard.readInt();
			
			if ( asterisco<1 )
				System.out.println("Valor n�merico no v�lido");
		}
		while ( asterisco<1 );
		
		for ( int i = 0; i<asterisco; i++ )
			System.out.print("*");
		
		System.out.println("\n\nFin de programa");
	}
}