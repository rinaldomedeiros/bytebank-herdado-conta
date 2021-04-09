package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Iterator;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(22, 21);
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc1);

		
		boolean igual = cc1.equals(cc2);
		System.out.println(igual);
		
		boolean existe = lista.contains(cc2);
		
		System.out.println("J� existe? " + existe);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
	}

}
