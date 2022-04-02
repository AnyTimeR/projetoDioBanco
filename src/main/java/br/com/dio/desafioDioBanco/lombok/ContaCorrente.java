package br.com.dio.desafioDioBanco.lombok;

import javax.swing.JOptionPane;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		JOptionPane.showMessageDialog(null, "=== EXTRATO CONTA CORRENTE === \n Clique em OK para visualizar...");
		super.imprimirInfosComuns();
	}
}