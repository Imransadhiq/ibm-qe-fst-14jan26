# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select
with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/selects")
    print(driver.title)
    dropdown = driver.find_element(By.CSS_SELECTOR,"select.h-10")
    singleSelect = Select(dropdown)
    singleSelect.select_by_visible_text("Two")
    print("Second Option:", singleSelect.first_selected_option.text)
    singleSelect.select_by_index(3)
    print("Third Option:", singleSelect.first_selected_option.text)
    singleSelect.select_by_value("four")
    print("Fourth Option:", singleSelect.first_selected_option.text)
    allOptions =  singleSelect.options
    print("Options in the operations")
    for options in allOptions:
        print(options.text)