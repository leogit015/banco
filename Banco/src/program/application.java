package program;

import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Conta cont = new Conta();
		
		System.out.print("Digite o numero da conta: ");
		cont.numeroConta = sc.nextInt();
		System.out.print("Digite o nome do titular: ");
		cont.nomeTitular = sc.next();
		System.out.print("Deseja fazer um depósito inicial (s/n)? ");
		String resposta = sc.next();

        if (resposta.equalsIgnoreCase("s")) {
            // Código a ser executado se a resposta for "s"
            System.out.println("Qual o valor deseja depositar?");
            cont.deposito = sc.nextDouble();
            System.out.println("Dados da conta: ");
            System.out.print("Conta " + cont.numeroConta + ", " + "Titular: " + cont.nomeTitular +", " + "Saldo: " + "R$" + cont.deposito );
            // Adicione aqui o código para lidar com o depósito inicial
        } else if (resposta.equalsIgnoreCase("n")) {
            // Código a ser executado se a resposta for "n"
            System.out.println("Dados da conta: ");
            System.out.print("Conta: " + cont.numeroConta + ", " + "Titular: " + cont.nomeTitular +", " + "Saldo: R$" + String.format("%.2f", cont.deposito) );
            // Adicione aqui o código para lidar com a situação sem depósito inicial
        } else {
            // Código a ser executado se a resposta não for "s" nem "n"
            System.out.println("Resposta inválida. Por favor, responda com 's' ou 'n'.");
            // Adicione aqui o código para lidar com uma resposta inválida, se necessário
        }
		
        	System.out.println();
        	System.out.print("Digite o valor que deseja depositar: ");
       		double valorDeposito = sc.nextDouble();
        	cont.Depositar(valorDeposito);
        	
        	System.out.println("Dados atualizados:");
        	System.out.println("Conta: " + cont.numeroConta + ", " + "Titular: " + cont.nomeTitular + ", " + "Saldo: R$" + String.format("%.2f", cont.deposito));

        	System.out.println();
        	System.out.print("Digite o valor que deseja sacar: ");
        	double valorSaque = sc.nextDouble();
        	cont.Sacar(valorSaque);
        	
        	System.out.println("Dados atualizados:");
        	System.out.println("Conta: " + cont.numeroConta + ", " + "Titular: " + cont.nomeTitular + ", " + "Saldo: R$" + String.format("%.2f", cont.deposito));
        
		
		
		sc.close();
		
		
	}

}
