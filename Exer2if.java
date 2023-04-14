package LacoCondicional;

import java.util.Scanner;

public class Exer2if {

	public static void main(String[] args) {
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva um número: ");
		num = leia.nextInt();
		
		if ((num%2)==0 && num>=0) {
			System.out.println("\nO número "+num+" é par e positivo!");
		} else if ((num%2)==0 && num<0) {
			System.out.println("\nO número "+num+" é par e negativo!");
		} else if ((num%2)!=0 && num>=0) {
			System.out.println("\nO número "+num+" é ímpar e positivo!");
		} else if ((num%2)!=0 && num<0) {
			System.out.println("\nO número "+num+" é ímpar e negativo!");
		}

	}

}
