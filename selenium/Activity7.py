from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select
from selenium.webdriver.support.color import Color
import time
with webdriver.Firefox() as driver: 
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print(driver.title)
    text_field = driver.find_element(By.ID,"textInput")
    print("text_field enabled:",text_field.is_enabled())
    enable_text_field = driver.find_element(By.ID,"textInputButton").click()
    time.sleep(3)
    print("text_field enabled:",text_field.is_enabled())
    driver.quit()