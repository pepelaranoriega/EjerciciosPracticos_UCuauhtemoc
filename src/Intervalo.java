import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        //Variables
        int inferior;
        int superior;
        int numero;
        int suma = 0;
        int fuera = 0;
        boolean igualLimite = false;

        Scanner entrada = new Scanner(System.in);

        //Validar intervalo
        do {
            System.out.print("Ingrese limite inferior: ");
            inferior = entrada.nextInt();
            System.out.print("Ingrese limite superior: ");
            superior = entrada.nextInt();
            if (inferior > superior) {
                System.out.println("El límite inferior no puede ser mayor al límite superior.");
            }
        } while (inferior > superior);

        //Ingresamos los valores
        do {
            System.out.print("""
                             Ingrese un numero
                             presiona 0 para terminar
                             """);
            numero = entrada.nextInt();

            if (numero != 0) {
                // Dentro del intervalo (abierto)
                if (numero > inferior && numero < superior) {
                    suma += numero;
                }
                // Fuera del intervalo
                else if (numero < inferior || numero > superior) {
                    fuera++;
                }
                // Igual a los limites
                if (numero == inferior || numero == superior) {
                    igualLimite = true;
                }
            }
        } while (numero != 0);

        //Resultados
        System.out.println("\nResultados:");
        System.out.println("Suma dentro del intervalo: " + suma);
        System.out.println("Cantidad fuera del intervalo: " + fuera);

        if (igualLimite) {
            System.out.println("Se ingresaron valores iguales a los limites.");
        } else {
            System.out.println("No se ingresaron valores iguales a los limites.");
        }
    }
}