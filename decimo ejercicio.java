public class decimo ejercicio {

    public static void main(String[] args) {

        int entero = 10;
        double decimal = entero;

        System.out.println("CONVERSION IMPLICITA");
        System.out.println("Antes: entero = " + entero);
        System.out.println("Despues: decimal = " + decimal);

        System.out.println();

        double d = 9.7;
        int i = (int) d;

        System.out.println("CONVERSION EXPLICITA");
        System.out.println("Antes: double = " + d);
        System.out.println("Despues: int = " + i);
    }
}


