import java.util.Scanner;
public class CalculadoraIMC {
    public static void main(String[] args) {
        //Variables
        float peso;
        float altura;
        float imc;
        //Iniciamos Scanner
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora de I.M.C.");
        //Ingreso de peso
        System.out.print("Ingrese peso en kg: ");
        peso = entrada.nextFloat();
        //Ingreso de altura y formula para obtener los datos en metros
        System.out.print("Ingrese altura en cm: ");
        altura = entrada.nextFloat();
        altura = altura / 100;
        //Cálculo de IMC
        imc = peso / (altura * altura);
        //Impresión de datos generales e IMC en pantalla
        System.out.println("**************************************");
        System.out.println("Datos del paciente: ");
        System.out.println("Peso: " + peso + " kilogramos");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("IMC: " + imc);
        if (imc < 16) {
            System.out.println("Necesita ingreso a hospital");
        } else if (imc > 16 && imc < 17) {
            System.out.println("Infrapeso");
        } else if (imc > 17 && imc < 18) {
            System.out.println("Bajo peso");
        } else if (imc > 18 && imc < 25) {
            System.out.println("Peso normal (Saludable)");
        } else if (imc > 25 && imc < 30) {
            System.out.println("Sobrepeso (Obesidad grado 1");
        } else if (imc > 30 && imc < 35) {
            System.out.println("Sobrepeso crónico (Obesidad grado 2");
        } else if (imc > 35 && imc < 40) {
            System.out.println("Obesidad premórbida (Obesidad grado 3");
        } else if (imc > 40) {
            System.out.println("Obesidad mórbida (Obesidad grado 4");
        }
    }
}