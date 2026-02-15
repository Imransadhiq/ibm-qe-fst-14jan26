import pytest
@pytest.mark.addition
def test_sum():
    a = 10
    b = 5
    assert a + b == 15
@pytest.mark.addition
def test_difference():
    a = 10
    b = 5
    assert a - b == 5
@pytest.mark.multiplication
def test_product():
    a = 10
    b = 5
    assert a * b == 50
@pytest.mark.other
def test_quotient():
    a = 10
    b = 5
    assert a / b == 2
