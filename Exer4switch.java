package LacoCondicional;

import java.util.Scanner;

public class Exer4switch {

	public static void main(String[] args) {
		int operacao;
		double saldo=1000.00, valor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nBem-vinde! Opções disponíveis: ");
		System.out.println("\n1 - Saldo");
		System.out.println("\n2 - Saque");
		System.out.println("\n3 - Depósito");
		System.out.println("\nQual o número da operação que deseja fazer?");
		operacao = leia.nextInt();
		
		switch(operacao) {
		case 1:
			System.out.println("\nO seu saldo é de "+saldo);
			break;
		case 2:
			System.out.println("\nQual valor deseja sacar?");
			valor = leia.nextFloat();
			if (saldo<valor) {
				System.out.println("\nSaldo Insuficiente!");
			} else {
				System.out.println("\nNovo saldo: "+(saldo-valor));
			}
			break;
		case 3:
			System.out.println("\nQual valor deseja depositar?");
			valor = leia.nextFloat();
			System.out.println("\nNovo saldo: "+(saldo+valor));
			break;
		default:
			System.out.println("\nOperação Inválida!");
		}

	}

}
