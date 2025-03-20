public class Comandos {
    public static void main(String[] args) {
        System.out.println(calculaEstoqueMedio(0, 0));
        System.out.println(calculaEstoqueMedio(1, 1));
        System.out.println(calculaEstoqueMedio(1, 2));
        System.out.println(calculaEstoqueMedio(2, 9));
        System.out.println(calculaEstoqueMedio(101, 102));
        // cotação
        System.out.println(conversaoDolar(1, 1));
        System.out.println(conversaoDolar(0.5, 1));
        System.out.println(conversaoDolar(0.5, 2));
        System.out.println(conversaoDolar(2, 1));
        System.out.println(conversaoDolar(5.37, 1));
        System.out.println(conversaoDolar(5.37, 100));
        System.out.println(conversaoDolar(5.37, 0.5));
        // temperatura
        System.out.println(conversorCelsiusToFahrenheit(0));
        System.out.println(conversorCelsiusToFahrenheit(1));
        System.out.println(conversorCelsiusToFahrenheit(2));
        System.out.println(conversorCelsiusToFahrenheit(20));
        System.out.println(conversorCelsiusToFahrenheit(39));
        System.out.println(conversorCelsiusToFahrenheit(40));
        System.out.println(conversorCelsiusToFahrenheit(100));

        System.out.println(conversorFahrenheitToCelsius(0));
        System.out.println(conversorFahrenheitToCelsius(1));
        System.out.println(conversorFahrenheitToCelsius(2));
        System.out.println(conversorFahrenheitToCelsius(20));
        System.out.println(conversorFahrenheitToCelsius(32));
        System.out.println(conversorFahrenheitToCelsius(40));
        System.out.println(conversorFahrenheitToCelsius(100));

        System.out.println(calculaVolumeLata(1, 1));
        System.out.println(calculaVolumeLata(2, 1));
        System.out.println(calculaVolumeLata(1, 2));
        System.out.println(calculaVolumeLata(1, 1 / Math.PI));
        System.out.println(calculaVolumeLata(2, 1 / Math.PI));
        System.out.println(calculaVolumeLata(10, 1));
        System.out.println(calculaVolumeLata(1, 10));
        System.out.println(calculaVolumeLata(10, 10));

        System.out.println(modulo(1));
        System.out.println(modulo(0));
        System.out.println(modulo(-1));
        System.out.println(modulo(2));
        System.out.println(modulo(-2));
    }

    public static double calculaEstoqueMedio(double estoqueMinimo, double estoqueMaximo) {
        return (estoqueMinimo + estoqueMaximo) / 2;
    }

    public static double conversaoDolar(double cotacaoDolar, double valorDolar) {
        return cotacaoDolar * valorDolar;
    }

    public static double conversorCelsiusToFahrenheit(double grauC) {
        return (grauC * 9) / 5 + 32;
    }

    public static double conversorFahrenheitToCelsius(double grauC) {
        return (grauC - 32) * 5 / 9;
    }

    public static double calculaVolumeLata(double raio, double altura) {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    public static int modulo(int n) {
        return n < 0 ? n * -1 : n;
    }
}
