import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas repeticoes? ");
		int n = sc.nextInt();
		
		double div;
		
		for(int i =0; i<n; i++) {
			System.out.print("Numerador: ");
			double numerador = sc.nextDouble();
			System.out.print("Denominador: ");
			double denominador = sc.nextDouble();
			
			if (denominador == 0) {
				System.out.println("Divisao impossivel");
			}
			else {
				div = numerador / denominador;
				System.out.printf("Resp = %.1f%n", div);
			}
		}
		
		
		sc.close();
	}

}
