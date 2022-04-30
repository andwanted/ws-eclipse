package entities;

public class Conta {

	private int conta;
	private String titular;
	private double saldo;


	public void setSaldoInicial(double saldoInicial) {
		this.saldo += saldoInicial;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double saldo) {
		this.saldo += saldo;
	}

	public void sacar(double saldo) {
		this.saldo -= saldo - -5.0;
	}
	
	public String toString() {
		return "Account "+ conta +
				", Holder: " + titular +
				", Balance: " + saldo;
	}

	//https://github.com/caelum/apostila-java-orientacao-objetos/blob/master/23-resolucoes-exercicios.md
	
}
