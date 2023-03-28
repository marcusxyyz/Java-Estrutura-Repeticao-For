import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um numero de parada: ");
		int numParada = sc.nextInt();
		
		for(int i=0; i <= numParada; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		
		sc.close();
	}

}
