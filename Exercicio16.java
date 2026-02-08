public class Exercicio16 {
    public static void main(String[] args) {
        
        Livro livro = new Livro();

        livro.titulo = "It A Coisa";
        livro.paginas = 304;
        livro.paginasLidas = 70;

        livro.lerPaginas(livro.paginasLidas);

        System.out.println(livro);
    }
}
