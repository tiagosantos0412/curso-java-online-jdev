package com.jdev.variaveis.tipos.java;
import java.util.Locale;
import java.util.Scanner;

public class OperacoesEntreDecimais {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("*********************************************************");
		System.out.println("*         Distema de cálculo de média escolar           *");
		System.out.println("*********************************************************");
		System.out.println("---------------------------------------------------------");
		System.out.println("Digite o nome do aluno:");
		String nomeAluno = scan.nextLine();
		
		System.out.println("Entre com a nota de Literatura:");
		double notaLiteratura = scan.nextDouble();
		
		System.out.println("Entre com a nota de Matemática:");
		double notaMatematica = scan.nextDouble();
		
		System.out.println("Entre com a nota de História:");
		double notaHistoria = scan.nextDouble();
		
		System.out.println("Entre com a nota de Geografia:");
		double notaGeografia = scan.nextDouble();
		
		System.out.println("Entre com a nota de Biologia:");
		double notaBiologia = scan.nextDouble();
		
		double mediaEscolar = (notaLiteratura + notaMatematica + notaHistoria + notaGeografia + notaBiologia) / 5;
		
		System.out.println("---------------------------------------------------------");
		System.out.println("A média do aluno " + nomeAluno +" é: " + mediaEscolar);
		
		System.out.println("*********************************************************");
		System.out.println("*                 Fim do programa                       *");
		System.out.println("*********************************************************");

	}

}
