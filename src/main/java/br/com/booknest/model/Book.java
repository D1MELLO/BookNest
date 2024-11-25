package br.com.booknest.model;

public class Book {

    String corCapaLivro = "Amarelo";
    String tituloCapaLivro = "O Príncipe";
    String authorLivro = "Nicolau Maquiavel";
    int paginasLivro = 160;
    int lancamentoLivro = 2018;
    String editoraLivro = "Senado Federal";
    String idiomaLivro = "Português";
    double valorLivro = 8.00;
    boolean abertoLivro = false;
    int edicaoLivro = 248;

    public Book() {

    }

    public void abrirLivro() {
        System.out.println(abertoLivro);

    }
    public void veridiomaLivro() {
        System.out.println(idiomaLivro);
    }

    public void vertituloCapaLivro() {
        System.out.println(tituloCapaLivro);
    }


    public void verValorLivro() {
        System.out.println(valorLivro);

    }

    public void verCorCapaLivro() {
        System.out.println(corCapaLivro);
    }

    public void verEdicaoLivro() {
        System.out.println(edicaoLivro);
    }

    public void verLancamentoLivro() {
        System.out.println(lancamentoLivro);
    }

    public void verEditoraLivro() {
        System.out.println(editoraLivro);
    }

    public void veroAutorLivro() {
        System.out.println(authorLivro);
    }

    public void verPaginasLivro() {
        System.out.println(paginasLivro);
    }

    public String getCorCapaLivro() {
        return corCapaLivro;
    }

    public void setCorCapaLivro(String corCapaLivro) {
        this.corCapaLivro = corCapaLivro;
    }

    public String getTituloCapaLivro() {
        return tituloCapaLivro;
    }

    public void setTituloCapaLivro(String tituloCapaLivro) {
        this.tituloCapaLivro = tituloCapaLivro;
    }

    public String getAuthorLivro() {
        return authorLivro;
    }

    public void setAuthorLivro(String authorLivro) {
        this.authorLivro = authorLivro;
    }

    public int getPaginasLivro() {
        return paginasLivro;
    }

    public void setPaginasLivro(int paginasLivro) {
        this.paginasLivro = paginasLivro;
    }

    public int getLancamentoLivro() {
        return lancamentoLivro;
    }

    public void setLancamentoLivro(int lancamentoLivro) {
        this.lancamentoLivro = lancamentoLivro;
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

    public boolean isAbertoLivro() {
        return abertoLivro;
    }

    public void setAbertoLivro(boolean abertoLivro) {
        this.abertoLivro = abertoLivro;
    }

    public int getEdicaoLivro() {
        return edicaoLivro;
    }

    public void setEdicaoLivro(int edicaoLivro) {
        this.edicaoLivro = edicaoLivro;
    }

    public Book(String corCapaLivro, String tituloCapa, String authorLivro, int numeroPagina, int lancamentoAno, String editoraLivro, String idiomaLivro, int valorLivro, boolean abertoLivro) {

        this.corCapaLivro = corCapaLivro;
        this.authorLivro = authorLivro;
        this.editoraLivro = editoraLivro;
        this.tituloCapaLivro = tituloCapa;
        this.paginasLivro = numeroPagina;
        this.lancamentoLivro = lancamentoAno;
        this.valorLivro = valorLivro;
        this.idiomaLivro = idiomaLivro;
        this.abertoLivro = abertoLivro;

    }

}