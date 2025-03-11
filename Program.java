import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I? ");
        String answer = scanner.nextLine(); 

        System.out.println("You answered the following word!");
        System.out.println(answer);
        System.out.println("Congrats on getting the clue!");
    }
}

//Olá, mundo!  // (Os dois primeiros prints ficam na mesma linha)

//Olá, mundo!  // (println move para a próxima linha)
//Tudo bem?

/*public class Exemplo {
    public static void main(String[] args) {
        System.out.print("Olá, ");
        System.out.print("mundo!");
        
        System.out.println(); // Apenas para quebrar a linha

        System.out.println("Olá, mundo!");
        System.out.println("Tudo bem?");
    }
}
 */