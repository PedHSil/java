public class Gato {
    private String nome;
    private Integer idade;
    private double peso;

    public Gato(Integer idade, String nome, double peso) {
        this.idade = idade;
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void miar(){
        if(idade < 3){
            System.out.printf("miau miau miau, meu nome é %s, eu tenho %f quilos", nome, peso);

        } else if (idade >= 3 && idade < 8){
            System.out.printf("miaaau, meu nome é %s, eu tenho %f quilos", nome, peso);

        } else {
            System.out.printf("Grrr, meu nome é %s, eu tenho %f quilos", nome, peso);

        }

    }
        

}
