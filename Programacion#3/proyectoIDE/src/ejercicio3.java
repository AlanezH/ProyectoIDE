import java.util.Scanner;

public class ejercicio3 {
    int[] notas;
    Scanner scanner;

    public ejercicio3(){
        notas = new  int[5];

        scanner = new Scanner(System.in);
    }

    public void ejercutar() {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("notas [ " +i+ "]: ");
            int nota= scanner.nextInt();
            notas[i]=nota;

        }
        int suma =0;
        int promedio ;
        int minimo=10;
        int maximo = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("notas ["+i+"]:" + notas[i]);

            suma= suma+ notas[i];
            if (notas[i] <minimo){
                minimo = notas[i];
            }
            if (notas[i]> maximo){
                maximo=notas[i];
            }
        }
        promedio=suma/ notas.length;
        System.out.println("promedio : " + promedio);
        System.out.println("el valor maximo " +maximo);
        System.out.println("el valor minimo " + minimo);
    }
}
