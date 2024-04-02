import java.lang.reflect.Array;

public class RetornarE {
    public static void main(String[] args) {
        String[] palabras = {"sel", "mundo", "casa", "peero", "gato", "elefante"};
        String[] resul= new String[palabras.length];
        String[] result = retornarEmedia(palabras, 0, resul, 0);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        
    }

    public static String[] retornarEmedia(String[] palabras, int i, String[] resul, int j){
        if(i==palabras.length){
        return resul;
        }
        //             0      1         2        3     m 4          5 
        //arreglo = {"sel", "mundo", "casa", "peero", "gato", "elefante"};=6
        if((palabras[i].length())%2!=0){
            //sol  3/2=1
            if(palabras[i].charAt(palabras[i].length()/2)=='e'){
            resul[j]=palabras[i];
            return retornarEmedia(palabras, i+1, resul, j+1);
            }
        }
        return retornarEmedia(palabras, i+1, resul, j);
    }
    
    
}
