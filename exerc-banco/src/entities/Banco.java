package entities;

public class Banco {
	
	private int numConta;
	private String nome;
	private double saldo;
	
	
	public Banco(int numConta, String nome, double depositoInicial) {
		this.numConta = numConta;
		this.nome = nome;
		deposito(depositoInicial);
	}
	
	public Banco(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
		
	public void deposito(double deposito) {
		this.saldo += deposito;
	}
	
	public void saque(double saldo) {
		this.saldo -= saldo + 5.00;
	}
	
	public String toString() {
		return  "Conta "
				+ numConta
				+ ", Nome: "
				+ nome
				+ ", Saldo: R$"
				+ String.format("%.2f", saldo);
	}
	
}
