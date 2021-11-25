package Exception;



public abstract class ContaCorrente {

    protected double saldo;

    public static final int Banco = 33;

    public void sacar (double valor) throws SaldoInsuficienteException{

        if (valor > saldo) {
            throw new SaldoInsuficienteException();

        }

        saldo = saldo - valor;

    }


    public abstract boolean realizarDoc(int nrBanco, int nrAgencia, int nrConta, double valor);

    public abstract boolean realizarTed(int nrBanco, int nrAgencia, int nrConta, double valor);

    public abstract double verificarSaldo();
}
