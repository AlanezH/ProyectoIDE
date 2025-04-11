public class ejercicio11 {
    int [][] diagonal;

    public ejercicio11(){
        diagonal= new int[5][5];
    }

    public void ejecutar(){
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                if (i==j){
                    diagonal[i][j]=1;
                }else {
                    diagonal[i][j]=0;
                }
            }
        }
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                System.out.println(diagonal[i][j]);
            }
            System.out.println();
        }
    }
}
