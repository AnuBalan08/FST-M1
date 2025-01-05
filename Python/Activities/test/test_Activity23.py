
import pytest

# @pytest.fixture()
# def initialize_value():
#     a = [1,2,3,4,5,6,7,8,9,10]
#     return a

def test_adding_list(initialize_value):
    add_result = 0
    for i in initialize_value:
        add_result += i
    assert add_result == 55