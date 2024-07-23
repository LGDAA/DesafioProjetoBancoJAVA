package src;

public class main {
    public static void main(String[] args) {
        Cliente luiz = new Cliente();
        luiz.setNome("Luiz");

        Conta cc = new ContaCorrente(luiz);
        Conta poupanca = new ContaPoupanca(luiz);

        cc.depositar(100);
        cc.transferir(100, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        poupanca.sacar(50);
        poupanca.imprimirExtrato();
    }
}
