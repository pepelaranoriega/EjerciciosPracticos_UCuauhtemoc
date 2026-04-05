import java.util.Scanner;
public class SeparadorDePalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;

        System.out.println("Ingresa una frase: ");
        frase = sc.nextLine();
        String[] palabras = frase.split(" ");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

    }
}
