import java.util.InputMismatchException;
import java.util.Scanner;
public class OperacionesAritmeticas {
    public static void main(String[] args) {
        //Declaración de variables.
        //Usaré float como tipo de dato para poder ingresar decimales si es necesario.
        float numero1;
        float numero2;
        float suma;
        float resta;
        float multiplicacion;
        float division;
        float restoDeDivision;
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
        resta = numero1 - numero2;

        System.out.println("La suma de los números nos da como resultado: " + suma);
        System.out.println("La resta de los números nos da como resultado: " + resta);
        System.out.println("La multiplicación de los números nos da como resultado: " + multiplicacion);
        if (numero2 == 0) { /* Si el segundo número es igual a cero, nos arrojará el siguiente
                               mensaje y terminará el programa*/
            System.out.println("La division no puede ser entre cero");
            return;
        } else {
            division = numero1 / numero2;
            restoDeDivision = numero1 % numero2;
            System.out.println("La división de los números nos da como resultado: " + division);
            System.out.println("El restante de la división es: " + restoDeDivision);
        }
    }
}

