package curso_progamacao;

import java.util.Scanner;

// Write a program to find the factorial value of any number entered through the keyboard. 
public class WhileExerciseBeginWithJavaWebSite3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double i = x;
		while (x > 1) {
			i = i * (x - 1);
			x--;
		}
// int accepts values from - 2147483648 to 2147483647
// long increases the range a bit and double expands even more. 		
		System.out.println(i);
	}
}
