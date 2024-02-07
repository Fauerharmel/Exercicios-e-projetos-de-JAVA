package curso_progamacao;

import java.util.Scanner;

public class ExecicioIfElse4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x > 24 || y > 24) {
			System.out.println("Valor inválido");
		}	else if (x >= y) {
				int t1 = (24 - x) + y;
				System.out.printf("O jogo durou %d horas", t1);

			} else {
				int t2 = y - x;
				System.out.printf("O jogo durou %d horas", t2);

			}
		}
	}

