from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select
from selenium.webdriver.support.color import Color
import time
with webdriver.Firefox() as driver: 
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print(driver.title)
    chekbox = driver.find_element(By.ID,"checkbox").is_displayed()
    print("Checkbox is displayed: ", chekbox)
    remove_checkbox = driver.find_element(By.XPATH,"//button[contains(text(),'Toggle')]").click()
    chekbox = driver.find_element(By.ID,"checkbox").is_displayed()
    print("Checkbox is displayed: ", chekbox)
    time.sleep(5)
    driver.quit()
