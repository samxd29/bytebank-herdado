public class ContaCorrente extends Conta implements Tributavel{

    //Quando se herda da classe mãe não se herda o construtor, além de termos que fazer o construtor padrão na classe
    // filha, temos que verificar se tem o construtor padrão na classe mãe; podemos usar o construtor específico também;

    public ContaCorrente(int agencia, int numero){// passando como parâmetro o construtor específico
        super(agencia, numero);
    }

    @Override
    public double deposita(double valor) {
        return super.saldo += valor;
    }

    @Override //sobreescrever o código | alteração na assinatura do método;
    public void saca(double valor) throws SacaException {
        double valorASacar = valor + 0.2;
        super.saca(valorASacar);
    }

    @Override
    public double getTributavel() {
        return super.saldo * 0.5;
    }
}
