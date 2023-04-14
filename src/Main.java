import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try {

			Scanner entrada = new Scanner(System.in);

			System.out.println("número para dividir por 0");
			int num = entrada.nextInt();

			System.out.println(num / 0);

			entrada.close();

			} catch (ArithmeticException e) {

			System.out.println("Não se pode dividir por zero ");

			} catch (InputMismatchException e) {

			System.out.println("Deve ingressar um número");

			} catch (Exception e) {

			System.out.println("erro inesperado");

			}
		
			finally {
				
			System.out.println("Fim do exercicio");
			
			}

	}

}

