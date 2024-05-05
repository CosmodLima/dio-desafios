package com.cosmo.dio.desafios.controle_de_fluxo.contador;

import java.util.Scanner;

import com.cosmo.dio.desafios.controle_de_fluxo.exception.ParametrosException;

public class Contador {
  public static void main(String[] args) {
    /*
     * O sistema deverá receber dois parâmetros via terminal que representarão dois
     * números inteiros, com estes dois números você deverá obter a quantidade de
     * interações (for) e realizar a impressão no console (System.out.print) dos
     * números incrementados, exemplo:
     * 
     * Se você passar os números 12 e 30, logo teremos uma interação (for) com 18
     * ocorrências para imprimir os números, exemplo: "Imprimindo o número 1",
     * "Imprimindo o número 2" e assim por diante.
     * Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar
     * a exceção customizada chamada de ParametrosInvalidosException com a segunda
     * mensagem: "O segundo parâmetro deve ser maior que o primeiro"
     * Crie o projeto DesafioControleFluxo
     * Dentro do projeto, crie a classe Contador.java para realizar toda a
     * codificação do nosso programa.
     * Dentro do projeto, crie a classe ParametrosInvalidosException que
     * representará a exceção de negócio no sistema.
     */

    Scanner input = new Scanner(System.in);

    String mensagem = """
        -------------------Desafio Controle de fluxo---------------------
        Digite dois valores para saber o número de interações entre eles.
        1º valor:
          """;
    System.out.println(mensagem);
    int paramentro1 = lerInteiro(input);

    System.out.println("2º valor: ");
    int paramentro2 = lerInteiro(input);

    try {
      contar(paramentro1, paramentro2);
    } catch (ParametrosException e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }

  static void contar(int parametroUm, int parametroDois) throws ParametrosException {

    if (parametroUm >= parametroDois) {
      throw new ParametrosException();
    } else {
      int diferenca = parametroDois - parametroUm;
      for (int i = 1; i <= diferenca; ++i) {
        System.out.println("Imprimindo a " + i + "ª interação: " + i);
      }
    }
  }

  static int lerInteiro(Scanner scanner) {
    while (true) {
      try {
        return Integer.parseInt(scanner.nextLine());
      } catch (NumberFormatException e) {
        System.out.println("Entrada inválida. Digite um número inteiro:");
      }
    }
  }

}