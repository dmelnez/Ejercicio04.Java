package edu.Ejercicio04J.Controladores;


import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduzca un Primer Valor");
		
		Scanner mi = new Scanner (System.in);
		int numero01 = mi.nextInt();
	
		System.out.println("Introduzca un Segundo Valor");
		int numero02 = mi.nextInt();
	
		System.out.println("Introduzca un Tercer Valor");
		int numero03= mi.nextInt();
	
		
		if (numero01 > numero02 & numero01 > numero03){
			
			if (numero02 > numero03) {
				System.out.println(numero01);
				System.out.println(numero02);
				System.out.println(numero03);
			}	
			
			
			else  {
				System.out.println(numero01);
				System.out.println(numero03);
				System.out.println(numero02);
			}
		}
		
	

		if (numero02 > numero01 & numero02 > numero03){
			
			if (numero02 > numero03) {
				System.out.println(numero02);
				System.out.println(numero01);
				System.out.println(numero03);
			}	
			
			
			else  {
				System.out.println(numero02);
				System.out.println(numero03);
				System.out.println(numero01);
			}
		
		
		
			if (numero03 > numero01 & numero03 > numero02){
				
				if (numero01 > numero02) {
					System.out.println(numero03);
					System.out.println(numero01);
					System.out.println(numero02);
				}	
				
				
				else  {
					System.out.println(numero03);
					System.out.println(numero02);
					System.out.println(numero01);
				}
			
			
	}

}
	}
}
