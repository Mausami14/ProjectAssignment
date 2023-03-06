# Selenium Test Project with Cucumber and Webdriver
This project demonstrates how to automate testing of the borrowing calculator on ANZ's website using Selenium, Cucumber, and Webdriver. The tests are written in Java.

Prerequisites
Java JDK 8 or higher
Maven 3.6 or higher
Eclipse or any other IDE that supports Java
Getting started
Clone this repository to your local machine.
Open Eclipse or your IDE of choice, and import the project as a Maven project.
Download the latest version of chromedriver from here and add it to your system PATH.
# Run the TestRunner.java 
file located in the src/test/java folder as a JUnit test.
## Project structure
The project is organized as follows:

```
css
Copy code
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── qa
│   │               ├── pages
│   │               │   └── BorrowingCalcPage.java
│   │               └── util
│   │                   └── TestContextSetUp.java
│   └── test
│       ├── java
│       │   └── stepDefination
│       │       ├── BorrowingCalcSteps.java
│       │       └── RunnerTest.java
│       └── resources
│           └── features
│               └── BorrowingCalc.feature
└── pom.xml
```

How to add new tests
To add new tests, follow these steps:

Create a new scenario in the BorrowingCalc.feature file.
Implement the step definitions for the new scenario in the BorrowingCalcSteps.java file.
If necessary, add new methods to the BorrowingCalcPage.java file to interact with the elements on the borrowing calculator page.
### Contributors
Mausami Nirmal Dhara