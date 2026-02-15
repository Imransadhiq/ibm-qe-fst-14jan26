from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select
from selenium.webdriver.support.color import Color
import time
with webdriver.Firefox() as driver: 
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print(driver.title)
    check_box = driver.find_element(By.ID,'checkbox')
    print(check_box.is_selected())
    check_box.click()
    print("Checkbox selected: ", check_box.is_selected())
    time.sleep(3)
    driver.quit()
    