public class ContaBancaria {
    public String titular;
    public int agencia;
    public int conta;
    public double saldo;


    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("Saldo atual: R$%.2f%n", saldo);
    }
    public void sacar(double valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente.");
        }
        else {
            saldo -= valor;
            System.out.printf("Saldo atual: R$%.2f%n", saldo);
        }
    }
    public String toString() {
        return "Titular da conta: " + titular + " Agência: " + agencia + " Cc: " + conta + " Saldo: " + saldo; 
    }


}
