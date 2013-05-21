/* Algoritmo de un programa que sirva para apuntar a niños a cursos de natación. Los niños de 3 y 4 años podrán ir a iniciación o
 * a avanzado (si ya saben flotar); los de 5 en adelante irán a aprendizaje de primer nivel o de segundo nivel según sepan o no
 * nadar algo. El programa hará las preguntas necesarias para saber el curso en el que deberán apuntarse los niños. El programa
 * permitirá apuntar niños hasta que se teclee como nombre del niño la cadena vacía. Al final el programa mostrará el número total
 * de niños apuntados en cada curso:
 * 
 * 		CURSOS DE NATACIÓN INFANTIL
 * 
 * 		Total niños apuntados: 396
 * 		Iniciación: 99
 * 		Avanzado: 99
 * 		Aprendizaje primer nivel: 99
 * 		Aprendizaje segundo nivel: 99 */

import utilidades.*;

public class Ejercicio10
{
	public static void main(String[] args)
	{
		int edad, iniciacion = 0, avanzado = 0, primerNivel = 0, segundoNivel = 0;
		String niño;
		char respuesta;
		
		do
		{
			System.out.println("Introduce nombre:");
			niño = Keyboard.readString();
			System.out.println("Introduce edad:");
			edad = Keyboard.readInt();
			
			do
			{
				System.out.println("¿Sabe nadar (S/N)?");
				respuesta = Character.toUpperCase(Keyboard.readChar());
				
				if ( respuesta!='S' && respuesta !='N' )
					System.out.println("Opción no válida");
			}
			while ( respuesta!='S' && respuesta !='N' );
			
			if ( edad==3 || edad==4 )
				if ( respuesta=='N' )
					avanzado++;
				else
					iniciacion++;
			else
				if ( respuesta=='N' )
					primerNivel++;
				else
					segundoNivel++;
		}
		while ( niño!="" );
		
		System.out.println("CURSOS DE NATACIÓN INFATIL");
		System.out.println("Total de niños apuntados: "+(iniciacion + avanzado + primerNivel + segundoNivel));
		System.out.println("Iniciación: "+iniciacion);
		System.out.println("Avanzado: "+avanzado);
		System.out.println("Aprendizaje primer nivel: "+primerNivel);
		System.out.println("Aprendizaje segundo nivel: "+segundoNivel);
		System.out.println("\nFin de programa");
	}
}