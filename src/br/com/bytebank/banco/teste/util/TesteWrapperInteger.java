package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		Integer idadeRef = 29; //Autoboxinng, é criado um objeto do tipo Integer
		int primitivo = new Integer(21); //que locura!! unboxing
		
		List<Integer> lista = new ArrayList<>();
		lista.add(idadeRef); //ok
		lista.add(primitivo); //autoboxing
		
		int i1 = lista.get(0); //unboxing
		Integer i2 = lista.get(1); //ok
		
		System.out.println(i1);
		System.out.println(i2);
		
		
		Integer valorRef = Integer.valueOf(33);
		int valorPri = valorRef.intValue();
		
		System.out.println(valorPri);
		
		
		
		
		
	}
}