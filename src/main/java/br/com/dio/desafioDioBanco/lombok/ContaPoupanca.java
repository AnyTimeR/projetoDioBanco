package br.com.dio.desafioDioBanco.lombok;

import javax.swing.JOptionPane;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);	
	}
	
	@Override
	public void imprimirExtrato() {
		JOptionPane.showMessageDialog(null, "=== EXTRATO CONTA POUPANÇA === \n Clique em OK para visualizar...");
		super.imprimirInfosComuns();
	}
}
