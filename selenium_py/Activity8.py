# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get(" https://training-support.net/webelements/mouse-events")
    actions = ActionChains(driver)
    print("Page Title:",driver.title)
    cargo_lock_button = driver.find_element(By.CLASS_NAME,'svelte-hs12g9')
    cargo_toml = driver.find_element(By.XPATH,"//h1[contains(text(),'Cargo.toml')]")
    
    actions.click(cargo_lock_button).pause(2).move_to_element(cargo_toml).perform()
    actionMessage = driver.find_element(By.ID, "result").text
    print(actionMessage)

    src_button = driver.find_element(By.XPATH,"//h1[contains(text(),'src')]")
    target_button = driver.find_element(By.XPATH,"//h1[contains(text(),'target')]")
    actions.double_click(src_button).pause(2).context_click(target_button).pause(3).perform()
    open_button = driver.find_element(By.XPATH,"//div[@id='menu']/div/ul/li[1]").click()
    actionMessage = driver.find_element(By.ID, "result").text
    print(actionMessage)
    print("Clicked on Open option from context menu")
    driver.quit()


