public class TesteExercicio {
    static class Aluno {
        public String ra;
        public String nome;
        public double notaNP1;
        public double notaNP2;
    }
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();
        aluno01.nome = "João";
        aluno01.ra = "123456";
        aluno01.notaNP1 = 8.0;
        aluno01.notaNP2 = 7.5;
        System.out.println("Nome: " + aluno01.nome);
        System.out.println("RA: " + aluno01.ra);
        System.out.println("Nota NP1: " + aluno01.notaNP1);
        System.out.println("Nota NP2: " + aluno01.notaNP2);
    }
}

// Declaração da variável (Aluno aluno01;)
//Aluno aluno01 = new Aluno();
//Cria uma variável chamada aluno01 do tipo Aluno, que pode armazenar uma referência a um objeto dessa classe.
//Criação do objeto (new Aluno();)

//Usa o operador new para instanciar um novo objeto da classe Aluno. Isso aloca memória para o novo objeto e chama o construtor padrão da classe Aluno.
//Atribuição da referência (=)

//O novo objeto criado é atribuído à variável aluno01, tornando-a uma referência válida a esse objeto.