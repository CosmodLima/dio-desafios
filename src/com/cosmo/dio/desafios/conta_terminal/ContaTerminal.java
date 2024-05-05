package com.cosmo.dio.desafios.conta_terminal;

import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner usuario = new Scanner(System.in);
    String nomeCliente = "";
    String tipoDaConta = "Corrente";
    double saldoAtualizado = 0;
    int opcao = 0;

    System.out.println("*******************************************");
    System.out.println("\nBem vindo a conta terminal");
    System.out.println("Para começar com as operações bancarias crie sua conta bancaria");
    System.out.println("\nDigite seu nome com sobrenome:");
    nomeCliente = usuario.nextLine();
    System.out.println("Para continuar com a criação de sua conta precisamos que você digite um valor inicial a conta");
    System.out.println("Valor inicial:");
    double saldo = usuario.nextDouble();


    String menu = """
        Operações

        1- Consultar saldo.
        2- Receber valor.
        3- Transferir valor.
        4- Sair.

        Digite a opção que desejada:
          """;

    System.out.println("*******************************************");
    System.out.println("");
    System.out.println("Dados iniciais do cliente:");
    System.out.println("Nome:              " + nomeCliente);
    System.out.println("Tipo de Conta:     " + tipoDaConta);
    System.out.println("Saldo inicial:     " + saldo);
    System.out.println("");
    System.out.println("*******************************************");
    System.out.println("");

    while (opcao != 4) {
      System.out.println("");
      System.out.println(menu);
      opcao = usuario.nextInt();
      System.out.println("");

      switch (opcao) {
        case 1:
          System.out.println("O saldo atual é R$ " + saldo);
          break;
        case 2:
          System.out.println("Informe o valor a receber:");
          saldoAtualizado += usuario.nextDouble();
          saldo += saldoAtualizado;
          System.out.println("Saldo atualizado R$ " + saldo);
          break;
        case 3:
          System.out.println("Informe o valor que deseja transferir:");
          saldoAtualizado = usuario.nextDouble();
          System.out.println("");
          if (saldoAtualizado <= 2200) {
            System.out.println("Saldo atualizado R$ " + (saldo - saldoAtualizado));
          } else {
            System.out.println("Valor muito alto para transferência ou não possui saldo suficiente.");
            System.out.println("A um limite de transferência mínima de R$ 1,00 e máxima R$ 2200,0");
          }
          break;
        case 4:
          System.out.println("Encerrando o programa...");
          break;
        default:
          System.out.println("Opção invalida");
      }
    }
  }
}
