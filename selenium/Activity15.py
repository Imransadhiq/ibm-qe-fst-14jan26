#
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait
import time

# Start the Driver
with webdriver.Firefox() as driver:
    # Declare the wait variable
    driver.get("https://training-support.net/webelements/dynamic-attributes")
    print(driver.title)
    driver.find_element(By.XPATH,"//input[@placeholder = 'Full name']").send_keys("Mohammad Imran")
    driver.find_element(By.XPATH,"//input[@type = 'email' and contains(@id ,'email')]").send_keys("imransadhiq@gmail.com")
    driver.find_element(By.XPATH,"//input[@type = 'date' and contains(@class,'svelte')]").send_keys("2026-02-01")
    driver.find_element(By.XPATH,"//textarea[contains(@id,'-additional-details-')]").send_keys("I told my code, “Run perfectly today.It laughed, showed me 3 new bugs, and asked if I’d like them before or after coffee.")
    driver.find_element(By.XPATH,"//button[text()= 'Submit']").click()
    print(driver.find_element(By.XPATH,'//h3[text()="Your event has been scheduled!"]').text)
    