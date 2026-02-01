from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select
with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/login-form/")
    print(driver.title)
    username = driver.find_element(By.XPATH,"//input[@id='username']").send_keys("admin")
    password = driver.find_element(By.XPATH,"//input[@id='password']").send_keys("password")
    login_button = driver.find_element(By.XPATH,"//button[contains(text(),'Submit')]").click()
    print(driver.title)
    message = driver.find_element(By.CSS_SELECTOR, "h1.text-center")
    print("Login message: ", message.text)
    driver.quit()