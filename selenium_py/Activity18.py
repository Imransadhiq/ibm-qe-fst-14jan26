# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait
with webdriver.Firefox() as driver:
    # Declare the wait variable
    wait = WebDriverWait(driver, timeout=10)
    driver.get("https://training-support.net/webelements/alerts")
    print("Page title is: ", driver.title)
    driver.find_element(By.ID, "simple").click()
    simpleAlert = wait.until(EC.alert_is_present())
    alertText = simpleAlert.text
    print("Text in alert: " + alertText)
    simpleAlert.accept()
    print(driver.find_element(By.ID, "result").text)