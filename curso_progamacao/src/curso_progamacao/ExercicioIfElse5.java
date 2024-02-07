package curso_progamacao;

import java.util.Scanner;

public class ExercicioIfElse5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código do item que deseja:");	
		System.out.println("Digite a quantidade que deseja:");
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double valorTotal;
		if (codigo == 1) {
				valorTotal = quantidade * 4;
				System.out.printf("O total a ser pago é %.2f%n", valorTotal);
		}
		else if (codigo == 2) {
			valorTotal = quantidade * 4.5;
			System.out.printf("O total a ser pago é %.2f%n", valorTotal);
		}
		else if (codigo == 3) {
			valorTotal = quantidade * 5;
			System.out.printf("O total a ser pago é %.2f%n", valorTotal);
		}
		else if (codigo == 4) {
			valorTotal = quantidade * 2;
			System.out.printf("O total a ser pago é %.2f%n", valorTotal);
		}
		else if (codigo == 5) {
			valorTotal = quantidade * 1.5;
			System.out.printf("O total a ser pago é %.2f%n", valorTotal);
		}
		else if (codigo > 5 || codigo < 1 ) {
			System.out.println("Código inválido");
		}
	}
}