
public class ConcatenacionCadenas {

    public static void main(String args[]) {
        var usuario = "Pepito Perez";
        var titulo = "Ingeniero";
        var union = usuario + ", " + titulo;
        System.out.println(union);

        var i = 3;
        var j = 4;

        System.out.println(i + j); //Suma 
        System.out.println(i + j + " " + usuario); //Suma y concatena
        System.out.println(usuario + " " + i + j); // Concatena
        System.out.println(usuario + " " + (i + j)); // Concatena y suma
    }
}
