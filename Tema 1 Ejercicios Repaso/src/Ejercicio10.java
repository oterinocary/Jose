/* Algoritmo de un programa que sirva para apuntar a ni�os a cursos de nataci�n. Los ni�os de 3 y 4 a�os podr�n ir a iniciaci�n o
 * a avanzado (si ya saben flotar); los de 5 en adelante ir�n a aprendizaje de primer nivel o de segundo nivel seg�n sepan o no
 * nadar algo. El programa har� las preguntas necesarias para saber el curso en el que deber�n apuntarse los ni�os. El programa
 * permitir� apuntar ni�os hasta que se teclee como nombre del ni�o la cadena vac�a. Al final el programa mostrar� el n�mero total
 * de ni�os apuntados en cada curso:
 * 
 * 		CURSOS DE NATACI�N INFANTIL
 * 
 * 		Total ni�os apuntados: 396
 * 		Iniciaci�n: 99
 * 		Avanzado: 99
 * 		Aprendizaje primer nivel: 99
 * 		Aprendizaje segundo nivel: 99 */

import utilidades.*;

public class Ejercicio10
{
	public static void main(String[] args)
	{
		int edad, iniciacion = 0, avanzado = 0, primerNivel = 0, segundoNivel = 0;
		String ni�o;
		char respuesta;
		
		do
		{
			System.out.println("Introduce nombre:");
			ni�o = Keyboard.readString();
			System.out.println("Introduce edad:");
			edad = Keyboard.readInt();
			
			do
			{
				System.out.println("�Sabe nadar (S/N)?");
				respuesta = Character.toUpperCase(Keyboard.readChar());
				
				if ( respuesta!='S' && respuesta !='N' )
					System.out.println("Opci�n no v�lida");
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
		while ( ni�o!="" );
		
		System.out.println("CURSOS DE NATACI�N INFATIL");
		System.out.println("Total de ni�os apuntados: "+(iniciacion + avanzado + primerNivel + segundoNivel));
		System.out.println("Iniciaci�n: "+iniciacion);
		System.out.println("Avanzado: "+avanzado);
		System.out.println("Aprendizaje primer nivel: "+primerNivel);
		System.out.println("Aprendizaje segundo nivel: "+segundoNivel);
		System.out.println("\nFin de programa");
	}
}