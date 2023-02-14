package com.jdev.variaveis.tipos.java;
import java.util.Locale;
import java.util.Scanner;

public class EtruturaDeRepeticaoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);		
		
		System.out.println("*********************************************************");
		System.out.println("*         Sistema de cálculo de Tabuada                 *");
		System.out.println("*                   Com While                           *");
		System.out.println("*********************************************************");
		System.out.println("---------------------------------------------------------");
		System.out.println("Entre com um número para calcular a tabuada: ");
		int numero = scan.nextInt();
		tabuadaComWhile(numero);
		System.out.println("---------------------------------------------------------");
	}

	private static void tabuadaComWhile(int numero) {
		int cont = 0;
		int resultado = 0;
		System.out.println("Vamos calcular a tabuada do " + numero);
		
		while(cont <= 10) {
			resultado = numero * cont;
			System.out.println(numero + " X " + cont + " = " + resultado);
			cont ++;
		}
		
	}

}
