public class BankAccount {
    private double saldo;
    private double limiteChequeEspecial;

    public BankAccount(double depositoInicial) {
        if (depositoInicial < 0) {
            throw new IllegalArgumentException("Depósito inicial não pode ser negativo.");
        }
        else if(depositoInicial <= 500){
            this.limiteChequeEspecial = 50;
        }
        else {
            this.limiteChequeEspecial = 0.5 * depositoInicial;
        }

        this.saldo = depositoInicial;
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public double consultarChequeEspecial() {
        if (!estaUsandoChequeEspecial()) {
            return limiteChequeEspecial;
        }

        return limiteChequeEspecial - Math.abs(saldo); //Math.abs para calcular o modulo do numero
    }

    public boolean depositar(double valor) {
        if(valor <= 0)
        {
            return false;
        }
        this.saldo += valor;
        return true;
    }

    public boolean sacar(double valor) {
        if(valor <= this.saldo + this.limiteChequeEspecial){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean pagarBoleto(double valor) {
        return sacar(valor);
    }

    public boolean estaUsandoChequeEspecial() {
        return this.saldo < 0;
    }
}
