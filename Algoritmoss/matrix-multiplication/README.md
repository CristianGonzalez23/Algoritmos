# Matrix Multiplication Algorithms

This project contains implementations of various matrix multiplication algorithms in Python. The algorithms implemented are:

1. NaivOnArray
2. NaivLoopUnrollingTwo
3. NaivLoopUnrollingFour
4. WinogradOriginal
5. WinogradScaled
6. StrassenNaiv
7. StrassenWinograd

Each algorithm is implemented in its own Python file in the `src` directory. The `tests` directory contains unit tests for each algorithm.

## Requirements

Python 3.6 or later is required to run the code in this project. The required Python packages are listed in `requirements.txt`. You can install them with:

```
pip install -r requirements.txt
```

## Running the Tests

To run the tests, navigate to the `tests` directory and run:

```
python -m unittest discover
```

## Usage

To use one of the matrix multiplication algorithms, import the corresponding function from its file in the `src` directory. For example, to use the NaivOnArray algorithm, you would do:

```python
from src.NaivOnArray import naiv_on_array

# Multiply two matrices
result = naiv_on_array(matrix1, matrix2)
```

Replace `naiv_on_array` with the name of the function for the algorithm you want to use, and `matrix1` and `matrix2` with the matrices you want to multiply.