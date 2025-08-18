import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beecorowd {

public static void main(String[] args) throws IOException {

InputStreamReader ir = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(ir);

int A, B, X;

A = Integer.parseInt(in.readLine());
B = Integer.parseInt(in.readLine());

X = A + B;

System.out.printf("X = %d\n", X);

}

}

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar


 
    public static void main(String[] args) throws IOException {
 
    InputStreamReader ir = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(ir);

double R, n, Re, Res;

R = Double.parseDouble(in.readLine());
n = 3.14159;
Re = R * R;
Res = n * Re;
 
System.out.printf("A=%.4f%n", Res);

    }
 
}
     */