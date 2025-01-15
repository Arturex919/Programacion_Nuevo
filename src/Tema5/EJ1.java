package Tema5;

public class EJ1 {


    //Un procedimiento que imprima la matriz.//

    public static void imprime(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int maxArray (int [][] max){
        int numMax=max[0][0];
        for (int i=0;i<max.length;i++){
            if (max[i][i]>numMax){
                numMax=max[i][i];
            }
        }
        return  numMax;
    }
    public static int minArray(int [][] min){
        int numMin=min[0][0];
        for (int i=0;i<min.length;i++){
            if (min[i][i]<numMin){
                numMin=min[i][i];
            }
        }
        return  numMin;
    }
    public static int mediaArray(int [][]media){
        int numMedia=media[0][0];
        int suma=0;
        for (int i=0;i<media.length;i++){

        }
        return numMedia;
    }
    public static double mediaArray(double[][] media) {
        double numMedia = media[0][0];
        double suma = 0;
        int cont = 0;//guardas elemeto contado
        for (int i = 0; i < media.length; i++) {
            for (int j = 0; j < media[i].length; j++) {
                suma += media[i][j];//suma todo
                cont++;//cuentas los elementos
            }
        }
        double resul = suma / cont;

        return resul;
    }

    //Una función que te diga si un elemento existe en la matriz o no.
    public static boolean existeA(int[][] real, int elemetos) {
        for (int i = 0; i < real.length; i++) {
            for (int j = 0; j < real[i].length; i++) {
                if (real[i][j] == elemetos) {
                    return true;
                }
            }
        }
        return false;
    }
    //Una función que devuelva cuantas veces se repite un número en
    //una matriz.
    public static int repetite(int [][]numeroR,int numero){
        int cont=0;
        for (int i=0;i<numeroR.length;i++){
            for (int j=0;j<numeroR[i].length;j++){
                if (numeroR[i][j]==numero){//si el numero en i y es igual al numero en j se repite y nos avisa
                    cont++;
                }
            }
        }
        return cont;
    }
    public static int sumaMatriz(int [][]suma1,int [][]suma2) {
        int count1 = 0;//1
        int count2 = 0;//2
        int sum = 0;
        int sum2 = 0;
        if (suma1 != suma2) {
            System.out.println("Los numeros no son iguales");
        }
        for (int i = 0; i < suma1.length; i++) {
            for (int j = 0; j < suma1[i].length; j++) {
                sum += suma1[i][j];
                count1++;
            }
        }
        return sum;

    }


        public static void main (String[]args){




    }
}
