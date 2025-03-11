public class Operation {
    public static void main(String[] args) {
        double result = 0;

        result = 8 + 2; // result is now 10
        result = 8 - 2; // result is now 6
        result = 8 * 2; // result is now 16
        result = 8 / 2; // result is now 4
        result = 8 % 2; // result is now 0

        System.out.println(result); // 0

        double originalPrice = 60.0;
        double discount = 20.0;

        //Apply discount 
        double finalPrice = originalPrice - (originalPrice * discount / 100);

        System.out.println(finalPrice); // 48.0

    }
}
