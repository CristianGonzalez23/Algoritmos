import unittest
from src import NaivLoopUnrollingTwo

class TestNaivLoopUnrollingTwo(unittest.TestCase):

    def test_multiply(self):
        matrix1 = [[1, 2], [3, 4]]
        matrix2 = [[5, 6], [7, 8]]
        result = NaivLoopUnrollingTwo.multiply(matrix1, matrix2)
        expected_result = [[19, 22], [43, 50]]
        self.assertEqual(result, expected_result)

if __name__ == '__main__':
    unittest.main()