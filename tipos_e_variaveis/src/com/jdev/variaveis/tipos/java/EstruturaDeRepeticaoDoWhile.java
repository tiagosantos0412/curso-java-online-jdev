package com.jdev.variaveis.tipos.java;
import java.util.Locale;
import java.util.Scanner;

public class EstruturaDeRepeticaoDoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);		
		
		System.out.println("*********************************************************");
		System.out.println("*         Sistema de cálculo de Tabuada                 *");
		System.out.println("*                 Com Do While                          *");
		System.out.println("*********************************************************");
		System.out.println("---------------------------------------------------------");
		System.out.println("Entre com um número para calcular a tabuada: ");
		int numero = scan.nextInt();
		tabuadaComDoWhile(numero);
		System.out.println("---------------------------------------------------------");

	}

	private static void tabuadaComDoWhile(int numero) {
		int cont = 0;
		int resultado = 0;
		System.out.println("Vamos calcular a tabuada do " + numero);
		
		do {
			resultado = numero * cont;
			System.out.println(numero + " X " + cont + " = " + resultado);
			cont ++;
		}while(cont <= 10);
		
	}

}
