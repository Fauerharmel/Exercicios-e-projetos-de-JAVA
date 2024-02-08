package curso_progamacao;

import java.util.Scanner;

// Write a program to print Fibonacci series of n terms where n is input by user :
public class WhileExcerciseBeginWithJavaWebSite4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a posicao da sequencia de Fibonacci que deseja saber o numero.");
		int n = sc.nextInt();
		int first = 0;
		int second = 1;
		int i = 2;
	// i needs to start at 2 because the first number is 0 (null) and the number 1 repeats it self.
		int next = 0;
		while ( i <= n ) {
			next = first + second;
			first = second;
			second = next;
			
			i++;
			
		}
		System.out.println(next);
	}
}
