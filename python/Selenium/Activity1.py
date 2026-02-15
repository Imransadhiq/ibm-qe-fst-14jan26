from selenium import webdriver
from selenium.webdriver.common.by import By
with webdriver.Firefox() as driver:
    driver.get("https://training-support.net")
    print("Title:", driver.title)
    driver.find_element(By.LINK_TEXT, "About Us").click()
    print("New Page Title:", driver.title)