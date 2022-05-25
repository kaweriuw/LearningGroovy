package gebbasics

import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver

System.setProperty("webdriver.chrome.driver","..\\..\\resources\\chromedriver.exe")
def browser =new Browser(driver: new ChromeDriver())

browser.go("http://cookbook.seleniumacademy.com/Config.html")

//close:false ll not close the new opened window
browser.withNewWindow({browser.$("button",id:"chatbutton").click()},
        wait:true, close:false){
    assert browser.$("p").text()=="Wait while we connect you to Chat..."
}

//close:false ll close the new opened window
//browser.withNewWindow({browser.$("button",id:"chatbutton").click()},
//        wait:true, close:true){
//    assert browser.$("p").text()=="Wait while we connect you to Chat..."
//}