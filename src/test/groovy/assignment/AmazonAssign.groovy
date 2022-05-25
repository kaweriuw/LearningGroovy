package assignment

import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver

System.setProperty("webdriver.chrome.driver","..\\..\\resources\\chromedriver.exe")
def browser =new Browser(driver: new ChromeDriver())

browser.go("https://www.amazon.in/")
//fashion=div[id:'nav-xshop']>a(5)
//fashion=div[id:"nav-xshop"]> a:nth-child(5)
fashion=browser.$("div",id:"nav-xshop") a[5]
//fashion=browser.$("div",id:"nav-xshop")> a:nth-child(5)
fashion.click()
signIn=browser. $("span", id:"nav-link-accountList-nav-line-1").click()
email=browser.$("input", id:"ap_email") << "abc_aadu@yahoo.com"
contButton=browser.$("input", id: "continue").click()
passwd=browser.$("input",id:"ap_password") << "Two*2jaChar"

//getOTP=browser.$("input",id:"continue").click()
Thread.sleep(2000)
signInSubmit=browser.$("input", id:"signInSubmit").click()
accName=browser.$("span",id:"nav-link-accountList-nav-line-1")
println accName.text()
//assert accName.text()=="Hello, aadi"
allLink=browser.$("a",id:"nav-hamburger-menu").click()
Thread.sleep(2000)
mobileLink=browser.$("a", "8").click()


//cart=browser.$("span", id:"nav-cart-count").click()
//def searchBox=browser.$("input",id:"twotabsearchtextbox")
//searchBox<<"iphone"
//searchButton=browser.$("input",id:"nav-search-submit-button")
//searchButton.click()
browser.quit()