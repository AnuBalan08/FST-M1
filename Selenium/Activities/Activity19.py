from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait


def confirm_button_alert_window(driver_web, wait_web):
    driver_web.find_element(By.ID, "confirmation").click()
    wait_web.until(expected_conditions.alert_is_present())
    alert1 = driver.switch_to.alert
    print("Message from pop up : " +alert1.text)
    return alert1

def print_message(driver_web):
    message = driver_web.find_element(By.ID, "result").text
    print("Message from main screen : " + message)


with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/alerts")

    wait = WebDriverWait(driver, 2)
    print("======= accept alert =======")
    alert = confirm_button_alert_window(driver, wait)
    alert.accept()
    print_message(driver)

    print("======= dismiss alert =======")
    alert = confirm_button_alert_window(driver, wait)
    alert.dismiss()
    print_message(driver)




