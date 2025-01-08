from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait


def select_prompt_handle_alert(driver_web, wait_web):
    driver_web.find_element(By.ID, "prompt").click()
    wait_web.until(expected_conditions.alert_is_present())
    alert1 = driver.switch_to.alert
    return alert1

def print_message(driver_web):
    message = driver_web.find_element(By.ID, "result").text
    print("Content on parent window " +message)

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/alerts")
    print("Title of the page: " +driver.title)

    wait = WebDriverWait(driver, 2)

    print("entering value and accepting the alert")
    alert = select_prompt_handle_alert(driver, wait)
    alert.send_keys("Awesome!")
    alert.accept()
    print_message(driver)

    print("entering value and dismissing the alert")
    alert = select_prompt_handle_alert(driver, wait)
    alert.dismiss()
    print_message(driver)



