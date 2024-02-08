package curso_progamacao;

import java.util.Scanner;

public class ExercicioWhile3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Alcool = 0;
        int Gasolina = 0;
        int Diesel = 0;
        
        int x;
        do {
            System.out.println("Digite o tipo de combustível (1 - Álcool, 2 - Gasolina, 3 - Diesel, 4 - Encerrar):");
            x = sc.nextInt();
            if (x == 1) {
                Alcool++;
            } else if (x == 2) {
                Gasolina++;
            } else if (x == 3) {
                Diesel++;
            } else if (x != 4) {
                System.out.println("Digite um valor válido.");
            }
        } while (x != 4);

        System.out.println("Muito obrigado.");
        System.out.printf("Álcool: %d%n", Alcool);
        System.out.printf("Gasolina: %d%n", Gasolina);
        System.out.printf("Diesel: %d%n", Diesel);

        sc.close();
    }
}


/*
 * ; int y = sc.nextInt(); ; int z = sc.nextInt(); ; int Alcool; int Gasolina;
 * int Diesel; int end;
 * 
 * switch (x) { case 1: Alcool = x + 1; } switch (y) { case 2: Gasolina = y + 1;
 * } switch (z) { case 3: Diesel = z + 1; } switch (end) { case 4:
 * System.out.println("Muito Obrigado"); System.out.println("Alcool "); } } }
 */
