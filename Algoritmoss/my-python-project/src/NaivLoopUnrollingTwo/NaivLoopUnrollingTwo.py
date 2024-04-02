def multiplicar_matrices_desenrolladas(matriz1, matriz2):
    filas_matriz1 = len(matriz1)
    columnas_matriz1 = len(matriz1[0])
    filas_matriz2 = len(matriz2)
    columnas_matriz2 = len(matriz2[0])

    if columnas_matriz1 != filas_matriz2:
        raise ValueError("Las matrices no se pueden multiplicar")

    resultado = [[0] * columnas_matriz2 for _ in range(filas_matriz1)]

    for i in range(filas_matriz1):
        for j in range(columnas_matriz2):
            for k in range(columnas_matriz1):
                resultado[i][j] += matriz1[i][k] * matriz2[k][j]

    return resultado

def leer_matriz_desde_archivo(archivo):
    matriz = []
    with open(archivo, 'r') as file:
        for line in file:
            fila = [int(num) for num in line.split()]
            matriz.append(fila)
    return matriz

# Example usage
matriz1 = leer_matriz_desde_archivo('matriz.txt')
matriz2 = leer_matriz_desde_archivo('matriz2.txt')
resultado = multiplicar_matrices_desenrolladas(matriz1, matriz2)
print(resultado)