package curso_progamacao;

import java.util.Scanner;

public class Exercicios_ifelse1 {
	public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		int x = sc.nextInt();
		
		if (x < 0) {
			System.out.println("negativo");
			}
			else { 
				System.out.println("não negativo.");
			}
	}
		}
}


