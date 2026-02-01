from selenium import webdriver
from selenium.webdriver import Keys, ActionChains
from selenium.webdriver.common.by import By
import time

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/drag-drop")
    actions = ActionChains(driver)
    ball = driver.find_element(By.ID,"ball")
    dropzone1 = driver.find_element(By.ID,"dropzone1")
    dropzone2 = driver.find_element(By.ID,"dropzone2")
    print("Page title is: ", driver.title)
    actions.drag_and_drop(ball, dropzone1).perform()
    time.sleep(2)
    print("Dropped in dropzone 1")
    actions.drag_and_drop(ball, dropzone2).perform()
    time.sleep(2)
    print("Dropped in dropzone 2")
    driver.quit()