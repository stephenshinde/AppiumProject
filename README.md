# AppiumProject


This project is developed with Appium Java Page object model for Mobile application Testing

**IDE** : intellij idea community version,<br />
**Programming Language** : Java,<br />
**Library Used** : Appium, Selenium Webdriver , TestNG<br />
**Reporting library Used** : Extent Report<br />
**Build Tool** : Maven<br />

## prerequisite
1. Install **Truecaller** application from google play store
2. Install intellij idea community version from **https://www.jetbrains.com/idea/download/#section=windows**
3. Download and Install Node js from **https://nodejs.org/en/download/current/**
4. Install Appium in comman line tool **https://appium.io/docs/en/about-appium/getting-started/?lang=en#installing-appium**
5. Start appium server using command **appium**

## How to Clone project:
1. Download and Install Git from https://git-scm.com/downloads,<br />
2. Navigate to computer drive<br />
3. Open command prompt<br />
3. Enter command **git clone https://github.com/stephenshinde/AppiumProject.git**<br />

## Install Maven build tool
1. Download Apache Maven<br />
2. Set enviornment variable path<br />

## Test Data
1. Use phone number which you want to login

## How to Run Project:
**First Way**
1. Import project in IDE
2. go to testng.xml file and update device capability details on which you have to execute test script
3. Right click on testng.xml and run


## How to access report
1. Once the execution is done<br />
2. In Reports folder, report.html file will be genrated <br />


## Project Structure:

1. tests : Test Cases<br />
2. config : Configuration files<br />
3. base : Base Class contains webdriver initialization<br />
5. utility : helpers package includes reusable function class<br />
6. pages : contains locators and steps <br />
8. Reports :  generated extents reports <br />
9. testng.xml : testng executable file<br />

