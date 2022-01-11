package escrito;

import java.util.Scanner;

public class Escrito {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		long [] cedulas = new long [50];
		long ci = 0;
		int i; 
		int x = 0;
		int z = 50;
		
		/* Ejercicio 1: Solicitar 50 números de cédula (tipo de dato long)
		 * o hasta que el valor -1 sea digitado.
		 * Registrar los números de cédulas en un array*/
		
		i = 0;
		while (i <= 49 && ci != -1) {
			
			System.out.print("Ingrese número de cédula o -1 para cancelar: ");
			ci = ent.nextLong();
			
			if(ci != -1) {
				
				cedulas[i] = ci;
				x = x +1; //Suma un número de cédula registrado (+1)
				z = z -1; //Elimina un espacio disponible (-1)
			}
			i++;
					
		}
		ent.close();
		
		/*Desplegar los números de cédula pares de manera inversa a la ingresada*/
		
		System.out.println("Números de cédula pares:");
		
		i = 49;
		while(i >= 0) {
			
			if ((cedulas[i] % 2) == 0 && cedulas[i] != 0) { //Si el número de cédula es par
				
				System.out.println(cedulas[i]);  			//y es distinto a 0:
			}
		i--;                 								//muestra en pantalla de manera inversa
		}
		
		/*Completar con el valor 9999999999 las posiciones del Array no cargadas*/
		
		i = 0;
		while(i <= 49 ) {
			
			if (cedulas[i] == 0) {
				cedulas[i] = 9999999999L; //(L (minúscula o mayúscula) al final porque es tipo de dato long)
			}
			i++;
		}
		
		/*Desplegar texto que diga cuántos números de cédula se registraron y cuántos 
		 * lugares vacíos quedaron. Usar x para la cantidad de números de cedula que se cargaron
		 * en el array y usar z para la cantidad de lugares en el array que no tienen números de cedula*/
		
		System.out.println("Se registraron "+x+" números de cédula y quedaron "+z+" lugares vacíos");

	}

}
