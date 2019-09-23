import unittest

from solution import balance

class TestSolution(unittest.TestCase):

    def test_1(self):
        self.assertEqual("Right", balance("!!", "??"))

    def test_2(self):
        self.assertEqual("Left", balance("!??", "?!!"))

    def test_3(self):
        self.assertEqual("Left", balance("!?!!", "?!?"))

    def test_4(self):
        self.assertEqual("Balance", balance("!!???!????","??!!?!!!!!!!"))


if __name__ == '__main__':
    unittest.main()