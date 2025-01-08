

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait

with webdriver.Chrome() as driver:

    wait = WebDriverWait(driver, 2)

    driver.get("https://training-support.net/webelements/alerts")
    print("Title of the page: " + driver.title)

    driver.find_element(By.ID, "simple").click()
    wait.until(expected_conditions.alert_is_present())

    alert = driver.switch_to.alert

    print("Content of pop up: " + alert.text)

    alert.accept()

    success_message = driver.find_element(By.ID, "result").text
    print(success_message)

    driver.close()

