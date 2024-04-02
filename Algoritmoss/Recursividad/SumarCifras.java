public class SumarCifras {
    static int metodo(int n) {
        int suma = 0;
        while (n != 0) {
            System.out.println("pasa por aquí");
            suma += n % 10;
            n /= 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        int n = 123456789;
        int sum=metodo(n);
        
        System.out.println("La suma de las cifras de " + n + " es: " + sum);


    }
    
}
