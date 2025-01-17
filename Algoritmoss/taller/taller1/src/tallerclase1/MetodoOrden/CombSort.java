package tallerclase1.MetodoOrden;

// Programa Java para implementar el ordenamiento por Comb Sort

public class CombSort
{
    // Para encontrar la brecha entre los elementos
    int getNextGap(int gap)
    {
        // Reducir la brecha por el factor de reducción
        gap = (gap*10)/13;
        if (gap < 1)
            return 1;
        return gap;
    }

    // Función para ordenar arr[] usando Comb Sort
    void sort(int arr[])
    {
        int n = arr.length;

        // Inicializar la brecha
        int gap = n;

        // Inicializar swapped como verdadero para asegurarse de que
        // el bucle se ejecute
        boolean swapped = true;

        // Continuar mientras la brecha sea mayor que 1 y la última
        // iteración haya causado un intercambio
        while (gap != 1 || swapped == true)
        {
            // Encontrar la siguiente brecha
            gap = getNextGap(gap);

            // Inicializar swapped como falso para poder
            // verificar si ocurrió un intercambio o no
            swapped = false;

            // Comparar todos los elementos con la brecha actual
            for (int i=0; i<n-gap; i++)
            {
                if (arr[i] > arr[i+gap])
                {
                    // Intercambiar arr[i] y arr[i+gap]
                    int temp = arr[i];
                    arr[i] = arr[i+gap];
                    arr[i+gap] = temp;

                    // Establecer swapped
                    swapped = true;
                }
            }
        }
    }

    // Método principal
    public static void main(String args[])
    {
        CombSort ob = new CombSort();
        int arr[] = {8, 4, 1, 56, 3, -44, 23, -6, 28, 0};
        ob.sort(arr);

        System.out.println("arreglo ordenado");
        for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i] + " ");

    }
}
/* Este código fue contribuido por Rajat Mishra */
