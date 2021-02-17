
import java.util.Scanner;

public class EjercicioI {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un titulo de un libro: ");
        var titulo = sc.nextLine();
        System.out.println("Ingrese el autor del libro: ");
        var autor = sc.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }
}
