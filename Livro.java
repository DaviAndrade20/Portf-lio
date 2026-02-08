public class Livro {
    public String titulo;
    public int paginas;
    public int paginasLidas;

    public void lerPaginas(int quantidade) {
        paginasLidas++;
    }
    
    @Override
    public String toString() {
        return "Livro: " + titulo + "/ Paginas Lidas: " + paginasLidas;
    }

}
