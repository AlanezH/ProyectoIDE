import java.util.Scanner;

public class ejercicio2 {
    String[] original;
    String[] inverso;

    Scanner scanner;

    public ejercicio2(){
        original = new String[5];
        inverso = new String[5];

        scanner= new Scanner(System.in);
    }
     public void ejecutar() {
         for (int i = 0; i < original.length; i++) {
             System.out.println("original [" + i+ " ]:" );
             String cadena = scanner.nextLine();

            original[i] = cadena;
         }

         int indiceoriginal =0;
         int indiceinverso = 4;
         while (indiceoriginal< original.length){
             inverso[indiceinverso] = original[indiceoriginal];

             indiceoriginal++;
             indiceinverso--;

         }

         for (int i = 0; i < inverso.length; i++) {
             System.out.println("inverso[ "+i+ "]" + inverso[i]);

         }
     }
}
