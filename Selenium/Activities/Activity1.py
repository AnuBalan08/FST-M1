from selenium import webdriver

from selenium.webdriver.common.by import By


with webdriver.Chrome() as driver:
    driver.get("https://training-support.net/")
    print("Title of the page: "+ driver.title)
    driver.find_element(By.LINK_TEXT, "About Us").click()
    print("Title of About us page: "+ driver.title)
    driver.close()