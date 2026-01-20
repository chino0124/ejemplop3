package ejemplop3;
import java.util.Scanner;

public class noveno ejercicio {
    
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el radio del circulo: ");
        double radio = sc.nextDouble();

        double area = PI * radio * radio;
        double perimetro = 2 * PI * radio;

        System.out.println("Area del circulo: " + area);
        System.out.println("Perimetro del circulo: " + perimetro);

        sc.close();
    }
}

