import java.util.Scanner;
public class CalculadoraIMCArrays {
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

        //Usaremos arrays en lugar de IFs, ya que es mas facil mantener y actualizar
        float[] parametros = {16,17,18,26,30,35,40};
        String [] mensajes = {
                "Criterio de ingreso en hospital",
                "Infrapeso",
                "Bajo peso",
                "Peso normal (saludable)",
                "Sobrepeso (Obesidad grado 1)",
                "Sobrepeso crónico (Obesidad grado 2)",
                "Obesidad premórbida grado 3",
                "Obesidad mórbida grado 4"
        };
        boolean encontrado = false;
        for (int i = 0; i<parametros.length; i++){
            if (imc < parametros[i]){
                System.out.println(mensajes[i]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println(mensajes[mensajes.length - 1]);
        }
    }
}
