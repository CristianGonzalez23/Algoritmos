public class CadenaPares {

    public static void main(String[] args) {
                    //   0  1  2  3  4  5  6  7  8
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String pares = ubicarPares(arreglo, 0, "");
        System.out.println("Los números pares son: " + pares);
        
    }
    
    public static String ubicarPares(int[] arre, int i, String numeros){
        if(i== arre.length){
        return numeros;
        }
        if(i%2==0){
        numeros +=String.valueOf(arre[i]);
        }
        return ubicarPares(arre, i+1, numeros);
        
        }
        
}
