import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		Parametros cliente = new Parametros(0, null, null, 0);

		/* Input */
		System.out.println("Por favor, digite o número da Conta : ");
		cliente.setNumeroConta(scanner.nextInt());

		System.out.println("Por favor, digite o número da Agência :");
		cliente.setAgencia(scanner.next());

		System.out.println("Por favor, digite o nome do Cliente :");

		// Consumir a quebra de linha pendente
		scanner.nextLine();
		cliente.setNomeCliente(scanner.nextLine());

		System.out.println("Por favor, digite o valor do Saldo :");
		cliente.setSaldo(scanner.nextDouble());

		/* Output */

		cliente.imprimir();
		scanner.close();
	}

}
