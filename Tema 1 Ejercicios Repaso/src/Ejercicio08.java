/* Algoritmo que lea 100 números, los procese y tras leer el último visualice un mensaje que especifique si alguno de ellos era
 * múltiplo de 3. */

import utilidades.*;

public class Ejercicio08
{
	public static void main(String[] args)
	{
		int i = 0, num, divisible = 0;
		
		do
		{
			System.out.println("Introduce un número:");
			num = Keyboard.readInt();
			
			if ( num%3==0 )
				divisible++;
			
			i++;
		}
		while ( i<100 );
		
		System.out.println("Has introducido "+divisible+" números múltiplos de 3.");
		
		System.out.println("Fin de programa");
	}
}