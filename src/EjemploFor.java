import java.util.Scanner;
public class EjemploFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        for(int j = 1; j <=5; j++){
            System.out.println("Ingrese el " + j + " número");
            contador += entrada.nextInt(); /*A diferencia del código original, usaré una sola
            variable para que quede más limpio*/
        }
        System.out.println("La suma de todos los números es: " + contador);
    }
}