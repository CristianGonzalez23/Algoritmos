import unittest
from src import WinogradOriginal

class TestWinogradOriginal(unittest.TestCase):

    def test_multiply(self):
        matrix1 = [[1, 2], [3, 4]]
        matrix2 = [[5, 6], [7, 8]]
        result = WinogradOriginal.multiply(matrix1, matrix2)
        self.assertEqual(result, [[19, 22], [43, 50]])

    def test_empty_matrices(self):
        matrix1 = []
        matrix2 = []
        result = WinogradOriginal.multiply(matrix1, matrix2)
        self.assertEqual(result, [])

    def test_non_square_matrices(self):
        matrix1 = [[1, 2, 3], [4, 5, 6]]
        matrix2 = [[7, 8], [9, 10], [11, 12]]
        result = WinogradOriginal.multiply(matrix1, matrix2)
        self.assertEqual(result, [[58, 64], [139, 154]])

if __name__ == '__main__':
    unittest.main()