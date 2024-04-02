public class PromArreglo {
    public static void main(String[] args) {
        // metodo para hallar la cantidad de numeros del arreglo por encima del promedio
        Double[] arreglo = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 };
        // el promedio es
        int cantEncima = numerosEncimaProm(arreglo, 0, 0);
        System.out.println("La cantidad de números por encima del promedio es: " + cantEncima);
    }

    public static int obtenerCantidad(Double[] numeros, double prom, int cant, int i) {
        if (i == numeros.length) {
            return cant;
        }
        if (numeros[i] > prom) {
            cant++;
        }
        return obtenerCantidad(numeros, prom, cant, i+1);
    }

    public static int numerosEncimaProm(Double[] numeros, double prom, int i) {
        if (i == numeros.length) {
            System.out.println("el promedio es: " + prom);
            return obtenerCantidad(numeros, prom/numeros.length, 0, 0);
        }
        prom += numeros[i];
        return numerosEncimaProm(numeros, prom, i + 1);

    }

}
