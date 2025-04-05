import java.util.Random;
import java.util.Scanner;
public class ejercicio8{
    private static final int FILAS =8;
    private static final int COLUMNAS =8;
    private static final int MINAS =10;
    private static final char MINA ='*';
    private static final char VACIO ='.';
    private static final char BANDERA ='F';
    private static final char OCULTO ='#';
    private static char[][] tablero;
    private static boolean[][] revelado;
    private static boolean[][] conMina;


    public static void main(String[] args) {
        tablero =new char[FILAS][COLUMNAS];
        revelado =new boolean[FILAS][COLUMNAS];
        conMina =new boolean[FILAS][COLUMNAS];
        inicializarTablero();
        colocarMinas();
        jugar();
    }

    private static void inicializarTablero() {
        for (int i=0;i<FILAS; i++) {
            for (int j=0;j<COLUMNAS; j++) {
                tablero[i][j]=OCULTO;
                revelado[i][j]=false;
                conMina[i][j]=false;
            }
        }
    }

    private static void colocarMinas() {
        Random random =new Random();
        int minasColocadas =0;
        while (minasColocadas <MINAS) {
            int fila =random.nextInt(FILAS);
            int columna =random.nextInt(COLUMNAS);
            if (!conMina[fila][columna]) {
                conMina[fila][columna]=true;
                minasColocadas++;
            }
        }
    }
    private static void jugar() {
        Scanner scanner =new Scanner(System.in);
        boolean juegoTerminado =false;
        while (!juegoTerminado) {
            mostrarTablero();
            System.out.print("Introduce fila y columna (por ejemplo: 3 4): ");
            int fila =scanner.nextInt();
            int columna =scanner.nextInt();
            System.out.print("¿Quieres marcar con bandera? (s/n): ");
            char marcar =scanner.next().charAt(0);
            if (marcar == 's') {
                tablero[fila][columna]=(tablero[fila][columna]== BANDERA) ?OCULTO :BANDERA;
            }else if (conMina[fila][columna]) {
                revelarTablero();
                mostrarTablero();
                System.out.println("¡Has perdido!");
                juegoTerminado =true;
            }else {
                revelarCelda(fila,columna);
                if (comprobarVictoria()) {mostrarTablero();
                    System.out.println("¡Felicidades, has ganado!");
                    juegoTerminado =true;
                }
            }
        }
        scanner.close();
    }

    private static void mostrarTablero() {
        for (int i=0;i<FILAS; i++) {
            for (int j=0;j<COLUMNAS; j++) {
                if (revelado[i][j]) {
                    System.out.print(tablero[i][j]+" ");
                }else {
                    System.out.print(OCULTO +" ");
                }
            }
            System.out.println();
        }
    }

    private static void revelarCelda(int fila,int columna) {
        if (fila <0|| fila >= FILAS || columna <0|| columna >= COLUMNAS ||revelado[fila][columna]) {
            return;
        }
        revelado[fila][columna]=true;
        int minasCercanas =contarMinasCercanas(fila,columna);
        tablero[fila][columna]=minasCercanas >0?(char) ('0' +minasCercanas):VACIO;
        if (minasCercanas == 0) {
            for (int i= -1;i<= 1;i++) {
                for (int j= -1;j<= 1;j++) {
                    revelarCelda(fila +i,columna +j);
                }
            }
        }
    }

    private static int contarMinasCercanas(int fila,int columna) {
        int contador =0;
        for (int i= -1;i<= 1;i++) {
            for (int j= -1;j<= 1;j++) {
                int nuevaFila =fila +i;
                int nuevaColumna =columna +j;
                if (nuevaFila >= 0&& nuevaFila <FILAS && nuevaColumna >= 0&& nuevaColumna <COLUMNAS && conMina[nuevaFila][nuevaColumna]) {
                    contador++;
                }
            }
        }

        return contador;
    }

    private static boolean comprobarVictoria() {
        for (int i=0;i<FILAS; i++) {for (int j=0;j<COLUMNAS; j++) {
            if (!conMina[i][j]&& !revelado[i][j]) {
                return false;
            }
        }
        }
        return true;
    }

    private static void revelarTablero() {
        for (int i=0;i<FILAS; i++) {
            for (int j=0;j<COLUMNAS; j++) {
                if (conMina[i][j]) {
                    tablero[i][j]=MINA;
                }
            }
        }
    }
}