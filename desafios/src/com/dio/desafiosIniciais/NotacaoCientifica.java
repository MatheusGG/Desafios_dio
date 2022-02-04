package com.dio.desafiosIniciais;

import java.io.IOException;
import java.util.Scanner;

public class NotacaoCientifica {

	public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	double entrada = Double.parseDouble(leitor.nextLine());
    	double entradaModulo = entrada;
    	String primSimb = "";
    	String segSimb = "+";
    	
    	if(entrada < 0) {
    		primSimb = "-";
    		entradaModulo = entrada * -1;
    	}
    	if(entrada > 0) {
    		primSimb = "+";
    	}
    	
    	int i = 0;
    	if(entradaModulo != 0) {
    		
    		while(entradaModulo >= 10) {
    			entradaModulo /= 10;
    			i++;
    		}
    		if(entradaModulo < 1) segSimb = "-";
    		while(entradaModulo < 1) {
    			entradaModulo *= 10;
    			i--;
    		}
    	}
    	
    	if(i < 10 && i > 0) 
    		System.out.printf("%s%.4fE%s0%d", primSimb, entradaModulo, segSimb, i);
    	else if(i > - 10 && i < 0)    		
    		System.out.printf("%s%.4fE%s0%d", primSimb, entradaModulo, segSimb, i*-1);
    	else
    		System.out.printf("%s%.4fE%s0%d", primSimb, entradaModulo, segSimb, i*-1);
    	
    	leitor.close();
    }


}
