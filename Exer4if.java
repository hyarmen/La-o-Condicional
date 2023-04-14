package LacoCondicional;

import java.util.Scanner;

public class Exer4if {

	public static void main(String[] args) {
		String car1, car2, car3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Vertebrado ou Invertebrado?");
		car1 = leia.next();
		
		if (car1.equalsIgnoreCase("vertebrado")) {
			System.out.println("Ave ou Mamífero?");
			car2 = leia.next();
			if (car2.equalsIgnoreCase("ave")) {
				System.out.println("Carnívoro ou Onívoro?");
				car3 = leia.next();
				if (car3.equalsIgnoreCase("carnívoro")) {
					System.out.println("Águia");
				} else if (car3.equalsIgnoreCase("onívoro")) {
					System.out.println("Pomba");
				} else {
					System.out.println("Por favor, digite um valor válido!");
				}
			} else if (car2.equalsIgnoreCase("mamífero")) {
				System.out.println("Herbívoro ou Onívoro?");
				car3 = leia.next();
				if (car3.equalsIgnoreCase("herbívoro")) {
					System.out.println("Vaca");
				} else if (car3.equalsIgnoreCase("onívoro")) {
					System.out.println("Homem");
				} else {
					System.out.println("Por favor, digite um valor válido!");
				}
			}
		} else if (car1.equalsIgnoreCase("invertebrado")) {
			System.out.println("Inseto ou Anelídeo?");
			car2 = leia.next();
			if (car2.equalsIgnoreCase("inseto")) {
				System.out.println("Hematófago ou Herbívoro?");
				car3 = leia.next();
				if (car3.equalsIgnoreCase("hematófago")) {
					System.out.println("Pulga");
				} else if (car3.equalsIgnoreCase("herbívoro")) {
					System.out.println("Lagarta");
				} else {
					System.out.println("Por favor, digite um valor válido!");
				}
			} else if (car2.equalsIgnoreCase("anelídeo")) {
				System.out.println("Hematófago ou Onívoro?");
				car3 = leia.next();
				if (car3.equalsIgnoreCase("Hematófago")) {
					System.out.println("Sanguessuga");
				} else if (car3.equalsIgnoreCase("onívoro")) {
					System.out.println("Minhoca");
				} else {
					System.out.println("Por favor, digite um valor válido!");
				}
			}
		} else {
			System.out.println("Por favor, digite um valor válido!");
		}
	}

}
