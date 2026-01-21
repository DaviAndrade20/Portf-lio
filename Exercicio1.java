// Cria função void que não recebe parâmetros e imprime a mensagem: "Olá, mundo das funções".

public class Exercicio1 {

    public static void main(String []args) {
        saudacao();
    }
    public static void saudacao() {
        System.out.println("Olá, mundo das funções."); // a funcao decide tudo. Ela tem a mensagem.
    }
}

/* Poderiam ter casos onde eu poderia colocar parâmetros. Exemplo:
public static void main(String []args) {
    saudacao("Olá mundo das funcoes.");
 }
    public static void saudacao(String x) {
        System.out.println(mensagem);
    }
}
 */