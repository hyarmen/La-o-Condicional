package LacoCondicional;

import java.util.Scanner;

public class Exer2switch {

	public static void main(String[] args) {
		String nome;
		int cargo;
		double salario, novoSalario, reajuste;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQual o seu nome? ");
		nome = leia.nextLine();
	
		System.out.println("\nLista de cargos: ");
		System.out.println("\n1 - Gerente");
		System.out.println("\n2 - Vendedor");
		System.out.println("\n3 - Supervisor");
		System.out.println("\n4 - Motorista");
		System.out.println("\n5 - Estoquista");
		System.out.println("\n6 - Técnico de TI");
		System.out.println("\nQual das opções corresponde ao seu cargo? ");
		cargo = leia.nextInt();
		System.out.println("\nQual o seu salário atual? ");
		salario = leia.nextFloat();
		
		switch(cargo) {
		case 1:
			reajuste = 1.10;
			novoSalario = salario*reajuste;
			System.out.println("\nNome do colaborador: "+nome);
			System.out.println("\nCargo: Gerente");
			System.out.printf("\nO seu salário com o reajuste é %.2f",novoSalario);
			break;
		case 2:
			reajuste = 1.07;
			novoSalario = salario*reajuste;
			System.out.println("\nNome do colaborador: "+nome);
			System.out.println("\nCargo: Vendedor");
			System.out.printf("\nO seu salário com o reajuste é %.2f",novoSalario);
		case 3:
			reajuste = 1.09;
			novoSalario = salario*reajuste;
			System.out.println("\nNome do colaborador: "+nome);
			System.out.println("\nCargo: Surpevisor");
			System.out.printf("\nO seu salário com o reajuste é %.2f",novoSalario);
			break;
		case 4:
			reajuste = 1.06;
			novoSalario = salario*reajuste;
			System.out.println("\nNome do colaborador: "+nome);
			System.out.println("\nCargo: Motorista");
			System.out.printf("\nO seu salário com o reajuste é %.2f",novoSalario);
			break;
		case 5:
			reajuste = 1.05;
			novoSalario = salario*reajuste;
			System.out.println("\nNome do colaborador: "+nome);
			System.out.println("\nCargo: Estoquista");
			System.out.printf("\nO seu salário com o reajuste é %.2f",novoSalario);
			break;
		case 6:
			reajuste = 1.08;
			novoSalario = salario*reajuste;
			System.out.println("\nNome do colaborador: "+nome);
			System.out.println("\nCargo: Técnico de TI");
			System.out.printf("\nO seu salário com o reajuste é %.2f",novoSalario);
			break;
		default:
			System.out.println("\nNão temos essa função!");
		}

	}

}
