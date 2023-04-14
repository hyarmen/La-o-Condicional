package LacoCondicional;

import java.util.Scanner;

public class Exer1if {

	public static void main(String[] args) {
		int a, b, c, soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valor de A: ");
		a = leia.nextInt();
		System.out.println("Entre com o valor de B: ");
		b = leia.nextInt();
		System.out.println("Entre com o valor de C: ");
		c = leia.nextInt();
		
		soma = a+b;
		
		if (soma>c) {
			System.out.println("A Soma de A + B é Maior do que C");
		} else if (soma<c) {
			System.out.println("A Soma de A + B é Menor do que C");
		} else if (soma==c) {
			System.out.println("A Soma de A + B é Igual a C");
		}

	}

}
