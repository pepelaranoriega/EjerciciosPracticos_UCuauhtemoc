import java.util.Scanner;
public class NumeroDividido {
    public static void main(String[] args) {
        int numero;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        numero = leer.nextInt();
        if (numero%2==0) {
            System.out.println("El número es divisible entre 2");
        } else {
            System.out.println("El número no es divisible entre 2");
        }
    }
}
