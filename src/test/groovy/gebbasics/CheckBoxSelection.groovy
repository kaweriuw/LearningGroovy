package gebbasics

import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver


System.setProperty("webdriver.chrome.driver","..\\..\\resources\\chromedriver.exe")
def browser =new Browser(driver: new ChromeDriver())

browser.go("http://cookbook.seleniumacademy.com/Config.html")

def abs=browser.$("input",name:"abs")

if (abs.value()==null){
    println "check the checkbox"
    abs.value(true)
}

if (abs.value()=="ABS"){
    println "Uncheck the checkbox"
    abs.value(false)
}

//for tag form with name attribute
//$("form").abs=true -- this ll select the checkbox
// assert $("form").abs=="ABS"-- this can be used for assertion
browser.quit()

