import numpy as np

def NaivLoopUnrollingTwo(A, B):
    n = len(A)
    C = np.zeros((n, n))
    for i in range(n):
        for j in range(n):
            for k in range(0, n, 2):
                C[i][j] += A[i][k] * B[k][j]
                if k+1 < n:
                    C[i][j] += A[i][k+1] * B[k+1][j]
    return C