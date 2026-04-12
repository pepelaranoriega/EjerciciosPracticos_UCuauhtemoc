import java.util.Scanner;
public class EjemploWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int numero = entrada.nextInt();
        while(numero <= 500){
            System.out.println("Ingrese un número mayor a 500 para salir");
            numero = entrada.nextInt();
        }
    }
}
