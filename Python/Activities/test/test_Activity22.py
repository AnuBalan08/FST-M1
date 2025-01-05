import pytest

@pytest.mark.calc
def test_calculate_sum():
    a = 1
    b = 2
    add = a+b
    assert add == 3

def test_calculate_diff():
    a = 2
    b = 1
    diff = a - b
    assert diff == 1

def test_other_mul():
    a = 11
    b = 11
    mul = a * b
    assert mul == 1

def test_other_div():
    a = 11
    b = 11
    div = a / b
    assert div == 1