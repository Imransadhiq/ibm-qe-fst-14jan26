from selenium import webdriver
from selenium.webdriver.common.by import By
import time

with webdriver.Firefox() as driver:
    driver.implicitly_wait(5)   
    driver.get("http://demostore.supersqa.com/")
    print(driver.title)
    time.sleep(3)
    driver.find_element(By.XPATH, "//a[contains(text(),'My Account')]").click()

    
    time.sleep(5)  
    driver.execute_script("window.scrollBy(0,300)")
    username =driver.find_element(By.ID,"username").send_keys("dhurandar")
    password = driver.find_element(By.ID,"password").send_keys("Dhur@1234")
    login_button = driver.find_element(By.NAME,"login").click()
    time.sleep(5)