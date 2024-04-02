import numpy as np
import random
def crear_matriz(n):
    matriz = np.random.randint(100000, 1000000, size=(n, n)) # Crear una matriz n*n con valores iniciales de cero

    # Guardar la matriz en un archivo de texto
    with open('matriz.txt', 'w') as archivo:
        for fila in matriz:
            linea = ' '.join(str(elemento) for elemento in fila)  # Convertir la fila en una cadena de texto
            archivo.write(linea + '\n')  # Escribir la fila en el archivo, seguida de un salto de línea

    print('Matriz creada y almacenada en matriz.txt')

# Ejemplo de uso
n = 1000  # Tamaño de la matriz
crear_matriz(n)

