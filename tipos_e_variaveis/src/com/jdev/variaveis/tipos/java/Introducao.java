package com.jdev.variaveis.tipos.java;

public class Introducao {
	
	/*
	 * Variável global
	 * 
	 * */
	
	static String variavelGlobal = "Sou uma variável global!";

	public static void main(String[] args) {
		/*
		 * Tipos: Entendemos por tipos de informação
		 * 
		 * Variável: Uma variável referenciará o tipo de dado
		 * 
		 * */
		
		byte tipoByte;
		short tipoShort;
		int tipoInt;
		boolean tipoBoolean;
		String tipoTexto;
		float tipoFloat;
		long tipoLong;
		double tipoDouble;
		char tipoCaractere;
		
		/*
		 * Variavel local
		 * 
		 * */
		String variavelLocal = "sou uma variável local!";
		
		chamarAVariavel();

	}
	
	public static void chamarAVariavel() {
		System.out.println(variavelGlobal);
	}
	
	

}
