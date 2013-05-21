/* Algoritmo de un programa que pida un número entero que representa un mes, validarlo y mostrar un mensaje que indique el
 * nombre del mes en letra y la estación del año que es:
 * 
 * 		1, 2 y 3: Invierno
 * 		4, 5 y 6: Primavera
 * 		7, 8 y 9: Verano
 * 		10, 11 y 12: Otoño
 * 
 * Ejemplo de la ejecución del programa:
 * 
 * 		Dame un mes (1-12): 0
 * 		Dame un mes (1-12): 10
 * 
 * 		En octubre es otoño. */

import utilidades.Keyboard;

public class Ejercicio09
{
	public static void main(String[] args)
	{
		int num;
		String mes = null;
		
		do
		{
			System.out.println("Introduce un número entre 1 y 12:");
			num = Keyboard.readInt();
			
			if ( num<1 || num>12 )
				System.out.println("Número no válido");
		}
		while ( num<1 || num>12 );
		
		switch ( num )
		{
		case 1:
			mes = "Enero";
		case 2:
			mes = "Febrero";
		case 3:
			mes = "Marzo";
		case 4:
			mes = "Abril";
		case 5:
			mes = "Mayo";
		case 6:
			mes = "Junio";
		case 7:
			mes = "Julio";
		case 8:
			mes = "Agosto";
		case 9:
			mes = "Septiembre";
		case 10:
			mes = "Octubre";
		case 11:
			mes = "Noviembre";
		case 12:
			mes = "Diciembre";
		}
		
		if ( num>0 && num<4 )
			System.out.println("En "+mes+" es invierno");
		else if ( num>3 && num<7 )
			System.out.println("En "+mes+" es primavera");
		else if ( num>6 && num<10 )
			System.out.println("En "+mes+" es verano");
		else
			System.out.println("En "+mes+" es otoño");
		
		System.out.println("Fin de programa");
	}
}