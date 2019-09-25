import unittest

from solution import deep_count

class TestSolution(unittest.TestCase):

    def test_1(self):
        self.assertEqual(deep_count([]), 0)

    def test_2(self):
        self.assertEqual(deep_count([1, 2, 3]), 3)

    def test_3(self):
        self.assertEqual(deep_count(["x", "y", ["z"]]), 4)

    def test_4(self):
        self.assertEqual(deep_count([1, 2, [3, 4, [5]]]), 7)

    def test_5(self):
        self.assertEqual(deep_count([[[[[[[[[]]]]]]]]]), 8)


if __name__ == '__main__':
    unittest.main()