// Aniversario do Cliente (Aumenta a idade em +1)
public class Cliente {
    public String nome;
    public int idade;

    public void aniversario(int x) {
        idade++;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " idade: " + idade;
    }
}