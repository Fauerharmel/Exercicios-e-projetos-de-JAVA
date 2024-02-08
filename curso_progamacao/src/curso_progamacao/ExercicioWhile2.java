package curso_progamacao;

import java.util.Scanner;

public class ExercicioWhile2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite as coordenadas:");

		int x = sc.nextInt();
		int y = sc.nextInt();
		if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		while (!(x == 0 || y == 0)) {
			System.out.println("Digite novamente as coordenadas:");
			x = sc.nextInt();
			y = sc.nextInt();
			if (x > 0 && y > 0) {
				System.out.println("Q1");
			} else if (x > 0 && y < 0) {
				System.out.println("Q4");
			} else if (x < 0 && y > 0) {
				System.out.println("Q2");
			} else if (x < 0 && y < 0) {
				System.out.println("Q3");
			}
		}
		sc.close();
	}
}