package bancoDeDados;

import java.util.Scanner;

public class CriarConta {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Conta conta = new Conta();
		int banco;
		
		System.err.println("Seu saldo "+conta.saldo+" R$");
		System.out.println("==============================");
		
		
			for(int i = 0; i<10; i++) {	
				System.err.println("Digite (1) para depositar e digite (2) para sacar: ");
				banco = scanner.nextInt();
				
				if(banco == 1 || banco == 2) {
					switch(banco) {
						case(1):
							System.out.println("Quanto deseja depositar");
							System.out.println("Saldo atual: "+conta.saldo);
							System.out.println();
							conta.depositar(scanner.nextDouble());
							System.out.println("===============================");
							System.err.println("Seu saldo "+conta.saldo+" R$");
				
						break;
						case(2):
							System.out.println("Quanto deseja queira sacar.");
							conta.sacar(scanner.nextDouble());
							System.err.println("Seu saldo "+conta.saldo+" R$");
						break;
					}	
				}else {
					System.out.println("Leia primeiro!");
			  }
			}
	}
}
