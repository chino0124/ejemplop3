import java.util.Scanner;

public class onceava ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la calificacion (0-100): ");
        int calificacion = sc.nextInt();

        char letra;

        if (calificacion >= 90 && calificacion <= 100) {
            letra = 'A';
        } else if (calificacion >= 80) {
            letra = 'B';
        } else if (calificacion >= 70) {
            letra = 'C';
        } else if (calificacion >= 60) {
            letra = 'D';
        } else if (calificacion >= 0) {
            letra = 'F';
        } else {
            System.out.println("Calificacion invalida");
            sc.close();
            return;
        }

        System.out.println("Calificacion en letra: " + letra);

        if (calificacion >= 70) {
            System.out.println("Estado: APROBADO ✅");
        } else {
            System.out.println("Estado: REPROBADO ❌");
        }

        sc.close();
    }
}
}
