import time

from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/login-form/")
    print("Title of the page: " + driver.title)

    driver.find_element(By.ID, "username").send_keys("admin")
    driver.find_element(By.NAME, "password").send_keys("password")
    driver.find_element(By.XPATH, "//button[@class = 'svelte-1pdjkmx']").click()

    time.sleep(2)
    print("Title after login: "+ driver.title)