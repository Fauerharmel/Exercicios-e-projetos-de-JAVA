package curso_progamacao;

import java.util.Scanner;

public class ExercicioIfElse2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if ( x % 2 == 0 ) {
			System.out.println("O número é par");
		
		}
		else {
			System.out.println("O número é impar");
			
		}
		
	}

}
