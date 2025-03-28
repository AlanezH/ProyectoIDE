import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Estudiante {
    String nombre;
    String primerApellido;
    String SegundoApellido;
    int edad;

    public Estudiante(String nombre, String primerApellido, String segundoApellido, int edad) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.SegundoApellido = segundoApellido;
        this.edad = edad;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[18];

        for (int i = 0; i < estudiantes.length; i++) {
        }
    }
}
