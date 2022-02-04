package com.dio.desafiosIniciais;

import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author Matheus
 * Desafios
 *
 * Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.
 * Entrada
 * Você receberá 1 valor inteiro N, onde N > 0.
 * Saída
 * Exiba todos os números pares até o valor de entrada, sendo um em cada linha. 
 */
public class numerosPares {
	
	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);
		int entrada = teclado.nextInt();
		for(int i = 1; i < entrada; i+=2) {
			System.out.println(i + 1);
		}
		
		teclado.close();
	}

}
