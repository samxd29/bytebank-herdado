public class CalculadorImposto {

    private double totalImposto;

    public void registra(Tributavel tributo){
        double valor = tributo.getTributavel();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
