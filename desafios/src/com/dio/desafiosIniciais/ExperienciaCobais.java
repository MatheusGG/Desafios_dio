package com.dio.desafiosIniciais;

import java.util.Scanner;

public class ExperienciaCobais {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int b;
	    int d=0,e=0,f=0,i,t;
	    String numero;
	    int a=input.nextInt();
	    int cobaias = a;
	    t = 0;
	    input.nextLine();
	    for(i = 0; i < cobaias; i++){
	    	String c = input.nextLine();
	    	numero = "";
	    	b = c.indexOf(" ");
	    	for(int q = 0; q < b; q++) {
		    	numero += c.charAt(q);
		    }
		    int num = Integer.parseInt(numero);
		    t += num;
		    if(c.contains("C")) {
		    	d += num;
		    } else if(c.contains("S")) {
		    	e += num;
		    } else {
		    	f += num;
		    }
	    }
	
	    
	    

	    System.out.printf("Total: %d cobaias", t);
	    System.out.printf("\nTotal de coelhos: %d", d);
	    System.out.printf("\nTotal de ratos: %d", f);
	    System.out.printf("\nTotal de sapos: %d", e);
	    System.out.printf("\nPercentual de coelhos: %.2f %s", (double) d / t * 100, "%");
	    System.out.printf("\nPercentual de ratos: %.2f %s", (double) f / t * 100, "%");
	    System.out.printf("\nPercentual de sapos: %.2f %s", (double) e / t * 100, "%");
	    
	
	}

}
