import java.util.Scanner;
public class NumerosPares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int primero;
        int segundo;

        System.out.print("Ingrese el primer número: ");
        primero = entrada.nextInt();

        System.out.print("Ingrese el segundo número: ");
        segundo = entrada.nextInt();

        System.out.println("Numeros pares:");

        for (int i = primero; i <= segundo; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
