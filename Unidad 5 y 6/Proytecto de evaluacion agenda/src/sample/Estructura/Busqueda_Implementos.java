package sample.Estructura;

public class Busqueda_Implementos {
    public int secuencial(String[][]array, String dato1, String dato2){
        int indicie=-1;
        for(int x=0;x< array.length;x++){
            if (array[x][1].equals(dato1) && array[x][2].equals(dato2)){
                indicie=x;
                return indicie;
            }
        }
        return indicie;
    }
public static int[] burbuja(int[] arreglo){
        int axuxiliar;
        int[] arregloOrdenado;
        for (int i=2;i<arreglo.length; i++){
            for (int j=0;j<arreglo.length-1;j++){
                if(arreglo[j]>arreglo[j+1]){
                    axuxiliar=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=axuxiliar;
                }
            }
        }
        arregloOrdenado=arreglo;
        return arregloOrdenado;
}
//Inserccion
public static int[] Directa(int A[]){
    int p, j;
    int aux;
    int[]arregloOrdenado;
    for (p = 1; p < A.length; p++){
        aux = A[p];
        j = p - 1;
        while ((j >= 0) && (aux < A[j])){

            A[j + 1] = A[j];
            j--;
        }
        A[j + 1] = aux;
    }
    arregloOrdenado=A;
    return arregloOrdenado;
}
}







