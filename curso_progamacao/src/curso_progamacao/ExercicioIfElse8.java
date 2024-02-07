package curso_progamacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioIfElse8 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o seu salario que calcularei o seu imposto de renda:");
		double salario = sc.nextDouble();
		double impostoDeRenda;
		
		
		if ( salario > 2000.01 && salario < 3000.00 ) {
			impostoDeRenda = ( salario - 2000 ) * 0.08;
			System.out.printf("Seu imposto cai na primeira faixa de cobrança e voce vai pagar %.2f%n", impostoDeRenda);
		}
		else if ( salario > 3000.01 && salario < 4500.00) {
			impostoDeRenda = (1000 *0.08) + (salario - 3000) * 0.18;
			System.out.printf("Seu imposto cai na segunda faixa de cobrança e voce vai pagar %.2f%n", impostoDeRenda);
		}
		else if ( salario > 4500.01 ) {
			impostoDeRenda = (1000 * 0.08) + (1500 * 0.18) + (salario-4500) * 0.28;
			System.out.printf("Seu imposto cai na ultima faixa de cobrança e voce vai pagar %.2f%n", impostoDeRenda);
		}
		else {
			System.out.println("Isento");
		}
			
		}
			
	
}
