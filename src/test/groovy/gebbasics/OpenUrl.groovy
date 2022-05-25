package gebbasics

import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver

System.setProperty("webdriver.chrome.driver","..\\..\\resources\\chromedriver.exe")
def browser =new Browser(driver: new ChromeDriver())

browser.go("https://nichethyself.com/tourism/home.html")

browser.$("input", name: "username", dynamic:true) <<"stc123"
Thread.sleep(2000)
browser.$("input", name:"password", dynamic:true) <<"12345"
Thread.sleep(2000)
browser.$("form[name='loginform']>button", dynamic:true).click() //as this locator gives list it will give SingleElementNavigatorOnlyMethodException
Thread.sleep(2000)
//form[name='loginform']>button
//glyphicon glyphicon-user
//browser.waitFor {title=="My account"}
//browser.waitFor{title=="Page Title"}
signOut=browser.$("span",class:"glyphicon glyphicon-user").click()
//signInButton=browser.$(id: "loginbutton", dynamic:true)
//signInButton.click()