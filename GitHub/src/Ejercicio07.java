/* Algoritmo que multiplique los 100 primeros n�meros impares. */

public class Ejercicio07
{
	public static void main(String[] args)
	{
		double producto = 1;
		
		for ( int i = 1; i<201; i+=2 )
			producto = producto * i;
		
		System.out.println("Producto de los 100 primeros n�meros impares: "+producto);
		
		System.out.println("\nFin de programa");
	}
}