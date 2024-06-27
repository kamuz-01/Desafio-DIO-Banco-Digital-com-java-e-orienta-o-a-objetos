package org.BancoDigital;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente jesus = new Cliente();
        jesus.setNome("Jesus");

        Conta cc = new ContaCorrente(jesus);
        Conta poupanca = new ContaPoupanca(jesus);

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depositar na conta corrente: ");
                    double valorDeposito = scanner.nextDouble();
                    cc.depositar(valorDeposito);
                    System.out.println("Depósito realizado com sucesso!\n");
                    break;
                case 2:
                    System.out.print("Digite o valor para sacar da conta corrente: ");
                    double valorSaque = scanner.nextDouble();
                    cc.sacar(valorSaque);
                    break;
                case 3:
                    System.out.print("Digite o valor para transferir da conta corrente para a conta poupança: ");
                    double valorTransferencia = scanner.nextDouble();
                    cc.transferir(valorTransferencia, poupanca);
                    System.out.println("Transferência realizada com sucesso!\n");
                    break;
                case 4:
                    System.out.println("=== Extrato da Conta Corrente ===");
                    cc.imprimirExtrato();
                    System.out.println("===============================\n");
                    break;
                case 5:
                    System.out.println("=== Extrato da Conta Poupança ===");
                    poupanca.imprimirExtrato();
                    System.out.println("===============================\n");
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.\n");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("===== Menu =====");
        System.out.println("1. Depositar na Conta Corrente");
        System.out.println("2. Sacar da Conta Corrente");
        System.out.println("3. Transferir da Conta Corrente para a Conta Poupança");
        System.out.println("4. Ver Extrato da Conta Corrente");
        System.out.println("5. Ver Extrato da Conta Poupança");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }
}