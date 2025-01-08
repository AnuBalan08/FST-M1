from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait

def switch_current_page(driver_web):
    handles = driver_web.window_handles
    handle_list = list(handles)
    latest_handle = len(handle_list)
    driver_web.switch_to.window(handle_list[latest_handle-1])
    print("Switched to child tab: " + driver.title)

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/tabs")
    wait = WebDriverWait(driver, 2)
    print("Title of the page: " + driver.title)

    driver.find_element(By.XPATH, "//button[text() = 'Open A New Tab']").click()
    wait.until(expected_conditions.number_of_windows_to_be(2))
    switch_current_page(driver)

    driver.find_element(By.XPATH, "//button[text() = 'Open Another One']").click()
    wait.until(expected_conditions.number_of_windows_to_be(3))
    switch_current_page(driver)

    driver.find_element(By.XPATH, "//button[text() = 'Open Another One']").click()
    wait.until(expected_conditions.number_of_windows_to_be(4))
    switch_current_page(driver)

    driver.close()





