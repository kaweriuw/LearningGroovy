package gebbasics

import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver

System.setProperty("webdriver.chrome.driver","..\\..\\resources\\chromedriver.exe")
def browser =new Browser(driver: new ChromeDriver())

browser.go("https://nichethyself.com/tourism/home.html")

def loginUser=browser.$("input",name:"username")
loginUser << "stc123"
assert browser.focused().attr("name")=="username"
assert loginUser.focused
Thread.sleep(2000)
browser.quit()

