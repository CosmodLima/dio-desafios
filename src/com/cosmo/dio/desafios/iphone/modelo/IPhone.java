package com.cosmo.dio.desafios.iphone.modelo;

import com.cosmo.dio.desafios.iphone.interface_telefone.AparelhoTelefonico;
import com.cosmo.dio.desafios.iphone.interface_telefone.NavegadorInternet;
import com.cosmo.dio.desafios.iphone.interface_telefone.RepodutorMusicial;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, RepodutorMusicial {

  public void ligar() {
    System.out.println("\nLigando...");
  }

  public void atender() {
    System.out.println("\nAtendendo ligação...");
  }

  public void iniciarCorrerioVoz() {
    System.out.println("\nIniciando Correio de Voz (Caixa Postal)......");
  }

  public void exibirPagina() {
    System.out.println("\nExibindo página no navegador");
  }

  public void adicionarNovaAba() {
    System.out.println("\nAbrindo nova aba no navegador");
  }

  public void atualizarPagina() {
    System.out.println("\nAtualizando página no nevegador...");
  }

  public void tocarMuscia() {
    System.out.println("\nTocando música...");
  }

  public void pausarMusica() {
    System.out.println("\nMusica pausada");
  }

  public void selecionarMusica() {
    System.out.println("\nSelecionando música...");
  }

}
