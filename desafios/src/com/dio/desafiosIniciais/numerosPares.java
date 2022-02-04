package com.dio.desafiosIniciais;

import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author Matheus
 * Desafios
 *
 * Crie um programa que leia um n�mero e mostre os n�meros pares at� esse n�mero, inclusive ele mesmo.
 * Entrada
 * Voc� receber� 1 valor inteiro N, onde N > 0.
 * Sa�da
 * Exiba todos os n�meros pares at� o valor de entrada, sendo um em cada linha. 
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
