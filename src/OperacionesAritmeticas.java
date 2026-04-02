import java.util.InputMismatchException;
import java.util.Scanner;
public class OperacionesAritmeticas {
    public static void main(String[] args) {
        //Declaracion de variables.
        //Usaré float como tipo de dato para poder ingresar decimales si es necesario.
        float numero1 = 0;
        float numero2 = 0;
        float suma;
        float multiplicacion;

        Scanner leer = new Scanner(System.in);

        while (true) { //Validamos que el primer número sea ingresado correctamente.
            try {
                System.out.println("Ingresa el primer valor: ");
                numero1 = leer.nextFloat();
                break; //Si el número es ingresado correctamente, salimos del bucle while.
            } catch (InputMismatchException e) {
                System.out.println("Favor de ingresar un número válido");
                leer.next();
            }
        }

        while (true) { //Validamos que el segundo número se ingresado correctamente.
            try {
                System.out.println("Ingresa el segundo valor: ");
                numero2 = leer.nextFloat();
                break; //Si el número es ingresado correctamente, salimos del bucle while.
            } catch (InputMismatchException e) {
                System.out.println("Favor de ingresar un número válido");
                leer.next();
            }
        }

        suma = numero1 + numero2;
        multiplicacion = numero1 * numero2;
        System.out.println("La suma de los números nos da como resultado: " + suma);
        System.out.println("La multiplicación de los números nos da como resultado: " + multiplicacion);
    }
}
