from selenium import webdriver
from selenium.webdriver.common.by import By
with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/login-form/")
    print(driver.title)
    username = driver.find_element(By.ID,"username")
    password = driver.find_element(By.ID,"password")
    username.send_keys("admin")
    password.send_keys("password")
    login = driver.find_element(By.XPATH,"//button[text()='Submit']")
    message = driver.find_element(By.CSS_SELECTOR, "h1.text-center")
    print("Login message: ", message.text)