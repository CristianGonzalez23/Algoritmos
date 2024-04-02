public class PromDIagonal {

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3, 4, 5}, 
                          {2, 3, 4, 4, 6}, 
                          {3, 4, 3, 6, 7}, 
                          {4, 2, 6, 7, 8},
                          {1, 6, 7, 8, 9}};
                        //  System.out.println("length"+matriz.length);
        double promedio = promDiagonal(matriz, 0, 0, 0);
        System.out.println(" El promedio de la diagonal es: " + promedio);
    }

    public static double promDiagonal(int[][] matriz, int i, int j, double suma){
        if(i==matriz.length){
        //System.out.println("length"+matriz.length);
        return suma/matriz.length;
        }
        if(i+j==matriz.length-1){
        suma+=matriz[i][j];
        return promDiagonal(matriz, i+1, 0, suma);
        }
        return promDiagonal(matriz, i, j+1, suma);
        }
        
    
}
