
import java.util.Scanner;

public class Escaner {

    public static void main(String args[]) {
        System.out.println("Ingrese un nombre:");
        Scanner sc = new Scanner(System.in);
        var nombre = sc.nextLine();
        System.out.println(nombre);
        System.out.println("Ingrese un titulo:");
        var titulo = sc.nextLine();
        System.out.println(titulo);
    }
}
