package ejemplop3;
import java.util.Scanner;

public class octavo ejercicio {
n    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CONVERSION DE TEMPERATURA");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.print("Elige una opcion (1 o 2): ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.print("Ingresa la temperatura en Celsius: ");
            double celsius = sc.nextDouble();

            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Resultado: " + fahrenheit + " °F");

        } else if (opcion == 2) {
            System.out.print("Ingresa la temperatura en Fahrenheit: ");
            double fahrenheit = sc.nextDouble();

            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Resultado: " + celsius + " °C");

        } else {
            System.out.println("Opcion no valida");
        }

        sc.close();
    }
}
