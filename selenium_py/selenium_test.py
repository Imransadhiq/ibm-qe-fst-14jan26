from selenium import webdriver
from selenium.webdriver.common.by import By
import time

driver = webdriver.Firefox()
driver.get("https://www.google.com")
print(driver.title)
driver.refresh()
time.sleep(3)
driver.quit()