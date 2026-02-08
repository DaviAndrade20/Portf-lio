public class Exercicio14 {
    public static void main(String[] args) {
        Cliente c = new Cliente();

        c.nome = "Alice";
        c.idade = 27;

        c.aniversario(c.idade);

        System.out.println(c);
    }
}
