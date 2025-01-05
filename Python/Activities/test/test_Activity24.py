
import pytest

@pytest.fixture()
def initial_amount():
    amount = 0
    return amount

@pytest.mark.parametrize("earned, spent, expected", [(30,10,20), (20,2,18),(30,10,18)])
def test_wallet(initial_amount, earned, spent, expected):
    amount = initial_amount + earned
    amount = amount - spent
    assert amount == expected

