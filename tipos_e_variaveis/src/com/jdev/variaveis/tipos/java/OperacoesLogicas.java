package com.jdev.variaveis.tipos.java;
import java.util.Locale;
import java.util.Scanner;

public class OperacoesLogicas {

	public static void main(String[] args) {
		String situacao, aluno = "";
		
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("*********************************************************");
		System.out.println("*         Sistema de cálculo de média escolar           *");
		System.out.println("*********************************************************");
		System.out.println("---------------------------------------------------------");
		
		System.out.println("Digite o nome do aluno(a):");
		String nomeAluno = scan.nextLine();
		System.out.println("Digite o número do RA do aluno(a):");
		int raAluno = scan.nextInt();
		
		System.out.println("Sexo: 'M' ou 'F'");
		char sexo = scan.next().charAt(0);
		
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
		
		scan.close();
		
		aluno = verificaSexo(sexo);
				
		situacao = validacao(mediaEscolar, sexo);
		
		System.out.println("---------------------------------------------------------");
		System.out.println(aluno + nomeAluno + " RA: " + raAluno + " sexo: " + sexo);
		System.out.println(situacao + " com a média final de  " + mediaEscolar);
		System.out.println("---------------------------------------------------------");
		
		
		System.out.println("*********************************************************");
		System.out.println("*                 Fim do programa                       *");
		System.out.println("*********************************************************");

	}
	
	public static String verificaSexo(char sexo) {
		String aluno = "";
		aluno = sexo == 'f' || sexo == 'F'?"Aluna: ":"Aluno: ";
		return aluno;
	}
	
	public static String validacao(double mediaEscolar, char sexo) {
		String situacao = "";
		if(mediaEscolar > 0 && mediaEscolar <= 5) 
		{	
			situacao = sexo == 'f' || sexo == 'F'?"Aluna reprovada":"Aluno reprovado";
		}
		else if(mediaEscolar > 5 && mediaEscolar <= 6.9)
		{
			situacao = sexo == 'f' || sexo == 'F'?"Aluna em recuperação!":"Aluno em recuperação!";
		}
		else
		{
			situacao = sexo == 'f' || sexo == 'F'?"Aluna aprovada":"Aluno aprovado";
		}
		return situacao;
	}

}
