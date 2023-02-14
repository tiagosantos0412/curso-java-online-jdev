package com.jdev.variaveis.tipos.java;
import java.util.Locale;
import java.util.Scanner;

public class ComandoSwitchECase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Em que dia da semana estamos?");
		int dia = scan.nextInt();
		
		System.out.println("Então hoje é " + verificarDiaDaSemana(dia));

	}
	
	public static String verificarDiaDaSemana(int dia){
		String diaDaSemana = "";
		
		switch(dia)
		{
			case 1: 
					diaDaSemana = "Domingo";
			break;
			case 2: 
				diaDaSemana = "Segunda Feira";
			break;
			case 3: 
				diaDaSemana = "Terça Feira";
			break;
			case 4: 
				diaDaSemana = "Quarta Feira";
			break;
			case 5: 
				diaDaSemana = "Quinta Feira";
			break;
			case 6: 
				diaDaSemana = "Sexta Feira";
			break;
			case 7: 
				diaDaSemana = "Sábado";
			break;
			default:
				diaDaSemana = "Opção inválida!";
			break;
		}
		return diaDaSemana;
		
	}

}
