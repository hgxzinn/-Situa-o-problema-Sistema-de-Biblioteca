/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.livros;

/**
 *
 * @author henry61623916
 */
public class Livro {
  String Livro;
  String Autor;
  String Genero;
  int anoPublicacao;
  int numeroPaginas;
  int anoAtual;
  int idade;
  double preco;

public Livro(String tituloInformado, String autorInformado, String generoInformado, int anoPublicacaoInformado, int numeroPaginasInformado, double precoInformado) {

    Livro = tituloInformado;
    Autor = autorInformado;
    Genero = generoInformado;
    anoPublicacao = anoPublicacaoInformado;
    anoAtual = 2026;
    numeroPaginas = numeroPaginasInformado;
    preco = precoInformado;
}

public void calcular() {
    idade = anoAtual - anoPublicacao;
    System.out.println("Idade é: " + idade);
}
}