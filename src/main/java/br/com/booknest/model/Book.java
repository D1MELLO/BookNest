package br.com.booknest.model;

public class Book {

    String corCapaLivro = "Red";
    String tituloCapa = "O Principe";
    String authorLivro = "Maquiavel";
    int numeroPagina = 92;
    int lancamentoAno = 1485;
    String editoraLivro = "Editora123";
    String idiomaLivro = "Português";
    double valorLivro = 40;

    public Book(String corCapaLivro, String tituloCapa, String authorLivro, int numeroPagina, int lancamentoAno, String editoraLivro, String idiomaLivro, int valorLivro) {

        this.corCapaLivro = corCapaLivro;
        this.authorLivro = authorLivro;
        this.editoraLivro = editoraLivro;
        this.tituloCapa = tituloCapa;
        this.numeroPagina = numeroPagina;
        this.lancamentoAno = lancamentoAno;
        this.valorLivro = valorLivro;
        this.idiomaLivro = idiomaLivro;


    }

    public Book() {

    }

    public void lerLivro() {

        System.out.println("Lendo Livro...");
    }


    public String getCorCapaLivro() {
        return corCapaLivro;
    }

    public void setCorCapaLivro(String corCapaLivro) {
        this.corCapaLivro = corCapaLivro;
    }

    public String getTituloCapa() {
        return tituloCapa;
    }

    public void setTituloCapa(String tituloCapa) {
        this.tituloCapa = tituloCapa;
    }

    public String getAuthorLivro() {
        return authorLivro;
    }

    public void setAuthorLivro(String authorLivro) {
        this.authorLivro = authorLivro;
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    public int getLancamentoAno() {
        return lancamentoAno;
    }

    public void setLancamentoAno(int lancamentoAno) {
        this.lancamentoAno = lancamentoAno;
    }

    public String getEditoraLivro() {
        return editoraLivro;
    }

    public void setEditoraLivro(String editoraLivro) {
        this.editoraLivro = editoraLivro;
    }

    public String getIdiomaLivro() {
        return idiomaLivro;
    }

    public void setIdiomaLivro(String idiomaLivro) {
        this.idiomaLivro = idiomaLivro;
    }

    public double getValorLivro() {
        return valorLivro;
    }

    public void setValorLivro(double valorLivro) {
        this.valorLivro = valorLivro;
    }
}