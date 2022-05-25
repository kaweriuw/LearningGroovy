package gebbasics

import geb.Browser
import geb.module.Select
import org.openqa.selenium.chrome.ChromeDriver

System.setProperty("webdriver.chrome.driver","..\\..\\resources\\chromedriver.exe")
def browser =new Browser(driver: new ChromeDriver())

browser.go("http://cookbook.seleniumacademy.com/Config.html")

def dropSel=browser.$("select",name:"make")

//select dropdown by value
dropSel.value("honda")
Thread.sleep(1000)
dropSel << "audi" //using left shift operator
Thread.sleep(1000)
//select dropdown by visible text

dropSel.value("Honda")
Thread.sleep(1000)
dropSel<<"Mercedes"

assert dropSel.find("option",value:dropSel.value()).text()=="Mercedes"

browser.quit()
