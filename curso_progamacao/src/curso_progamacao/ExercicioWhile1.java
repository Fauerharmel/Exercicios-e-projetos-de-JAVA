package curso_progamacao;

import java.util.Scanner;

public class ExercicioWhile1 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int senha = 2002;
			
			System.out.println("Digite sua senha:");	
			senha = sc.nextInt();
			while ( senha != 2002 ) {
				System.out.println("Senha invalida.");
				senha = sc.nextInt();
			}
			System.out.println("Acesso Permitido.");
			sc.close();
	}
}
