import java.util.Scanner;


public class TesteExercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("entre com o nome");
        String nome = sc.nextLine();

        boolean idadeCorreta = false;
        int idade = -1;
        while(!idadeCorreta){
            try{
                System.out.println("entre com a idade");
                idade = Integer.parseInt(sc.nextLine());
                idadeCorreta = true;
            }catch(NumberFormatException e){
                System.out.println("O numero invalido");
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        System.out.println("entre com o peso");
        double peso = Double.parseDouble(sc.nextLine());
        Gato gato01 = new Gato(idade,nome,peso);
        System.out.println(gato01.getNome());
        System.out.println(gato01.getIdade());
        System.out.println(gato01.getPeso());
        System.out.println(gato01);
        gato01.miar();
        sc.close();
    }
}
