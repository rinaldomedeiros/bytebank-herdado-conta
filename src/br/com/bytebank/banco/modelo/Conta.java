package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe que representa uma conta no ByteBank
 * @author Rinaldo
 *
 */
public abstract class Conta implements Comparable<Conta>, Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;
    
    /**
     * Construtor para inicializar o objeto Conta a partir da agencia e numero
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero) {
    	this.agencia = agencia;
    	this.numero = numero;
//    	this.saldo = 100;
    	total++;
//		System.out.println("Criando uma conta.");
	}

    public abstract void deposita(double valor);

    
    /**
     * Valor precisa ser menor ou igual ao saldo
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException{
        if(this.saldo < valor) {
        	throw new SaldoInsuficienteException("Saldo: " + this.saldo + "Valor: " + valor);
        }
        
        this.saldo -= valor;
     
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        	this.saca(valor);
            destino.deposita(valor);
    }
    
    @Override
    public String toString() {
    	return "Numero: " + this.numero + ", Agencia: " + this.agencia;
    }

    
    @Override
    public boolean equals(Object ref) {
    	
    	Conta conta = (Conta) ref;
    	
    	if(this.agencia != conta.agencia) {
    		return false;
    	}

    	if(this.numero != conta.numero) {
    		return false;
    	}
    	
    	return true;
    	
    }
    
    
    @Override
    public int compareTo(Conta outra) {
//            return Double.compare(this.saldo, outra.saldo);
            return this.titular.getNome().compareTo(outra.getTitular().getNome());
    }
    
    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal() {
		return Conta.total;
	}
}