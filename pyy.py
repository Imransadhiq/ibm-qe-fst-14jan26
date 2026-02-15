import pytest

@pytest.fixture()
def my_fixture(request):
    print("\n-------------------------")
    print("fixturename: " + request.fixturename)
    print("scope: " + request.scope)
    print("function: " + request.function.__name__)
    print("cls: " + str(request.cls))
    print("module: " + request.module.__name__)
    print("fspath: " + str(request.fspath))
    print("--------------------------")

class TestClass():

    def test_one(self, my_fixture):
        print("test_one(): ")

    def test_two(self, my_fixture):
        print("test_two(): ")