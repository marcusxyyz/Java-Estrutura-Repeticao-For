import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		int n = sc.nextInt();
		
		int fatorial = 1;
		
		for (int i = n; i>1; i--) {
			fatorial *= i;
		}
		
		System.out.println("Fatorial de ("+ n+ ") = "+fatorial);
		
		sc.close();
	}

}
