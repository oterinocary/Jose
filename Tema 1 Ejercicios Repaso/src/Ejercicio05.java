/* Algoritmo correspondiente a un programa que lea un número entero y positivo y seguidamente escriba el carácter "*" un número
 * de veces igual al valor numérico. En el caso de que el valor leído no sea un número entero y positivo se escribirá el mensaje
 * "ERROR" y se finalizará la ejecución del programa. */

import utilidades.*;

public class Ejercicio05
{
	public static void main(String[] args)
	{
		int asterisco;
		
		do
		{
			System.out.println("Introduce un número:");
			asterisco = Keyboard.readInt();
			
			if ( asterisco<1 )
				System.out.println("Valor númerico no válido");
		}
		while ( asterisco<1 );
		
		for ( int i = 0; i<asterisco; i++ )
			System.out.print("*");
		
		System.out.println("\n\nFin de programa");
	}
}