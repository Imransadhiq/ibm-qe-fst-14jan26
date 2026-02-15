
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support.select import Select
with webdriver.Firefox() as driver:
    # Declare the wait variable
    driver.get("https://training-support.net/webelements/selects")
    print(driver.title)

    select_element = driver.find_element(By.CSS_SELECTOR,"")
    select_object = Select(select_element)
    options = select_object.is_multiple
    print(options)
    select_object.select_by_visible_text("HTML")
    select_object.select_by_value("Node")
    select_object.select_by_index(3)
    select_object.select_by_index(4)
    select_object.select_by_index(5)
    select_object.deselect_by_index(4)