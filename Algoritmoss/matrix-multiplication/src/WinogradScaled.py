import numpy as np

def winograd_scaled(matrix1, matrix2):
    assert len(matrix1[0]) == len(matrix2), "Las matrices no se pueden multiplicar"
    n = len(matrix1)
    m = len(matrix1[0])
    p = len(matrix2[0])
    row_factor = np.zeros(n)
    col_factor = np.zeros(p)
    result = np.zeros((n, p))

    for i in range(n):
        for j in range(m // 2):
            row_factor[i] += matrix1[i][2*j] * matrix1[i][2*j+1]

    for i in range(p):
        for j in range(m // 2):
            col_factor[i] += matrix2[2*j][i] * matrix2[2*j+1][i]

    for i in range(n):
        for j in range(p):
            result[i][j] = -row_factor[i] - col_factor[j]
            for k in range(m // 2):
                result[i][j] += ((matrix1[i][2*k] + matrix2[2*k+1][j]) * (matrix1[i][2*k+1] + matrix2[2*k][j]))

    if m % 2:
        for i in range(n):
            for j in range(p):
                result[i][j] += matrix1[i][m-1] * matrix2[m-1][j]

    return result