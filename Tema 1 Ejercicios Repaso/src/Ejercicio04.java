/* Programa que lea notas el programa no permitirá notas que no estén en el rango de 0 a 10. El programa finalizará al introducir
 * un número < 0. Al final visualizará el número de aprobados y de suspensos siendo aprobados todas las notas iguales o superiores
 * a 5. */

import utilidades.*;

public class Ejercicio04
{
	public static void main(String[] args)
	{
		int nota, aprobados = 0, suspensos = 0;
		
		do
		{
			System.out.println("Introduce una nota:");
			nota = Keyboard.readInt();
			
			if ( nota>4 && nota<11 )
				aprobados++;
			else
				suspensos++;
		}
		while ( nota>=0 && nota<=10 );
		
		System.out.println("Aprobados: "+aprobados);
		System.out.println("Suspensos: "+suspensos);
		
		System.out.println("Fin de programa");
	}
}