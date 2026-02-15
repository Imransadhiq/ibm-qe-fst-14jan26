from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select
with webdriver.Firefox() as driver:
    driver.get("https://training-support.net")
    print(driver.title)
    click_on = driver.find_element(By.LINK_TEXT,"About Us").click()
    print(driver.title)
    driver.quit()
