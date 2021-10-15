package br.com.dio.calculadora;

import java.util.Scanner;

public class calc {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplic = multiplic(a,b);
		float divisao = divisao(a,b);
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplic);
		System.out.println(divisao);
		
		
			
	}

private static float divisao(float a, float b) {
	// TODO Auto-generated method stub
	return a/b;
}

private static int multiplic(int a, int b) {
	// TODO Auto-generated method stub
	return a*b;
}

private static int subtracao(int a, int b) {
	// TODO Auto-generated method stub
	return a-b;
}

private static int soma(int a, int b) {
	// TODO Auto-generated method stub
	return a+b;
}

}
