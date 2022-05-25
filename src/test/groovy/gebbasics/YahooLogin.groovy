package gebbasics

import geb.Browser
import org.openqa.selenium.Keys
import org.openqa.selenium.chrome.ChromeDriver

System.setProperty("webdriver.chrome.driver","..\\..\\resources\\chromedriver.exe")
def browser =new Browser(driver: new ChromeDriver())

browser.go("https://login.yahoo.com/")
def username=browser.$(id:"login-username")

browser.waitFor (10,0.5){username.isDisplayed()}
browser.$(id:"login-username")<<'abc_aadu@yahoo.com'
browser.$(id:"login-signin",dynamic:true)<< Keys.ENTER
browser.waitFor {browser.$(id:"login-passwd").isDisplayed()}
browser.$(id:"login-passwd")<<'DearJindagi' //check for password
browser.$(id:'login-signin') <<Keys.ENTER
