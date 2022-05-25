package gebbasics

import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver

System.setProperty("webdriver.chrome.driver","..\\..\\resources\\chromedriver.exe")
def browser =new Browser(driver: new ChromeDriver())

browser.go("https://the-internet.herokuapp.com/javascript_alerts")
assert browser.withAlert (wait:true){
    browser.$("button",onclick:"jsAlert()").click()
} == "I am a JS Alert"

//browser.withNoAlert {
//    browser.$("p",text:"click the button to display a confirm box").click()
//}
