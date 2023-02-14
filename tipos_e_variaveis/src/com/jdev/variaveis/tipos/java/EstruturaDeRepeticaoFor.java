package com.jdev.variaveis.tipos.java;
import java.util.Locale;
import java.util.Scanner;

public class EstruturaDeRepeticaoFor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);		
		
		System.out.println("*********************************************************");
		System.out.println("*         Escolha qual a tabuada será exibida:          *");
		System.out.println("*       Tabuada invertida: I | Tabuada normal : N       *");
		System.out.println("*********************************************************");
		System.out.println("---------------------------------------------------------");
		System.out.println("Escolha qual tabuada será exibida: ");
		char tabuada = scan.next().charAt(0);
		if(tabuada == 'I' || tabuada == 'i') {
			tabuadaInvertida();
		}else if(tabuada == 'N' || tabuada == 'n') {
			tabuadaNormal();
		}else {
			System.out.println("Opção Invalida!");
		}
				
		scan.close();
	}
	
	private static void tabuadaInvertida() {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);	
		System.out.println("*********************************************************");
		System.out.println("*         Você escolheu a tabuada invertida             *");
		System.out.println("*                    Com For                            *");
		System.out.println("*********************************************************");
		System.out.println("---------------------------------------------------------");
		System.out.println("Entre com um número para calcular a tabuada: ");
		int numero = scan.nextInt();
		tabuadaComForInvertida(numero);
		System.out.println("---------------------------------------------------------");
		scan.close();
	}

	private static void tabuadaNormal() {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);	
		System.out.println("*********************************************************");
		System.out.println("*         Você escolheu a tabuada normal                *");
		System.out.println("*                    Com For                            *");
		System.out.println("*********************************************************");
		System.out.println("---------------------------------------------------------");
		System.out.println("Entre com um número para calcular a tabuada: ");
		int numero = scan.nextInt();
		tabuadaComFor(numero);
		System.out.println("---------------------------------------------------------");
		scan.close();
	}



	private static void tabuadaComFor(int numero) {
		int resultado;
		
		System.out.println("Vamos calcular a tabuada do " + numero);
		for(int i = 0; i <= 10; i++) {
			resultado = numero * i;
			System.out.println(numero + " X " + i + " = " + resultado);
		}
		
	}
	
	private static void tabuadaComForInvertida(int numero) {
		int resultado = 0;
		
		System.out.println("Vamos calcular a tabuada do " + numero);
		for(int i = 10; i >= 0; i--) {
			resultado = numero * i;
			System.out.println(numero + " X " + i + " = " + resultado);
		}
		
	}

}
