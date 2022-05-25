package gebbasics

import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver

System.setProperty("webdriver.chrome.driver","..\\..\\resources\\chromedriver.exe")
def browser =new Browser(driver: new ChromeDriver())

browser.go("http://cookbook.seleniumacademy.com/Config.html")

def dropMultiSel=browser.$("select",name:"color")

//dropMultiSel<<"br"

//selecting multiple values
dropMultiSel.value(["br","rd","bl"])

//deselecting all values
dropMultiSel.value([])


