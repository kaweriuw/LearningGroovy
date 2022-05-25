package gebbasics

import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver

System.setProperty("webdriver.chrome.driver","..\\..\\resources\\chromedriver.exe")
def browser =new Browser(driver: new ChromeDriver())

browser.go("http://cookbook.seleniumacademy.com/Config.html")
def petrol=browser.$("input",value:"Petrol")
def diesel=browser.$("input",value:"Diesel")

petrol.value("Petrol") //This will select radiobutton
Thread.sleep(2000)
assert petrol.value()=="Petrol"
assert diesel.value()==null
browser.quit()