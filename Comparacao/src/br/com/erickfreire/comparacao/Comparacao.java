package br.com.erickfreire.comparacao;

import java.util.Scanner;

public class Comparacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.print("Informe o primeiro valor: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		numero2 = entrada.nextInt();
		
		if(numero1 == numero2)
			System.out.printf("%d == %d%n", numero1, numero2);
		
		if(numero1 != numero2)
			System.out.printf("%d != %d%n", numero1, numero2);
		
		if(numero1 < numero2)
			System.out.printf("%d < %d%n", numero1, numero2);
		
		if(numero1 > numero2)
			System.out.printf("%d > %d%n", numero1, numero2);
		
		if(numero1 <= numero2)
			System.out.printf("%d <= %d%n", numero1, numero2);
		
		if(numero1 >= numero2)
			System.out.printf("%d >= %d%n", numero1, numero2);


	}

}
