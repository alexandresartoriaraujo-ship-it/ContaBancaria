void main() {
    ContaBancaria conta = new ContaBancaria("Maria", 200);
    IO.println("Saldo inicial: " + conta.getSaldo());

    conta.depositar(-50);
    IO.println("Depósito inválido: " + conta.getSaldo());

    conta.depositar(100);
    IO.println("Depósito de 100: " + conta.getSaldo());

    conta.sacar(40);
    IO.println("Saque de 40: " + conta.getSaldo());

    conta.sacar(150);
    IO.println("Saque de 150 usando limite: " + conta.getSaldo());
    IO.println("Limite restante: " + conta.getLimite());

    conta.sacar(500);
    IO.println("Saque de 500 negado: " + conta.getSaldo());
}