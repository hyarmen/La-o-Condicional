package LacoCondicional;

import java.util.Scanner;

public class Exer3switch {

	public static void main(String[] args) {
		float n1, n2, operacao;
		int operador;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro número: ");
		n1 = leia.nextFloat();
		System.out.println("\nDigite o segundo número: ");
		n2 = leia.nextFloat();
		
		System.out.println("\nLista de operadores: ");
		System.out.println("\n1 - Soma");
		System.out.println("\n2 - Substração");
		System.out.println("\n3 - Multiplicação");
		System.out.println("\n4 - Divisão");
		operador = leia.nextInt();
		
		switch(operador) {
		case 1:
			operacao = n1+n2;
			System.out.printf("\nO resultado da operação é %.2f",operacao);
			break;
		case 2:
			operacao = n1-n2;
			System.out.printf("\nO resultado da operação é %.2f",operacao);
		case 3:
			operacao = n1*n2;
			System.out.printf("\nO resultado da operação é %.2f",operacao);
			break;
		case 4:
			operacao = n1/n2;
			System.out.printf("\nO resultado da operação é %.2f",operacao);
			break;
		default:
			System.out.println("\nEscolha um operador válido!");
		}

	}

}
