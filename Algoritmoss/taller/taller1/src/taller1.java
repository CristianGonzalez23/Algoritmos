// Clase principal del programa
public class taller1 {
    public static void main(String[] args) {
        // Declaración de la matriz
        int[][] matrizIterativa =  {
            {1, 36, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // Declaración de la matriz resultado
        String [][] matrizResultado= new String[matrizIterativa.length][matrizIterativa.length];

        // Medición del tiempo de ejecución para la solución iterativa
        long startTime = System.nanoTime();
        matrizResultado=devolverPerfectoCorregido(matrizResultado, matrizIterativa);
        long endTime = System.nanoTime();
        System.out.println("Tiempo de ejecución para la solución iterativa: " + (endTime - startTime) + " nanosegundos");

        // Impresión de la matriz resultado
        imprimirMatriz(matrizResultado);

        // Declaración de otra matriz resultado
        String [][] matrizRe= new String[matrizIterativa.length][matrizIterativa.length];

        // Medición del tiempo de ejecución para la solución recursiva
        startTime = System.nanoTime();
        matrizRe=devolverPerfectoCorregidoRecursivo(matrizResultado, matrizIterativa, 0, 0);
        endTime = System.nanoTime();
        System.out.println("Tiempo de ejecución para la solución recursiva: " + (endTime - startTime) + " nanosegundos");

        // Impresión de la matriz resultado
        imprimirMatriz(matrizResultado);
    }

    // Método para corregir la matriz iterativamente
    public static String[][] devolverPerfectoCorregido(String[][]n, int [][] matriz) {
        int filas = n.length;
        int columnas = n[0].length;
        int[][] resultado = new int[filas][columnas];
        int multiplo = 1;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int numeroActual = matriz[i][j];
               
                if (esCuadradoPerfecto(numeroActual)) {
                    n[i][j] = "el numero"+ numeroActual+" es cuadrado perfecto , por ende se multiplica por "+ multiplo;
                } else {
                    while (true) {
                        if (esCuadradoPerfecto(numeroActual * multiplo)) {
                            n[i][j] = "el numero"+ numeroActual+" no es cuadrado , pero si lo es cuando se multiplica por  "+ multiplo;
                            break;
                        }
                        multiplo++;
                    }
                    multiplo=1;
                }
            }
        }
        return n;
    }

    // Método para corregir la matriz recursivamente
    public static String[][] devolverPerfectoCorregidoRecursivo(String[][] n, int[][] matriz, int i, int j) {
        if (i >= matriz.length) {
            return n;
        }
        if (j >= matriz[0].length) {
            return devolverPerfectoCorregidoRecursivo(n, matriz, i + 1, 0);
        }
        int numeroActual = matriz[i][j];
        if (esCuadradoPerfecto(numeroActual)) {
            n[i][j] = "el numero " + numeroActual + " es cuadrado perfecto , por ende se multiplica por 1";
        } else {
            n[i][j] = encontrarMultiploCuadradoPerfecto(numeroActual);
        }
        return devolverPerfectoCorregidoRecursivo(n, matriz, i, j + 1);
    }

    // Método para encontrar el multiplo de un cuadrado perfecto
    public static String encontrarMultiploCuadradoPerfecto(int numeroActual) {
        return encontrarMultiploCuadradoPerfectoRecursivo(numeroActual, 2);
    }

    // Método auxiliar para encontrar el multiplo de un cuadrado perfecto recursivamente
    public static String encontrarMultiploCuadradoPerfectoRecursivo(int numeroActual, int multiplo) {
        if (esCuadradoPerfecto(numeroActual * multiplo)) {
            return "el numero " + numeroActual + " no es cuadrado , pero si lo es cuando se multiplica por " + multiplo;
        }
        return encontrarMultiploCuadradoPerfectoRecursivo(numeroActual, multiplo + 1);
    }

    // Método para verificar si un número es cuadrado perfecto
    public static boolean esCuadradoPerfecto(int n) {
        double raiz = Math.sqrt(n);
        return raiz == Math.floor(raiz);
    }

    // Método para imprimir una matriz
    public static void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
