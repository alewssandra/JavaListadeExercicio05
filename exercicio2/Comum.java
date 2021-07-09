package exercicio2;

public class Comum extends Cliente{
    //Construtor
    public Comum(String nome, int idade, String telefone, String sexo, String estado_civil) {
        super(nome, idade, telefone, sexo, estado_civil);
    }
    
    //Métodos
    @Override
    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Estado Civil: " + this.estado_civil + "\n");
    }
}
