import java.util.Scanner;
public class NumeroMayor {
    public static void main(String[] args) {
        //Variables
        float numero1;
        float numero2;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el primer número: ");
        numero1 = leer.nextFloat();
        System.out.println("Ingresa el segundo número: ");
        numero2 = leer.nextFloat();
        if(numero1>numero2) { //indicamos que si el número 1 es mayor que el 2, nos lo muestre en pantalla.
            System.out.println(numero1 + " es mayor que " + numero2);
        } else { //nos imprime en pantalla lo contra
            System.out.println(numero2 + " es mayor que " + numero1);
        }
    }
}
