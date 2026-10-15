public class ContaBancaria {

    private String titular;
    private double saldo;
    private double limite;

    public ContaBancaria(String titular, double limite) {
        this.titular = titular;
        this.limite = limite;
        this.saldo = 0; // saldo inicial sempre 0
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito de R$ " + valor + " realizado.");
        } else {
            System.out.println("Depósito inválido: o valor deve ser maior que 0.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Saque inválido: o valor deve ser maior que 0.");
        } else if (valor <= saldo) {
            // tem saldo suficiente
            saldo = saldo - valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        } else {
            // saldo não basta, tenta usar o limite
            double falta = valor - saldo;
            if (falta <= limite) {
                saldo = 0;               // saldo nunca fica negativo
                limite = limite - falta; // a parte usada sai do limite
                System.out.println("Saque de R$ " + valor + " realizado usando o limite.");
            } else {
                System.out.println("Saque negado: saldo e limite insuficientes.");
            }
        }
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }
}