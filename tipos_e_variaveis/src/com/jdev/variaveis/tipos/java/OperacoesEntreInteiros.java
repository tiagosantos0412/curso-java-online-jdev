package com.jdev.variaveis.tipos.java;
import java.util.Locale;
import java.util.Scanner;

public class OperacoesEntreInteiros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("*********************************************************");
		System.out.println("*         Sistema de cálculo de média escolar           *");
		System.out.println("*********************************************************");
		System.out.println("---------------------------------------------------------");
		System.out.println("Digite o nome do aluno:");
		String nomeAluno = scan.nextLine();
		
		System.out.println("Entre com a nota de Literatura:");
		int notaLiteratura = scan.nextInt();
		
		System.out.println("Entre com a nota de Matemática:");
		int notaMatematica = scan.nextInt();
		
		System.out.println("Entre com a nota de História:");
		int notaHistoria = scan.nextInt();
		
		System.out.println("Entre com a nota de Geografia:");
		int notaGeografia = scan.nextInt();
		
		System.out.println("Entre com a nota de Biologia:");
		int notaBiologia = scan.nextInt();
		
		int mediaEscolar = (notaLiteratura + notaMatematica + notaHistoria + notaGeografia + notaBiologia) / 5;
		
		System.out.println("---------------------------------------------------------");
		System.out.println("A média do aluno " + nomeAluno +" é: " + mediaEscolar);
		
		System.out.println("*********************************************************");
		System.out.println("*                 Fim do programa                       *");
		System.out.println("*********************************************************");
		

	}

}
