package com.dio.desafiosIniciais;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		 //declare suas variaveis do tipo double

                  //continue a solucao
		double raio = scan.nextDouble();
		double area = 3.14159 * (Math.pow(raio ,2));

		System.out.printf("A=%.4f\n", area);
		
		scan.close();
	}

}
