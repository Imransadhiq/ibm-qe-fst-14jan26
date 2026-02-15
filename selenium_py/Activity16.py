# https://training-support.net/webelements/tables

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait
		
from selenium.webdriver.support.select import Select
from selenium.webdriver.support.select import Select

# Start the Driver
with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/selects")
    print(driver.title)
    select_element = driver.find_element(By.CSS_SELECTOR,"select.h10")
    select_object = Select(select_element)

    options = select_object.options

    select_object.select_by_visible_text("Two")
    print(select_object.first_selected_option.text)

    select_object.select_by_index(1)
    select_object.select_by_value("five")
    all_options=select_object.all_selected_options



