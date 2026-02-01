from selenium import webdriver
from selenium.webdriver import Keys, ActionChains
from selenium.webdriver.common.by import By
import time

with webdriver.Firefox() as driver:
    driver.get(" https://training-support.net/webelements/keyboard-events")
    actions = ActionChains(driver)
    print("Page title is: ", driver.title)
    actions.send_keys("walk away, not in anger, but in self-respect").send_keys(Keys.RETURN).perform()   
    typed_text = driver.find_element(By.CSS_SELECTOR,"h1.mt-3.text-center").text
    print("Typed text is: ", typed_text)
    time.sleep(5)
    driver.quit()