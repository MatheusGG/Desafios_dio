package com.dio.desafiosIniciais;

import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author mathe
 *
 *
 *Desafio
 *Leia um caractere mai�sculo, que indica uma opera��o que deve ser realizada e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a m�dia considerando somente aqueles elementos que est�o na �rea direita da matriz, conforme ilustrado abaixo (�rea verde).
 *Entrada
 *A primeira linha de entrada contem um �nico caractere Mai�sculo O ('S' ou 'M'), indicando a opera��o (Soma ou M�dia) que dever� ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante que comp�em a matriz.
 *Sa�da
 *Imprima o resultado solicitado (a soma ou m�dia), com 1 casa ap�s o ponto decimal.
 *
 */

public class desafio_matriz {

	public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (int i = 0; i < 12; i++) {
        	for (int j = 0; j < 12; j++) {
        		M[i][j] = leitor.nextDouble();
        	}
        }
        
        for (int i = 0; i < M.length; i++) {
        	for (int j = 0; j < M[i].length; j++) {
        		if ( i < j && i + j >= 12) soma += M[i][j];
        	}
        }

        if (O == 'M') soma /= 30;
    	System.out.println(String.format("%.1f", soma));
    }
}
