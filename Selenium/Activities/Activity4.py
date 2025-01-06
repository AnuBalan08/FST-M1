from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/webelements/target-practice")
    print("Title of the page" + driver.title)

    heading_three = driver.find_element(By.TAG_NAME, "h3")
    print(heading_three.text)
    heading_five = driver.find_element(By.TAG_NAME, "h5")
    print(heading_five.value_of_css_property("color"))

    purple_class = driver.find_element(By.XPATH, "//*[text() = 'Purple']").get_dom_attribute("class")
    print(purple_class)

    slate_text =  driver.find_element(By.XPATH, "//*[text() = 'Slate']").text
    print(slate_text)
