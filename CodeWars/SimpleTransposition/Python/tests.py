import unittest

from solution import simple_transposition

class TestSolution(unittest.TestCase):

    def test_1(self):
        self.assertEqual("Sml etapetx", simple_transposition("Sample text"))

    def test_2(self):
        self.assertEqual("Sml rnpstoipetasoiin", simple_transposition("Simple transposition"))

    def test_3(self):
        self.assertEqual(
            "ko alpbi etwudrgtalnwcl ulcnx ol ih be",
            simple_transposition("know call public next would right able")
        )

if __name__ == '__main__':
    unittest.main()