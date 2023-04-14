package LacoCondicional;

import java.util.Scanner;

public class Exer1switch {

	public static void main(String[] args) {
		int op, quant, valor, valorTotal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nCardápio");
		System.out.println("\n1 - Cachorro Quente R$10,00");
		System.out.println("\n2 - X-Salada R$15,00");
		System.out.println("\n3 - X-Bacon R$18,00");
		System.out.println("\n4 - Bauru R$12,00");
		System.out.println("\n5 - Refrigerante R$8,00");
		System.out.println("\n6 - Suco de Laranja R$13,00");
		System.out.println("\nQual a sua escolha? ");
		op = leia.nextInt();
		System.out.println("\nQual a quantidade? ");
		quant = leia.nextInt();
		
		switch(op) {
		case 1:
			valor = 10;
			valorTotal = quant*valor;
			System.out.println("\nO total da sua conta é "+valorTotal);
			break;
		case 2:
			valor = 15;
			valorTotal = quant*valor;
			System.out.println("\nO total da sua conta é "+valorTotal);
		case 3:
			valor = 18;
			valorTotal = quant*valor;
			System.out.println("\nO total da sua conta é "+valorTotal);
			break;
		case 4:
			valor = 12;
			valorTotal = quant*valor;
			System.out.println("\nO total da sua conta é "+valorTotal);
			break;
		case 5:
			valor = 8;
			valorTotal = quant*valor;
			System.out.println("\nO total da sua conta é "+valorTotal);
			break;
		case 6:
			valor = 13;
			valorTotal = quant*valor;
			System.out.println("\nO total da sua conta é "+valorTotal);
			break;
		default:
			System.out.println("\nNão temos essa opção no nosso cardápio!");
		}

	}

}
