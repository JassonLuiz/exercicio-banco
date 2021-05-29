package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Banco banco;
		
		System.out.print("Entre com o número da conta: ");
		int numConta = sc.nextInt();
		System.out.print("Entre com o nome da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
        System.out.print("A um deposito inicial (s/n)? ");
        char resp = sc.next().charAt(0);

        
        if(resp == 's') {
        	System.out.print("Entre com o deposito inicial: ");
        	double depositoInicial = sc.nextDouble();
        	banco = new Banco(numConta, nome, depositoInicial);
        }
        else {
        	banco = new Banco(numConta, nome);
        }
        
        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(banco);
        
        System.out.println();
        System.out.print("Entre com um deposito: ");
        double valorDeposito = sc.nextDouble();
        banco.deposito(valorDeposito);
        System.out.println("Saldo da conta atualizado:");
        System.out.println(banco);
        
        System.out.println();
        System.out.print("Entre com um valor de saque: ");
        double saque = sc.nextDouble();
        banco.saque(saque);
        System.out.println("Saldo da conta atualizado: ");
        System.out.println(banco);
		
		
		sc.close();
	}

}
