package exercicio1;

public abstract class Conta implements Operacoes{
    //Atributos
    protected String titular, numero;
    protected double saldo;

    //Construtor
    public Conta(String titular, String numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }
    
    //Métodos
    @Override
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
    
    @Override
    public void sacar(double valor){
        if(valor <= this.saldo){
            this.saldo = this.saldo - valor;
        }
        else{
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public abstract void extrato();

    //Getters e Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
