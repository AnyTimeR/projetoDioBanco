package br.com.dio.desafioDioBanco.lombok;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Alex Castro");
		cliente.setCpf("12345678900");
		
		Conta corrente = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		
	//Exemplo 1 - Depósito para conta corrente (retirar comentários para teste de código)
		//corrente.depositar(250);
		//corrente.imprimirExtrato();
		//JOptionPane.showMessageDialog(null, "Você depositou 250 reais para a conta corrente com sucesso!");
		
	//Exemplo 2 - Transferência conta corrente para poupança
		corrente.depositar(100);
		corrente.transferir(100, poupanca);
		corrente.imprimirExtrato();
		JOptionPane.showMessageDialog(null, "Você transferiu 100 reais para a conta poupança com sucesso!");
		poupanca.imprimirExtrato();

	//Exemplo 3 - Transferência conta poupança para corrente (retirar comentários para teste de código)
		//poupanca.transferir(100, corrente);
		//corrente.sacar(100);
		//JOptionPane.showMessageDialog(null, "Você transferiu 100 reais para a conta corrente com sucesso!");
		//corrente.imprimirExtrato();
		
	//Exemplo 4 - Saque em conta corrente
		//corrente.depositar(250);
		//corrente.sacar(250);
		//corrente.imprimirExtrato();
		//JOptionPane.showMessageDialog(null, "Você sacou 250 reais para a conta corrente com sucesso!");
	}
}
