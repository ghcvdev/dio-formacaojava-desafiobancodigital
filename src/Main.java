public class Main {
    public static void main(String[] args) {


        Cliente gabriel = new Cliente();
        gabriel.setNome("Gabriel Henrique de Carvalho Vieira".toUpperCase());

        Conta cc = new ContaCorrente(gabriel);
        cc.depositar(250);

        Conta poupanca = new ContaPoupanca(gabriel);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();



    }
}
