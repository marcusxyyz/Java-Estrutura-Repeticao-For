import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos casos? ");
		int n = sc.nextInt();
		
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double media = 0;
		
		for (int i=0; i<n; i++) {
			System.out.println("Informe as notas ["+ (i+1) + "]");
			System.out.print("Primeira nota: ");
			nota1 = sc.nextDouble();
			System.out.print("Segunda nota: ");
			nota2 = sc.nextDouble();
			System.out.print("Terceira nota: ");
			nota3 = sc.nextDouble();
			System.out.println();
			
			media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
			System.out.printf("Media = %.1f%n", media);
			System.out.println();
		}
		
		sc.close();
	}

}
