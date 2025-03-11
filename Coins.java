import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        double dollar = 0.0045;

        Scanner scanner = new Scanner(System.in);

        System.out.println("how many coins do you have?: ");
        int answer = Integer.parseInt(scanner.nextLine());

        double answerFinal = (answer * dollar);
        System.out.println(answerFinal);        
    }
}
