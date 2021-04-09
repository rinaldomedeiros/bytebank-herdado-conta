package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {

		ContaCorrente cc = new ContaCorrente(111, 1111);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(222, 2222);
		cp.deposita(200);
		
		cc.transfere(210, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	
	}

}
