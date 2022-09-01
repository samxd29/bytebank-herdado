public class Main {
    public static void main(String[] args) {

        Conta contaPoupanca = new ContaPoupanca(2442, 58741);
        Conta contaCorrente = new ContaCorrente(2442, 36521);
        SeguroDeVida seguro = new SeguroDeVida();
        CalculadorImposto calculador = new CalculadorImposto();

        contaCorrente.deposita(500);
        contaPoupanca.deposita(1000);
        calculador.registra((Tributavel) contaCorrente);
        calculador.registra(seguro);

        contaCorrente.transfere(100,contaPoupanca);

        System.out.println("Saldo Conta Poupança: "+contaPoupanca.getSaldo());
        System.out.println("Saldo Conta Corrente: "+contaCorrente.getSaldo());
        System.out.println("O imposto sobre o Seguro de Vida é de: "+ seguro.getTributavel());
        System.out.println("O total de imposto cobrado: " + calculador.getTotalImposto());
    }
}
