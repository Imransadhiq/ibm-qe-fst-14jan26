# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait

# Start the Driver
with webdriver.Firefox() as driver:
    # Declare the wait variable
    wait = WebDriverWait(driver, timeout=10)
    driver.get("https://training-support.net/webelements/dynamic-controls")
    checkbox = driver.find_element(By.ID, "checkbox")
    print("Checkbox is displayed: ", checkbox.is_displayed())
    toggle_button = driver.find_element(By.XPATH,"//button[contains(text(),'Toggle Checkbox')]")
    toggle_button.click()
    wait.until(EC.invisibility_of_element(checkbox))
    print("Checkbox is displayed: ", checkbox.is_displayed())
    toggle_button.click()
    wait.until(EC.element_to_be_clickable(checkbox)).click()
    print("Checkbox is selected: ", checkbox.is_selected())
    driver.quit()
    


