package com.cosmo.dio.desafios.contador.exception;

public class ParametrosException extends Exception {

  public ParametrosException() {
    System.err.println("O segundo parâmetro deve ser maior que o primeiro.");
  }
}