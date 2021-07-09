package exercicio1;

public class Corrente extends Conta{

    public Corrente(String titular, String numero, double saldo) {
        super(titular, numero, saldo);
    }
    
    @Override
    public void extrato() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: " + this.saldo + "\n");
    }
    
}
