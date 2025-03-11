public class Condicion {
    public static void main(String[] args) {
        int spiceLevel = 1;
        boolean isSpicy = spiceLevel > 3;

        if (isSpicy) {
            System.out.println("Careful! This is spicy fried rice.");
        } else {
            System.out.println("Spice tolerance where?");
        }

        int temp = 90;

        if (temp < 40) {
            System.out.println("It may be snowing! ❄️");
        } else if (temp < 80) {
            System.out.println("Enjoy the weather! 👌");
        } else {
            System.out.println("Okay... It is getting a little hot in here. 🔥");
        }

        boolean isCatOwer = true;
        boolean isDogOwer = true;

        if (isCatOwer) {
            System.out.println("Use the code MEOW for 20% off cat items");
        } else if (isDogOwer) {
            System.out.println("Use the code WOOF for 20% off dog items");
        } else {
            System.out.println("Welcome to the pet store!");
        }

        int speedLimit = 30;
        int drivingSpeed = 25;
        boolean schoolZone = false;

        if (drivingSpeed < speedLimit && schoolZone) {  // && return true if both condictions are true
            System.out.println("You are being a safe driver!");
        } else if (drivingSpeed > speedLimit || schoolZone) { // || return true if at least one condition is true
            System.out.println("Slow down!");
        } else {
            System.out.println("Careful driving!");
        }
    }
}
