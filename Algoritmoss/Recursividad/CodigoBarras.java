public class CodigoBarras {

    public static void main(String[] args) {
      //  String codigo = "123456789";
	
	String[] arreglo = {"6", "5", "8", "3", "9", "5", "2", "2"};
   // int a = arreglo[0].charAt(0)-48;
    if(esCodigoBarras(arreglo, 0, 0, 0)){
    System.out.println("El código de barras es correcto");
	}else{
    System.out.println("El código de barras no es correcto");
	}
        
    }

 		//EAN-8: "6583952  =88 | 2”

	public static boolean esCodigoBarras(String[] arreglo, int cont, int i, int res){
		if(i==arreglo.length-1){
            System.out.println("res"+res);
			res= res+ (arreglo[i].charAt(0)-48);//90

            return res%10==0;
		}else{
		if(i%2==0){
			res+= (arreglo[i].charAt(0)-48)*3;
		}else{
			res+= (arreglo[i].charAt(0)-48)*1;
		}
		return esCodigoBarras(arreglo, cont, i+1, res);

		}

	}


    
}
