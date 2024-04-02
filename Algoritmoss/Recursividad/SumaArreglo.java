public class SumaArreglo {

    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4};
        // 1 + 2 + 3 + 4 + 5 = 15
        int suma = sumarArreglo(arreglo, 0, 0);
        System.out.println("La suma de los elementos del arreglo es: " + suma);
    }

    private static int sumarArreglo(int[] arreglo, int suma, int i) {
        if (i == arreglo.length-1) {
            return suma+arreglo[i];
        }
        suma += arreglo[i];
        return sumarArreglo(arreglo, suma, i + 1);
    }
    
}
