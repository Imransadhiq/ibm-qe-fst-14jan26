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
    row = driver.find_elements(By.XPATH,"//table[contains(@class,'table-auto')]/tbody/tr/td")
    print(len(col))
    print(len(row))
    book_name  = driver.find_element(By.XPATH,"//table[contains(@class,'table-auto')]/tbody/tr[5]/td[2]")
    print(book_name.text)
    driver.find_element(By.XPATH,"//table[contains(@class, 'table-auto')]/thead/tr/th[5]").click()
    book_name2 = driver.find_element(By.XPATH,"//table[contains(@class,'table-auto')]/tbody/tr[5]/td[2]") 
    print(book_name2.text)
    driver.quit()