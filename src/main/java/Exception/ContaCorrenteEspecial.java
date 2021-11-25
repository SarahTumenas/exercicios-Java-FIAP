package Exception;

public class ContaCorrenteEspecial extends ContaCorrente {

    private  double limite;

    @Override
    public void sacar (double valor) throws SaldoInsuficienteException {

        if (valor > saldo + limite){

            throw new SaldoInsuficienteException();

        }

        saldo = saldo - valor;
    }

    @Override
    public boolean realizarDoc(int nrBanco, int nrAgencia, int nrConta, double valor) {
        return false;
    }

    @Override
    public boolean realizarTed(int nrBanco, int nrAgencia, int nrConta, double valor) {
        return false;
    }

    @Override
    public double verificarSaldo(){
        return 0;
    }
}
