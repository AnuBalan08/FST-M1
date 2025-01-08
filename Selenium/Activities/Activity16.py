
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import Select

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/selects")
    print("Title of the page: " + driver.title)

    dropdown = driver.find_element(By.TAG_NAME, "select")
    select = Select(dropdown)

    select.select_by_visible_text("Two")
    print("Second value is : " + select.first_selected_option.text)

    select.select_by_index(3)
    print("Third value is : " + select.first_selected_option.text)

    select.select_by_value("four")
    print("fourth value is : " + select.first_selected_option.text)

    options = select.options
    print("Options are : ")

    for option in options:
        print(option.text)

    driver.close()

