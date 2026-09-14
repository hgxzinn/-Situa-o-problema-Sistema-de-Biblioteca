/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.livros;

/**
 *
 * @author henry61623916
 */
public class Biblioteca {
     public static void main(String[] args) {
     Livro livro1 = new Livro ("Memórias Póstumas de Brás Cubas", "Machado de assis", "Romance", 1881, 221, 70.0);
     Livro livro2 = new Livro ("Dom Casmurro", "Machado de assis", "Romance", 1899, 228, 60.0);
     Livro livro3 = new Livro ("Quincas Borba", "Machado de assis", "Romance", 1891, 272, 70.0);
     Livro livro4 = new Livro ("Esaú e Jacó", "Machado de assis", "Romance", 1904, 243, 60.0);
     Livro livro5 = new Livro ("Memorial de Aires", "Machado de assis", "Romance", 1908, 176, 50.0);
     Livro livro6 = new Livro ("Ressurreição", "Machado de assis", "Romance", 1872, 166, 30.0);
     Livro livro7 = new Livro ("A Mão e a Luva", "Machado de assis", "Romance", 1874, 118, 30.0);
     Livro livro8 = new Livro ("Helena", "Machado de assis", "Romance", 1876, 182, 30.0);
     Livro livro9 = new Livro ("Iaiá Garcia", "Machado de assis", "Romance", 1878, 177, 30.0);
     Livro livro10 = new Livro ("Casa velha", "Machado de assis", "Novela", 1886, 178, 40.0);
     Livro livro11 = new Livro ("Papéis avulsos", "Machado de assis", "Contos", 1882, 185, 40.0);        
     Livro livro12 = new Livro ("Histórias sem data", "Machado de assis", "Contos", 1884, 174, 40.0);
     Livro livro13 = new Livro ("Várias Histórias", "Machado de assis", "Contos", 1896, 150, 40.0);
     Livro livro14 = new Livro ("Páginas recolhidas", "Machado de assis", "Contos", 1899, 166, 35.0);
     Livro livro15 = new Livro ("Relíquias da casa velha", "Machado de assis", "Contos", 1906, 214, 40.0);
     Livro livro16 = new Livro("O Alienista", "Machado de Assis", "Novela", 1882, 120, 35.0);
     
    
     System.out.println("Titulo" + livro1.Livro);
     System.out.println("Autor" + livro1.Autor);
     System.out.println("Genero" + livro1.Genero);
     System.out.println("Ano de Publicação" + livro1.anoPublicacao);
     livro1.calcular();
     System.out.println("Número de páginas" + livro1.numeroPaginas);
     System.out.println("Preço" + livro1.preco);

     System.out.println("Titulo" + livro2.Livro);
     System.out.println("Autor" + livro2.Autor);
     System.out.println("Genero" + livro2.Genero);
     System.out.println("Ano de Publicação" + livro2.anoPublicacao);
     livro2.calcular();
     System.out.println("Número de páginas" + livro2.numeroPaginas);
     System.out.println("Preço" + livro2.preco);

     System.out.println("Titulo" + livro3.Livro);
     System.out.println("Autor" + livro3.Autor);
     System.out.println("Genero" + livro3.Genero);
     System.out.println("Ano de Publicação" + livro3.anoPublicacao);
     livro3.calcular();
     System.out.println("Número de páginas" + livro3.numeroPaginas);
     System.out.println("Preço" + livro3.preco);

     System.out.println("Titulo" + livro4.Livro);
     System.out.println("Autor" + livro4.Autor);
     System.out.println("Genero" + livro4.Genero);
     System.out.println("Ano de Publicação" + livro4.anoPublicacao);
     livro4.calcular();
     System.out.println("Número de páginas" + livro4.numeroPaginas);
     System.out.println("Preço" + livro4.preco);

     System.out.println("Titulo" + livro5.Livro); 
     System.out.println("Autor" + livro5.Autor);
     System.out.println("Genero" + livro5.Genero);
     System.out.println("Ano de Publicação" + livro5.anoPublicacao);
     livro5.calcular();
     System.out.println("Número de páginas" + livro5.numeroPaginas);
     System.out.println("Preço" + livro5.preco);

     System.out.println("Titulo" + livro6.Livro);
     System.out.println("Autor" + livro6.Autor);
     System.out.println("Genero" + livro6.Genero);
     System.out.println("Ano de Publicação" + livro6.anoPublicacao);
     livro6.calcular();
     System.out.println("Número de páginas" + livro6.numeroPaginas);
     System.out.println("Preço" + livro6.preco);

     System.out.println("Titulo" + livro7.Livro);
     System.out.println("Autor" + livro7.Autor);
     System.out.println("Genero" + livro7.Genero);
     System.out.println("Ano de Publicação" + livro7.anoPublicacao);
     livro7.calcular();
     System.out.println("Número de páginas" + livro7.numeroPaginas);
     System.out.println("Preço" + livro7.preco);

     System.out.println("Titulo" + livro8.Livro);
     System.out.println("Autor" + livro8.Autor);
     System.out.println("Genero" + livro8.Genero);
     System.out.println("Ano de Publicação" + livro8.anoPublicacao);
     livro8.calcular();
     System.out.println("Número de páginas" + livro8.numeroPaginas);
     System.out.println("Preço" + livro8.preco);

     System.out.println("Titulo" + livro9.Livro);
     System.out.println("Autor" + livro9.Autor);
     System.out.println("Genero" + livro9.Genero);
     System.out.println("Ano de Publicação" + livro9.anoPublicacao);
     livro9.calcular();
     System.out.println("Número de páginas" + livro9.numeroPaginas);
     System.out.println("Preço" + livro9.preco);

     System.out.println("Titulo" + livro10.Livro);
     System.out.println("Autor" + livro10.Autor);
     System.out.println("Genero" + livro10.Genero);
     System.out.println("Ano de Publicação" + livro10.anoPublicacao);
     livro10.calcular();
      System.out.println("Número de páginas" + livro10.numeroPaginas);
      System.out.println("Preço" + livro10.preco);

      System.out.println("Titulo" + livro11.Livro);
      System.out.println("Autor" + livro11.Autor);
      System.out.println("Genero" + livro11.Genero);
      System.out.println("Ano de Publicação" + livro11.anoPublicacao);
      livro11.calcular();
      System.out.println("Número de páginas" + livro11.numeroPaginas);
      System.out.println("Preço" + livro11.preco);

      System.out.println("Titulo" + livro12.Livro);
      System.out.println("Autor" + livro12.Autor);
      System.out.println("Genero" + livro12.Genero);
      System.out.println("Ano de Publicação" + livro12.anoPublicacao);
      livro12.calcular();
      System.out.println("Número de páginas" + livro12.numeroPaginas);
      System.out.println("Preço" + livro12.preco);

      System.out.println("Titulo" + livro13.Livro);
      System.out.println("Autor" + livro13.Autor);
      System.out.println("Genero" + livro13.Genero);
      System.out.println("Ano de Publicação" + livro13.anoPublicacao);
      livro13.calcular();
      System.out.println("Número de páginas" + livro13.numeroPaginas);
      System.out.println("Preço" + livro13.preco);

      System.out.println("Titulo" + livro14.Livro);
      System.out.println("Autor" + livro14.Autor);
      System.out.println("Genero" + livro14.Genero);
      System.out.println("Ano de Publicação" + livro14.anoPublicacao);
      livro14.calcular();
      System.out.println("Número de páginas" + livro14.numeroPaginas);
      System.out.println("Preço" + livro14.preco);

      System.out.println("Titulo" + livro15.Livro);
      System.out.println("Autor" + livro15.Autor);
      System.out.println("Genero" + livro15.Genero);
      System.out.println("Ano de Publicação" + livro15.anoPublicacao);
      livro15.calcular();
      System.out.println("Número de páginas" + livro15.numeroPaginas);
      System.out.println("Preço" + livro15.preco);
      
      livro16.preco = 40.0;
      System.out.println("Titulo" + livro16.Livro);
      System.out.println("Autor" + livro16.Autor);
      System.out.println("Genero" + livro16.Genero);
      System.out.println("Ano de Publicação" + livro16.anoPublicacao);
      livro16.calcular();
      System.out.println("Número de páginas" + livro16.numeroPaginas);
      System.out.println("Preço" + livro16.preco);
    }
}

