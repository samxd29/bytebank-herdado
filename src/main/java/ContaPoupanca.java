public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numero){ // Usando um construtor específico
        super(agencia, numero);
    }

    @Override
    public double deposita(double valor) {
        return super.saldo += valor;
    }
}
