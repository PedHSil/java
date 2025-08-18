
public class LoopFor {
    public static void main(String[] args) {
        /*int num = 1;

        for (int i = 0; i < 3; i++) {
            System.out.println("This is iteration " + num);
            num++;
        }

        for (int i = 0; i <= 50; i++) {
            System.out.println("I will be great at programming! 🚀");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
            if (i == 3) {
                break; // Exit the loop
            }
        }
        
        System.out.println("Loop ended.");*/

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("Break at " + i);
                break;
            }
        }
    }
}
