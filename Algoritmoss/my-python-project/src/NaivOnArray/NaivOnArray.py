import time
import matplotlib.pyplot as plt

def multiply_matrices(matriz1, matriz2):
    """
    Multiplica dos matrices y devuelve el resultado.

    Args:
        matriz1 (list[list]): La primera matriz.
        matriz2 (list[list]): La segunda matriz.

    Returns:
        list[list]: La matriz resultante después de la multiplicación.

    Raises:
        ValueError: Si el número de columnas en matriz1 no es igual al número de filas en matriz2.
    """
    rows1 = len(matriz1)
    cols1 = len(matriz1[0])
    rows2 = len(matriz2)
    cols2 = len(matriz2[0])

    if cols1 != rows2:
        raise ValueError("Las matrices no se pueden multiplicar")

    result = [[0] * cols2 for _ in range(rows1)]

    for i in range(rows1):
        for j in range(cols2):
            for k in range(cols1):
                result[i][j] += matriz1[i][k] * matriz2[k][j]

    return result

def read_matrix_from_txt(file_path):
    """
    Lee una matriz desde un archivo de texto.

    Args:
        file_path (str): La ruta del archivo de texto.

    Returns:
        list[list]: La matriz leída desde el archivo de texto.
    """
    matrix = []
    with open(file_path, 'r') as file:
        for line in file:
            row = [int(num) for num in line.strip().split()]
            matrix.append(row)
    return matrix

def measure_execution_time(matriz1, matriz2):
    """
    Mide el tiempo de ejecución de la multiplicación de matrices.

    Args:
        matriz1 (list[list]): La primera matriz.
        matriz2 (list[list]): La segunda matriz.

    Returns:
        tuple: Una tupla que contiene la matriz resultante y el tiempo de ejecución.
    """
    start_time = time.time()
    result = multiply_matrices(matriz1, matriz2)
    end_time = time.time()
    execution_time = end_time - start_time
    return result, execution_time

# Leer las matrices desde archivos de texto
matriz1 = read_matrix_from_txt('matriz.txt')
matriz2 = read_matrix_from_txt('matriz2.txt')

# Medir el tiempo de ejecución y obtener el resultado
result, execution_time = measure_execution_time(matriz1, matriz2)

# Guardar el resultado en un nuevo archivo de texto
def save_result_to_file(result, output_file_path):
    """
    Guarda el resultado de la multiplicación de matrices en un archivo de texto.

    Args:
        result (list[list]): La matriz resultante.
        output_file_path (str): La ruta del archivo de texto de salida.
    """
    with open(output_file_path, 'w') as file:
        for row in result:
            file.write(' '.join(str(num) for num in row))
            file.write('\n')

    print("Resultado guardado", output_file_path)


# Guardar el tiempo de ejecución en un archivo de texto
def save_execution_time_to_file(execution_time, output_file_path):
    """
    Guarda el tiempo de ejecución en un archivo de texto.

    Args:
        execution_time (float): El tiempo de ejecución en segundos.
        output_file_path (str): La ruta del archivo de texto de salida.
    """
    with open(output_file_path, 'a') as file:
        file.write(f"Execution time: {execution_time} seconds\n")

    print("Execution time saved:", output_file_path)

# Rutas de los archivos de texto de salida
output_file_path = 'result.txt'
save_result_to_file(result, output_file_path)

output_file_path = 'execution_time.txt'

import matplotlib.pyplot as plt

save_execution_time_to_file(execution_time, output_file_path)

# Define the 'times' variable and populate it with data
times = {
    'Algorithm 1': 5,
    'Algorithm 2': 15,
    'Algorithm 3': 8
}

# Crear una figura y un conjunto de subtramas
fig, ax = plt.subplots()

# Generar un gráfico de barras
ax.bar(times.keys(), times.values())

# Establecer las etiquetas y el título
ax.set_xlabel('Algoritmo')
ax.set_ylabel('Tiempo de ejecución (s)')
ax.set_title('Tiempo de ejecución de los algoritmos para un tamaño de entrada específico')

# Mostrar el gráfico
plt.show()
