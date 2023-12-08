package curso_progamacao;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2_Java {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area, pi = 3.1415926;
		
		System.out.println("Digite o raio do círculo:");
		raio = sc.nextDouble();
		
		area = raio * raio * pi;
		
		System.out.printf("A area do círculo é %.4f%n", area);
		
	}

}
