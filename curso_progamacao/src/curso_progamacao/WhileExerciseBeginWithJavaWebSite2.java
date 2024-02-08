package curso_progamacao;

// Write a program to calculate the sum of first 10 natural number.
public class WhileExerciseBeginWithJavaWebSite2 {
	public static void main(String[] args) {
		int x = 0, sum = 0, num = 10;

		while (x <= num) {
			sum += x;
			x++;
// x += y in Java is the same as x = x + y. It is a compound assignment operator.
			System.out.println(sum);
		}

	}
}
