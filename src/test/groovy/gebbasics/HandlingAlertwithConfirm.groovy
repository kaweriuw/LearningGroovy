package gebbasics

import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver

System.setProperty("webdriver.chrome.driver","..\\..\\resources\\chromedriver.exe")
def browser =new Browser(driver: new ChromeDriver())

browser.go("https://the-internet.herokuapp.com/javascript_alerts")
//This will accept the alert
browser.withConfirm (wait:true,true){
    browser.$("button",onclick:"jsConfirm()").click()
}

//This will cancel the alert
browser.withConfirm (wait:true,false){
    browser.$("button",onclick:"jsConfirm()").click()
}

//below action on element where it ll not shown any confirm
//browser.withNoConfirm {
//    browser.$("button", onclick:"jsAlert()").click()
//}