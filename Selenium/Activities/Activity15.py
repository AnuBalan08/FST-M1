import time

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/dynamic-attributes")
    wait = WebDriverWait(driver, 2)
    print("Title of the page : " +driver.title)

    driver.find_element(By.XPATH, "//input[starts-with(@id, 'full-name-')]").send_keys("Anu")
    driver.find_element(By.XPATH, "//input[contains(@id, 'email')]").send_keys("anu.balan@ibm.com")
    driver.find_element(By.XPATH, "//input[@data-testid= 'event-date']").send_keys("08/04/1994")
    driver.find_element(By.XPATH, "//textarea[contains(@name, 'additional-details')]").send_keys("testing")
    time.sleep(2)
    driver.find_element(By.XPATH, "//button[text() = 'Submit']").click()

    wait.until(expected_conditions.presence_of_element_located((By.ID, "action-confirmation")))
    message = driver.find_element(By.ID, "action-confirmation").text
    time.sleep(2)
    print("success message is " + message)
    driver.close()

