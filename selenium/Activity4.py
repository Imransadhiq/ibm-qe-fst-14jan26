
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select
from selenium.webdriver.support.color import Color
with webdriver.Firefox() as driver: 
    driver.get("https://training-support.net/webelements/target-practice")
    print(driver.title)
    header3 = driver.find_element(By.XPATH,"//h3[contains(text(),'Heading #3')]")
    print(header3.text)
    header5 = Color.from_string(driver.find_element(By.XPATH,"//h5[contains(text(),'Heading #5')]").value_of_css_property("color"))
    print(header5.hex)
    print(header5.rgb)
    purple_button = driver.find_element(By.XPATH,"//button[contains(text(),'Purple')]")
    print(purple_button.get_attribute("class"))
    Slate_button = driver.find_element(By.XPATH,"//button[contains(text(),'Slate')]")
    print(Slate_button.text)
    driver.quit()