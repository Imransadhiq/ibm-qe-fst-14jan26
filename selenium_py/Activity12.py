# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait

# Start the Driver
with webdriver.Firefox() as driver:
    # Declare the wait variable
    wait = WebDriverWait(driver, timeout=10)
    driver.get("https://training-support.net/webelements/dynamic-content")
    print(driver.title)
    click_me_button = driver.find_element(By.ID,"genButton").click()
    if wait.until(EC.text_to_be_present_in_element((By.ID,"word"),"release")):
        print("word Found: ",driver.find_element(By.ID,"word").text)
    driver.quit()