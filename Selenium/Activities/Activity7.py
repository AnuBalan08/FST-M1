from selenium import webdriver
from selenium.webdriver.common.by import By


def edit_field_status_check(edit_field):
    return edit_field.is_enabled()

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print("Title of the page:" + driver.title)

    print("Validate whether edit field is enabled:  ")
    print("=======Before click the Enable input button====")
    input_field = driver.find_element(By.XPATH, "//*[@id = 'textInput']")
    # print(input_field)
    print("Edit field enabled: True/false:" +str(edit_field_status_check(input_field)))

    driver.find_element(By.XPATH, "//*[text()='Enable Input']").click()
    print("=======After click the Enable input button====")
    print("Edit field enabled: True/false:" + str(edit_field_status_check(input_field)))

    driver.close()



