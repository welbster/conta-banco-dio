
public class Parametros {

	private int numeroConta;
	private String agencia;
	private String nomeCliente;
	private double saldo;

	/* Constructor */
	public Parametros(int numeroConta, String agencia, String nomeCliente, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	/* Getters and Setters */

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/* Output */

	public void imprimir() {
		System.out.format(
				"Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
				nomeCliente, agencia, numeroConta, saldo);
	}

}
