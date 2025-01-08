import time

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select

def print_selected_values(selected_options):
    for option in selected_options:
        print(option.text)

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/selects")
    print("Title of the page : " + driver.title)

    multiselect = driver.find_element(By.XPATH, "(//select)[2]")
    select = Select(multiselect)

    select.select_by_visible_text("HTML")
    for i in range(3,6):
        select.select_by_index(i)

    print("Printing all selected options:")
    print_selected_values(select.all_selected_options)
    select.select_by_value("nodejs")

    select.deselect_by_index(4)
    print("=============================")
    print("Printing all selected values after deselecting the value in index 5")
    print_selected_values(select.all_selected_options)

    time.sleep(2)
    driver.close()

