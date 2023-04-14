package LacoCondicional;

import java.util.Scanner;

public class Exer3if {

	public static void main(String[] args) {
		String nome;
		int idade;
		boolean doacao=false;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Nome do doador: ");
		nome = leia.next();
		System.out.println("Digite a Idade do doador: ");
		idade = leia.nextInt();
		System.out.println("Primeira doação de sangue? Se sim digite 'true'. Se não digite 'false'");
		doacao = leia.nextBoolean();
		
		
		if ((idade>=18 && idade<60) || (idade>=60 && idade<=69 && doacao==false)) {
			System.out.println(nome+" está apta para doar sangue!");
		} else if ((idade>=60 && idade<=69 && doacao==true) || idade<18 || idade>69) {
			System.out.println(nome+" não está apta para doar sangue!");
		}

	}

}
