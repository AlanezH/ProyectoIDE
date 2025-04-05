import pojos.Mes;

import java.util.Scanner;

public class ejercicio6 {

    Mes[] meses= new Mes[12];
    Scanner scanner;

    public ejercicio6(){
    meses[0]= new Mes(1, "enero", 31);
            meses[0]= new Mes(2, "febrero", 28);
            meses[1]=new Mes(3, "marzo", 31);
            meses[2]= new Mes(4, "abril", 30);
            meses[3]= new Mes(5, "mayo", 31);
            meses[4]=new Mes(6, "junio", 30);
            meses[5]= new Mes(7, "julio", 31);
            meses[6]= new Mes(8, "agosto", 31);
            meses[7]= new Mes(9, "septiembre", 30);
            meses[8]= new Mes(10, "octubre", 31);
            meses[9]=new Mes(11, "noviembre", 30);
            meses[10]= new Mes(12, "diciembre", 31);

            Scanner scanner= new Scanner(System.in);
    }

    public void ejecutar(){
        System.out.println("introduzca el numero del mes");
        int numero = scanner.nextInt();

        Mes mes = meses [numero-1];

        System.out.println(mes.getNombre());
        System.out.println(mes.getCantidadDias());
    }
}
