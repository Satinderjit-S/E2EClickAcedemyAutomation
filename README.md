# E2EClickAcedemyAutomation



# About project
Included in this repository are simple example tests for the few webpages of QaClickacedemy.com using the following technologies -
Selenium Webdriver 3 + TestNg , Maven is used as a build automation tool and the logs are prepared by integrating Log4j into framework.
Current tests focus on the testing the visibility and usage of various webelements on the practice page 

Browser support- Chrome , Firefox and microsoft edge ( all drivers included in the project under drivers folder) 

Central Objects repository is used - 
for home page objects page object model is used (under main/java.pageObjects)
for login page page factory objects is used (under pageFactoryObjectRepository)

## Getting Started
Run Eclipse. Select the "File" > "Import" option from the menu:


Select the "General" > "Projects from Git" option.


Select the "Clone URI" option and click next.


Now paste the string "https://github.com/Satinderjit-S/E2EClickAcedemyAutomation.git". The rest of the text fields will automatically populate themselves, click "Next".


Click "Next".


You should now be at a page called "Local Destination". Here you can set the directory you would like the project to be downloaded to. Remember (copy) which directory you choose, you will need it later. Click "Next" again once you have chosen a location for your project.


On this page, some time will pass as a green bar fills up at the bottom. This is Eclipse downloading your project to the location you have selected. Once this is finished, you should be at a page that looks like this:



### Steps to change the target browser 
target browser can be changed by changing the "browser_data.properties" file under resources - by default its set to default browser.

### Steps to change the test suite
Currently project is running the tests specified in testng testngforpracticepage.xml(out of two othe one is testng.xml), however it can be changed by adjusting pom.xml file. 

### Steps to find the logs 
Log4j is used to log the test execution in the files under the logs folder. 
Currently log level is set to trace and can be changed in log4j2.xml under resources. 

### Known problems...
To run the tests in Maven the test names should end with Test however in this project TestNg XML files were used to derive and locate the tests.
