package exercicio2;

public class Vip extends Cliente implements TratamentoVip{
    //Atributos
    private double desconto;

    //Construtor
    public Vip(String nome, int idade, String telefone, String sexo, String estado_civil, double desconto) {
        super(nome, idade, telefone, sexo, estado_civil);
        this.desconto = desconto;
    }

    //Métodos
    @Override
    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Estado Civil: " + this.estado_civil);
        System.out.println("Desconto: " + this.desconto + "\n" );
    }
    
    @Override
    public void enviarMsg() {
        System.out.println("Olá " + this.nome + ". Venha conferir nossas promoções. Uma oferta especial\n" +
                           "te aguarda. Na compra de qualquer produto você terá " + this.desconto + "% de\n" +
                           "desconto”.");
    }

    //Getters e Setters
    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
