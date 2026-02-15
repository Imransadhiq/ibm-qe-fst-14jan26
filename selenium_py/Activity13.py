# https://training-support.net/webelements/tables

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait

# Start the Driver
with webdriver.Firefox() as driver:
    # Declare the wait variable
    driver.get("https://training-support.net/webelements/tables")
    print(driver.title)
    col = driver.find_elements(By.XPATH,"//table[contains(@class,'table-auto')]/thead/tr/th")
    print("Number of col in the table:", len(col))
    rows = driver.find_elements(By.XPATH,"//table[contains(@class,'table-auto')]/tbody/tr")
    print("Number of rows in the table:", len(rows))
    third_row_values = driver.find_elements(By.XPATH,"//table[contains(@class,'table-auto')]/tbody/tr[3]/td")
    for values in third_row_values:
        print(values.text,end=" ")
    print()
    cell_value = driver.find_elements(By.XPATH,"//table[contains(@class,'table-auto')]/tbody/tr[2]/td[2]")
    print(cell_value[0].text)


