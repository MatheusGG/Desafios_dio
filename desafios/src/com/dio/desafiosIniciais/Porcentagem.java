package com.dio.desafiosIniciais;

import java.io.IOException;
import java.util.Scanner;

public class Porcentagem {

	public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	double A = leitor.nextDouble();
    	double B = leitor.nextDouble();
    	
    	double porcentagem = (B - A) / A * 100;
    	System.out.printf("%.2f%s", porcentagem, '%');
    	leitor.close();
    }

}
