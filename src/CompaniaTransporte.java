import java.sql.SQLOutput;
import java.util.Scanner;
public class CompaniaTransporte {
    public static void main(String[] args) {
        int destino;
        double peso;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Transportes Internacionales S.A. de C.V.");
        System.out.println("""
                
                Ingresa el destino del paquete:
                1 - América del norte
                2 - América central
                3 - América del sur
                4 - Europa
                5 - Asia
                
                """);
        destino = entrada.nextInt();
        System.out.println("Ingresa el peso del paquete:");
        peso = entrada.nextDouble();
        if (peso > 5) {
            System.out.println("Debido al peso, no es posible ofrecer nuestros servicios.");
        } else {
            switch (destino) {
                case 1:
                    System.out.println("El total a pagar es de: " + peso * 24 + " Euros");
                    break;
                case 2:
                    System.out.println("El total a pagar es de: " + peso * 20 + " Euros");
                    break;
                case 3:
                    System.out.println("El total a pagar es de: " + peso * 21 + " Euros");
                    break;
                case 4:
                    System.out.println("El total a pagar es de: " + peso * 10 + " Euros");
                    break;
                case 5:
                    System.out.println("El total a pagar es de: " + peso * 18 + " Euros");
                    break;
            }
        }
    }
}

