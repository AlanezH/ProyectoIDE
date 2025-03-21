public class ejercicio1 {
    int[] vector_numeros = new int[10];

    public ejercicio1(){


    }

    public void ejecutar(){

        for (int i = 0; i < vector_numeros.length; i++) {
            int alertorio= (int) (Math.random() *10+1);

            vector_numeros[i]= alertorio;
        }

        for (int i = 0; i < vector_numeros.length; i++) {
            int numero = vector_numeros[i];
            int cuadrado = (int) Math.pow(numero, 2);
            int cubo = (int) Math.pow(numero, 3 );
            System.out.println("vector numeros[" + i +"]" + numero+ ", "+ cuadrado+", "+ cubo);


        }
    }
}