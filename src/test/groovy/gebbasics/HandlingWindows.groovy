package gebbasics

import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver

System.setProperty("webdriver.chrome.driver","..\\..\\resources\\chromedriver.exe")
def browser =new Browser(driver: new ChromeDriver())

browser.go("http://cookbook.seleniumacademy.com/Config.html")
browser.$("button",id:"helpbutton").click()
browser.withWindow("HelpWindow"){
    assert title=="Help"
}

browser.$("button",id:"helpbutton").click()
browser.withWindow({browser.title=="Help"})
        {assert title=="Help"}