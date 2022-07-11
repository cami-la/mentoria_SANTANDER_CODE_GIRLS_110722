package org.example;

public class Main {
  public static void main(String[] args) {
    //System.out.println("Hello world!");

    Vendedor vendedor1 = new Vendedor("camila", "123.456.789-00", 10.0, 5);
    System.out.println("Salario do Vendedor " + vendedor1.calculaSalario());

    Consultor consultor1 = new Consultor("consultor", "111.111.111-11", 100.50, 10);
    System.out.println("Salario do Consultor " + consultor1.calculaSalario());

  }
}