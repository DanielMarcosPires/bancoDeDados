package bancoDeDados;


public class Conta {
	double saldo;
    int agencia;
    int numero;
    String titular;
    
    public void depositar(double valor) {
    	this.saldo += valor;
    	System.out.println();
    	System.out.println("Seu saldo depositado foi: "+saldo+" R$ ");
    	System.out.println();
    }
    public boolean sacar(double valor) {
    	if(this.saldo >= valor) {
    		this.saldo -= valor;
    		System.out.println(saldo);
    		return true;
    	}else {
    		System.out.println("Impossivel sacar. Saldo atual: "+saldo);
    		return false;
    	}
    }
    
}
