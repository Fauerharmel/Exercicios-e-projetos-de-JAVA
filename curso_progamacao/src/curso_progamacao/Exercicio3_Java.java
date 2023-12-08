package curso_progamacao;

import java.util.Scanner;

public class Exercicio3_Java {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d;
		System.out.println("Digite 4 valores inteiros:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		int diferenca = (a*b-c*d);
		
		System.out.println("A diferença dos produtos dos dois primeiros números e dos dois últimos é " + diferenca);
	

	}

}
