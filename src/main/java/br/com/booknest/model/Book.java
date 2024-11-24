package br.com.booknest.model;

public class Book {

    String corCapaLivro = "Red";
    String tituloCapa = "O Principe";
    String authorLivro = "Maquiavel";

    public void lerLivro() {

        System.out.println("Lendo Livro...");
    }

    public String getCorCapaLivro() {
        return corCapaLivro;
    }

    public void setCorCapaLivro(String corCapaLivro) {
        this.corCapaLivro = corCapaLivro;
    }
}
