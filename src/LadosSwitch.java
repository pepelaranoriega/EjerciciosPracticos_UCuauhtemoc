import java.util.Scanner;
public class LadosSwitch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numLados;
        System.out.print("Ingrese numero de lados: ");
        numLados = entrada.nextInt();
        switch (numLados) {
            case 1:
            case 2:
                System.out.println("No es figura");
                break;
            case 3:
                System.out.println("Triangulo");
                break;
            case 4:
                System.out.println("Cuadrado o Rectangulo");
                break;
            case 5:
                System.out.println("Pentagono");
                break;
            case 6:
                System.out.println("Hexagono");
                break;
            case 8:
                System.out.println("Octagono");
                break;
            default:
                System.out.println("No registrada");
        }
    }

}
