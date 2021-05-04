import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valor1 = sc.nextDouble();
		double valor2 = sc.nextDouble();
		double valor3 = sc.nextDouble();
		double valor4 = sc.nextDouble();
		
		double Diferenca = (int) valor1*valor2-valor3*valor4;
		
		System.out.printf("Diferenca: %s ", Diferenca);
		
		
		sc.close();
		
	}

}
