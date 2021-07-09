package exercicio1;

public class Poupanca extends Conta{
    //Atributos
    private double rendimento;

    //Construtor
    public Poupanca(String titular, String numero, double saldo, double rendimento) {
        super(titular, numero, saldo);
        this.rendimento = rendimento;
    }
    
    //Métodos
    @Override
    public void extrato() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Rendimento: " + this.calculaRendimento() + "\n");
    }
    
    public double calculaRendimento(){
        double rendimento = this.saldo * 0.05;
        return rendimento;
    }

    //Getters e Setters
    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
}
