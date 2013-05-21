/* Algoritmo de un módulo de programa que pide una letra la cual sólo podrá ser uno de los siguientes caracteres:
 * "S", "s", "N", "n", se deberá pedir sucesivamente la letra hasta que ésta sea una de las especificadas. */

import utilidades.*;

public class Ejercicio01
{
	public static void main(String[] args)
	{
		char letra;
		
		do
		{
			System.out.println("Introduce una letra:");
			letra = Keyboard.readChar();
		}
		while ( letra!='S' && letra!='s' && letra!='N' && letra!='n' );
		
		System.out.println("\nFin de programa");
	}
}