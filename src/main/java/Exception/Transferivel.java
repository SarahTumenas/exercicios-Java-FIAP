package Exception;

public abstract class Transferivel {

    public abstract boolean realizarDoc(int nrBanco, int nrAgencia, int nrConta, double valor);
    public abstract boolean realizarTed(int nrBanco, int nrAgencia, int nrConta, double valor);

    public abstract double verificarSaldo();
}
