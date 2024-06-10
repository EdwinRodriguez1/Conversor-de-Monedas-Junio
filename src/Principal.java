import java.util.Scanner;

public class Principal {
    public Principal() {
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor que deseas convertir:");
        double cantidadOrigen = leer.nextDouble();
        System.out.println("Ingrese la moneda de origen");
        String origen = leer.next();
        System.out.println("Ingrese la moneda de destino");
        String destino = leer.next();
    }
}
