package curso_progamacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {;
public static void main(String[] args) {;
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double valor1 = sc.nextDouble();
	double valor2 = sc.nextDouble();
	
	
	double soma = valor1 + valor2;

	
	System.out.printf("A soma de %.2f e %.2f equivale a: %.2f%n ", valor1, valor2, soma);
	
	sc.close();
	
	



	}
}