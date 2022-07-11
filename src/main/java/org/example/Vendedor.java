package org.example;

public class Vendedor extends Funcionario{
  //atributos
  private double comissao;
  private int numeroDeVendas;

  public Vendedor(String nome, String cpf, double comissao, int numeroDeVendas) {
    super(nome, cpf);
    this.comissao = comissao;
    this.numeroDeVendas = numeroDeVendas;
  }

  @Override
  public double calculaSalario() {
    return super.SALARIO_MINIMO + (numeroDeVendas * comissao);
  }

  public double getComissao() {
    return comissao;
  }

  public void setComissao(double comissao) {
    this.comissao = comissao;
  }

  public int getNumeroDeVendas() {
    return numeroDeVendas;
  }

  public void setNumeroDeVendas(int numeroDeVendas) {
    this.numeroDeVendas = numeroDeVendas;
  }
}
