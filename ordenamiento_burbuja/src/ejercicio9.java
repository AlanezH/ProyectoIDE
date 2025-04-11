import pojos.Dia;

import java.util.Scanner;

public class ejercicio9 {
    Dia[] dias;
    Scanner scanner;

    public ejercicio9() {
        dias = new Dia[5];
        scanner = new Scanner(System.in);
    }

    public void ejecutar() {
        for (int i = 0; i < dias.length; i++) {
            System.out.println("temperatura minima dias [" + i + "]:");
            double minima = scanner.nextDouble();

            System.out.println("temperatura maxima dias [" + i + "]:");
            double maxima = scanner.nextDouble();

            double media = (minima + maxima) / 2.0;
            Dia dia = new Dia(minima, maxima, media);
            dias[i] = dia;
        }

        System.out.println("temperatura media: ");
        for (int i = 0; i < dias.length; i++) {
            System.out.println("temperatura media dias [" + i + "]:" + dias[i].getTemperaturaMedia());
        }
        for (int i = 0; i < dias.length - 1; i++) {
            for (int j = 0; j < dias.length - 1 - i; j++) {
                if (dias[j].getTemperaturaMinima() > dias[j + 1].getTemperaturaMedia()) {
                    Dia auxiliar = dias[j];
                    dias[j + 1] = auxiliar;
                }
            }
        }
        System.out.println("temperatura minimas: ");
        for (int i = 0; i < 2; i++) {
            System.out.println("temperatura minimas dias [" + i + "]:" + dias[i].getTemperaturaMinima());
        }

        System.out.println("introduzca una temperatura: ");
        double temperatura = scanner.nextDouble();
        int contador =0;
        for (int i = 0; i < dias.length; i++) {
            if (temperatura == dias[i].getTemperaturaMaxima()){
                System.out.println(dias[i]);

                contador++;
            }
        }
        if (contador== 0){
            System.out.println("no existe esa temperatura");
        }
    }
}
