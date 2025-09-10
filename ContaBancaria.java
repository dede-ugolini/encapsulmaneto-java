public class ContaBancaria{
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public void DepositoSaldo(double saldo){
        if (saldo < 0){
            System.exit(-1);
        }
        else {
            this.saldo += saldo;
        }
    }

    public void Saque(double saque){
        if (saque > saldo) {
            System.out.println("Saldo insuficiente");
        }
        saldo -= saque;
    }
    public double saldoConta(){
        return saldo;
    }
    public static void main(String args[]){
        ContaBancaria conta = new ContaBancaria(222, 150);
        System.out.println(conta.saldoConta());
    }
}