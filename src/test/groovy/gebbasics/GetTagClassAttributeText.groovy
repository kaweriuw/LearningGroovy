package gebbasics

import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver

System.setProperty("webdriver.chrome.driver","..\\..\\resources\\chromedriver.exe")
def browser =new Browser(driver: new ChromeDriver())

browser.go("https://nichethyself.com/tourism/home.html")
assert browser.$("a", href:"#about",1).text()=="All about the world"
assert browser.$(".w3-dropdown-hover").tag() == "div"
assert browser.$(".modal.fade").@role=="dialog"
print browser.$("div",id:"indianheritage").classes()
assert browser.$("div",id:"indianheritage").classes()==["bg-grey", "container-fluid", "text-center"]
print browser.$("input", type: "text")*.classes()
assert browser.$("input", type: "text")*.classes()==[[form-control], [form-control], [], []]

browser.close()