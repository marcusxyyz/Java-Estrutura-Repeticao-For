import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas vezes devo repetir? ");
		int repeticao = sc.nextInt();
		
		int in = 0;
		int out = 0;
		for (int i=0; i<repeticao; i++) {
			System.out.print("Informe o valor [" + (i + 1) + "]: ");
			int x = sc.nextInt();
			
			if (x >= 10 && x <= 20) {
				in += 1;
			}
			else {
				out += 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}

}
