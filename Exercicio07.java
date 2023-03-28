import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um valor inteiro positivo: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println(i + " "+ i * i + " " + i * i * i);
		}
		
		
		sc.close();
	}

}
