package br.com.dio.desafioDioBanco.lombok;

import javax.swing.JOptionPane;

public abstract class Conta implements IConta {
	
	protected static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInfosComuns() {
		JOptionPane.showMessageDialog(null, "TITULAR: " + this.cliente.getNome() +
											"\n AGÊNCIA: " + this.agencia +
											"\n NÚMERO: " + this.numero +
											"\n CPF: " + this.cliente.getCpf() +
											"\n SALDO: R$" + this.saldo);
	}
	
}
