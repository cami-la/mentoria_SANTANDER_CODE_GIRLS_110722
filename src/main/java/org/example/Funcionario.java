package org.example;

public abstract class Funcionario {
  //atributos
  private String nome;
  private String cpf;
  protected final Double SALARIO_MINIMO = 1000.0;

  public Funcionario(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  public abstract double calculaSalario();


}
