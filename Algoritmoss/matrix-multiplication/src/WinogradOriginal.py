import numpy as np

def winograd_original(matrix1, matrix2):
    # Asegurarse de que ambas matrices son cuadradas y del mismo tamaño
    assert matrix1.shape == matrix2.shape
    assert len(matrix1.shape) == 2
    assert matrix1.shape[0] == matrix1.shape[1]
    
    n = matrix1.shape[0]
    
    # Inicializar la matriz de resultado
    result = np.zeros((n, n))
    
    # Preprocesamiento
    row_factor = np.zeros(n)
    col_factor = np.zeros(n)
    for i in range(n):
        for j in range(0, n, 2):
            row_factor[i] += matrix1[i, j] * matrix1[i, j+1]
            col_factor[i] += matrix2[j, i] * matrix2[j+1, i]
    
    # Multiplicación
    for i in range(n):
        for j in range(n):
            result[i, j] = -row_factor[i] - col_factor[j]
            for k in range(0, n, 2):
                result[i, j] += ((matrix1[i, k] + matrix2[k+1, j]) *
                                 (matrix1[i, k+1] + matrix2[k, j]))
    
    # Ajuste final
    if n % 2:
        for i in range(n):
            for j in range(n):
                result[i, j] += matrix1[i, n-1] * matrix2[n-1, j]
    
    return result