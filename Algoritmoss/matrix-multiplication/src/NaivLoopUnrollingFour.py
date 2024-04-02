import numpy as np

def naiv_loop_unrolling_four(A, B):
    n = len(A)
    C = np.zeros((n, n))

    for i in range(0, n, 4):
        for j in range(0, n, 4):
            for k in range(0, n, 4):
                for i1 in range(i, min(i+4, n)):
                    for j1 in range(j, min(j+4, n)):
                        sum = 0
                        for k1 in range(k, min(k+4, n)):
                            sum += A[i1][k1] * B[k1][j1]
                        C[i1][j1] += sum
    return C