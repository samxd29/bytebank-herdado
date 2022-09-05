public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Conta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0;

    }

    //No método podemos ter também o abstract, ele só não vai ter implementação;
    public abstract double deposita(double valor);

    // Eu criei uma classe de exceção e mudei a classe saca;
    //Se o saldo for menor do que o valor a sacar vou fazer o tratamento usando o Throw;
    public void saca(double valor) throws SacaException {
        if(this.saldo < valor) {
            throw new SacaException("Saldo: " + this.saldo + " ,  Valor a sacar: " + valor);
        }
        this.saldo -= valor;
    }
    // Mudei o método transfere, coloquei como void e se o saca funcionar vai depositar o valor;
    //Fiz alteração na classe mãe e consequentemente terei que fazer alteração nas classes filhas;
    public void transfere(double valor, Conta destino) throws SacaException {
        this.saca(valor);
        destino.deposita(valor);

    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        if(agencia <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
}
