/* Algoritmo de un m�dulo de programa que pide una letra la cual s�lo podr� ser uno de los siguientes caracteres:
 * "S", "s", "N", "n", se deber� pedir sucesivamente la letra hasta que �sta sea una de las especificadas. */

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