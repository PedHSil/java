public class Pato {
    String nome;
    int idade;
    double peso;

    String getNome(){
        return nome;
    }

    void SetNome(String dNome){
        this.nome = dNome;
    }

    int getIdade(){
        return idade;
    }

    void SetIdade( int aIdade) {
        this.idade = aIdade;
    }

    double getPeso(){
        return peso;
    }

    void SetPeso(double aPeso){
        this.peso = aPeso;
    }

    public static void main(String[] args){
        Pato pato01 = new Pato();

        pato01.SetNome("Donald");
        pato01.SetIdade(7);
        pato01.SetPeso(11.2);

        System.out.println(pato01.getNome());
        System.out.println(pato01.getIdade());

        Pato pato02 = new Pato();
        pato02.SetNome("Rex");
        System.out.println(pato02.getNome());
        Pato pato03 = pato01;
        System.out.println(pato03.getNome());
        System.out.println(pato02.getIdade());
        System.out.println(pato01);
        pato03.SetNome("Arnold");
        System.out.println(pato01.getNome());
    }
}