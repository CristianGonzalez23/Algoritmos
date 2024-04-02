public class App {
    public static void main(String[] args) {
        int n = 5;

        long startTime = System.nanoTime();
        int[][] matrizIterativa = llenarMatrizIterativa(n);
        long endTime = System.nanoTime();
        System.out.println("Tiempo de ejecución para la solución iterativa: " + (endTime - startTime) + " nanosegundos");
        imprimirMatriz(matrizIterativa);

        int[][] matrizRecursiva = new int[n][n];
        startTime = System.nanoTime();
        llenarMatrizRecursiva(matrizRecursiva, 0, n - 1, 0, n - 1, 1);
        endTime = System.nanoTime();
        System.out.println("Tiempo de ejecución para la solución recursiva: " + (endTime - startTime) + " nanosegundos");
        imprimirMatriz(matrizRecursiva);
    }

    public static int[][] llenarMatrizIterativa(int n) {
        int[][] matriz = new int[n][n];
        int contador = 1;
        int arriba = 0, abajo = n - 1;
        int izquierda = 0, derecha = n - 1;

        while (contador <= n * n) {
            for (int i = arriba; i <= abajo; i++) {
                matriz[i][izquierda] = contador++;
            }
            izquierda++;

            for (int i = izquierda; i <= derecha; i++) {
                matriz[abajo][i] = contador++;
            }
            abajo--;

            for (int i = abajo; i >= arriba; i--) {
                matriz[i][derecha] = contador++;
            }
            derecha--;

            for (int i = derecha; i >= izquierda; i--) {
                matriz[arriba][i] = contador++;
            }
            arriba++;
        }

        return matriz;
    }

    public static void llenarMatrizRecursiva(int[][] matriz, int arriba, int abajo, int izquierda, int derecha, int contador) {
        if (contador > matriz.length * matriz.length) {
            return;
        }

        for (int i = arriba; i <= abajo; i++) {
            matriz[i][izquierda] = contador++;
        }
        izquierda++;

        for (int i = izquierda; i <= derecha; i++) {
            matriz[abajo][i] = contador++;
        }
        abajo--;

        for (int i = abajo; i >= arriba; i--) {
            matriz[i][derecha] = contador++;
        }
        derecha--;

        for (int i = derecha; i >= izquierda; i--) {
            matriz[arriba][i] = contador++;
        }
        arriba++;

        llenarMatrizRecursiva(matriz, arriba, abajo, izquierda, derecha, contador);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}