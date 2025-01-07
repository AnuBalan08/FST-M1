from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print("Title of the page is " + driver.title)

    checkbox_element = driver.find_element(By.XPATH, "//*[@id = 'checkbox']")
    print("Before selecting checkbox, check box state is: "+ str(checkbox_element.is_selected()))

    checkbox_element.click()
    print("After selecting checkbox, check box state is: "+ str(checkbox_element.is_selected()))

    driver.close()

