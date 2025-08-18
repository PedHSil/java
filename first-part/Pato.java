
public class Pato {
    String nome;
    int idade;
    double peso;

    // Métodos de acesso (getters e setters)
    String getNome(){
        return nome;
    }

    void SetNome(String dNome){
        this.nome = dNome;
    }

    int getIdade(){
        return idade;
    }

    void SetIdade(int aIdade) {
        this.idade = aIdade;
    }

    double getPeso(){
        return peso;
    }

    void SetPeso(double aPeso){
        this.peso = aPeso;
    }

    // Sobrescrevendo o método toString para imprimir informações úteis
    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Peso: " + peso + "kg";
    }

    public static void main(String[] args) {
        Pato pato01 = new Pato();

        pato01.SetNome("Donald");
        pato01.SetIdade(7);
        pato01.SetPeso(11.2);

        System.out.println(pato01.getNome());
        System.out.println(pato01.getIdade());
        System.out.println(pato01.getPeso());

        Pato pato02 = new Pato();
        pato02.SetNome("Rex");
        System.out.println(pato02.getNome());

        Pato pato03 = pato01; // pato03 e pato01 agora se referem ao mesmo objeto
        System.out.println(pato03.getNome());

        System.out.println(pato02.getIdade()); // pato02 não tem idade definida, então será 0 (valor padrão)
        System.out.println(pato01); // Agora imprime a descrição com nome, idade e peso
        pato03.SetNome("Arnold"); // Altera o nome de pato01 também, pois pato03 é a mesma referência
        System.out.println(pato01.getNome()); // "Arnold" será impresso
    }
}
