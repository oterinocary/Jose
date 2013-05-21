/* Calcular el m.c.d. de dos números enteros positivos por el algoritmo de Euclides, el cual dice lo siguiente:
 * 
 * 		1 - Sea N1 >= N2.
 * 		2 - Si N2 = 0 ---> N1 es el m.c.d. (Fin del programa).
 * 		3 - Si N2 <> 0 --- Resto = N1 mod N2.
 * 		4 - Si Resto = 0 ---> N2 es el m.c.d.
 * 		5 - Si Resto <> 0 ---> m.c.d. de N1, N2 es el m.c.d. de N2 y Resto => N1 <--- N2
																			  N2 <--- Resto
* 		6 - Volver al paso 3. */

import utilidades.*;

public class Ejercicio03
{
	public static void main(String[] args)
	{
		int num1, num2, resto, numero1, numero2;
		
		System.out.println("Introduce un número:");
		num1 = Keyboard.readInt();
		
		do
		{
			System.out.println("Introduce un segundo número:");
			num2 = Keyboard.readInt();
			
			if ( num2<num1 )
				System.out.println("Número no válido");
		}
		while ( num2<num1 );
		
		numero1 = num1;
		numero2 = num2;
		
		if ( num2==0 )
			System.out.println("El m.c.d. de "+numero1+" y "+numero2+" es: "+num1);
		else
		{
			do
			{
				resto = num1%num2;
				
				if ( resto==0 )
					System.out.println("El m.c.d. de "+numero1+" y "+numero2+" es: "+num2);
				else
				{
					num1 = num2;
					num2 = resto;
				}
			}
			while ( resto!=0 );
		}
		
		System.out.println("Fin de programa");
	}
}