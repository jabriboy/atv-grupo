public class ContaCorrente extends ContaBancaria implements Imprimivel{
    protected double taxaOperacao;

    public ContaCorrente(){}

    public ContaCorrente(int numeroConta){
        super(numeroConta);
        this.numeroConta = numeroConta;

    }

    @Override
    public void mostrarDados(double valor) {
        // TODO Auto-generated method stub
        
    }

    // @Override
    // public int sacar(double valor){}

    // @Override
    // public int depositar(double valor){}

    // protected double getTaxaDeOperacao(){}

    // public double saldo(){}

    // public void tipoConta(){}
}
