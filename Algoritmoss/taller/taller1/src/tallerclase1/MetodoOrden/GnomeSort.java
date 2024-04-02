package tallerclase1.MetodoOrden;

// Programa Java para implementar el Ordenamiento Gnome

import java.util.Arrays; 
public class GnomeSort{ 
static void gnomeSort(int arr[], int n) 
{ 
int index = 0; 

while (index < n) { 
if (index == 0) 
    index++; 
if (arr[index] >= arr[index - 1]) 
    index++; 
else { 
    int temp = 0; 
    temp = arr[index]; 
    arr[index] = arr[index - 1]; 
    arr[index - 1] = temp; 
    index--; 
} 
} 
return; 
} 

// Programa principal para probar las funciones anteriores. 
public static void main(String[] args) 
{ 
int arr[] = { 34, 2, 10, -9 }; 

gnomeSort(arr, arr.length); 

System.out.print("Secuencia ordenada después de aplicar el ordenamiento Gnome: "); 
System.out.println(Arrays.toString(arr)); 
} 
} 

// Código contribuido por Mohit Gupta_OMG
