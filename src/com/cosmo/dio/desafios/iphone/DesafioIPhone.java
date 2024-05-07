package com.cosmo.dio.desafios.iphone;

import com.cosmo.dio.desafios.iphone.modelo.IPhone;

public class DesafioIPhone {
  public static void main(String[] args) {
    var iPhone = new IPhone();

    System.out.println("\n#Funções do Aparelho Telefônico.");

    iPhone.ligar();
    iPhone.atender();
    iPhone.iniciarCorrerioVoz();

    System.out.println("Funções do Navegador de Internet");

    iPhone.exibirPagina();
    iPhone.adicionarNovaAba();
    iPhone.atualizarPagina();

    System.out.println("Funções do Reprodutor de Músicas");

    iPhone.tocarMuscia();
    iPhone.pausarMusica();
    iPhone.selecionarMusica();
  }
}
