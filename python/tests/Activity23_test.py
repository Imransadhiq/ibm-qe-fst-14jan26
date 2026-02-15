import pytest

@pytest.fixture
def test_sum_of_list(number_list):
    assert sum(number_list) == 55
#once confirm the test passes move the fixtures into conftest.py file and return the test
