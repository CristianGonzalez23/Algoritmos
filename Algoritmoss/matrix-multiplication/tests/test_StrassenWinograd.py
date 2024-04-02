import unittest
from src import StrassenWinograd

class TestStrassenWinograd(unittest.TestCase):

    def test_multiply(self):
        matrix1 = [[1, 2], [3, 4]]
        matrix2 = [[5, 6], [7, 8]]
        result = StrassenWinograd.multiply(matrix1, matrix2)
        self.assertEqual(result, [[19, 22], [43, 50]])

if __name__ == '__main__':
    unittest.main()