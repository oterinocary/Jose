/* Algoritmo que lea 100 n�meros, los procese y tras leer el �ltimo visualice un mensaje que especifique si alguno de ellos era
 * m�ltiplo de 3. */

import utilidades.*;

public class Ejercicio08
{
	public static void main(String[] args)
	{
		int i = 0, num, divisible = 0;
		
		do
		{
			System.out.println("Introduce un n�mero:");
			num = Keyboard.readInt();
			
			if ( num%3==0 )
				divisible++;
			
			i++;
		}
		while ( i<100 );
		
		System.out.println("Has introducido "+divisible+" n�meros m�ltiplos de 3.");
		
		System.out.println("Fin de programa");
	}
}