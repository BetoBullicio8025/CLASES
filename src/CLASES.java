import java.util.Scanner;

public class CLASES {
    public static void main(String[] args) {

        {
            Scanner in = new Scanner(System.in);

            String nombre = "", profesion = "", nacionalidad = "";

            System.out.println("¿Cuál es tu nombre completo?");
            nombre = in.nextLine();

            System.out.println("¿Cuál es tu profesion?");
            profesion = in.nextLine();

            System.out.println("Nombre: " + nombre.toUpperCase() + "\nProfesion: " + profesion.toUpperCase() +
                    "\nNacinalidad: " + nacionalidad.toUpperCase());
        }
    }
}
