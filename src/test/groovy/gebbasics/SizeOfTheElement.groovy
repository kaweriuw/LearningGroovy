package gebbasics

import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver

System.setProperty("webdriver.chrome.driver","..\\..\\resources\\chromedriver.exe")
def browser =new Browser(driver: new ChromeDriver())

browser.go("https://nichethyself.com/tourism/home.html")

def loginUserField=browser.$("input",name:"username")
println loginUserField.height
println loginUserField.width
println loginUserField.x
println loginUserField.y
println browser.$("div")*.height
Thread.sleep(2000)
browser.quit()
