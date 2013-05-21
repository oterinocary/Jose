/* Algoritmo que visualice por un lado la suma de los pares y por otro la de los impares de los números entre 1 y 100. */

public class Ejercicio02
{
	public static void main(String[] args)
	{
		int sumaPar = 0, sumaImpar = 0;
		
		for ( int i = 0; i<101; i++ )
		{
			if ( i%2==0 )
				sumaPar = sumaPar + i;
			else
				sumaImpar = sumaImpar + i;
		}
		
		System.out.println("Suma de pares: "+sumaPar);
		System.out.println("Suma de impares: "+sumaImpar);
		
		System.out.println("\nFin de programa");
	}
}