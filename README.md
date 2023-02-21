# AutomationTesting Project with Selenium, TestNG, Allure Report
## Libraries, frameworks and technologies.
- Selenium 4.6.0
- TestNG 7.6.1
- Allure report 2.20.0
- Maven 4.0.0
- Java 17
- Intellij
## How to run source code ?
### Run all test case
- In Intellij, open View.
- Click terminal.
- Enter "mvn test".
### Run test class
- In Intellij, open View.
- Click terminal.
- Enter "mvn test -Dtest="'Test class name'".
### Run test method
- Intellij, open View.
- Click terminal.
- Enter "mvn test -Dtest="'Test class name#Test method name'".
### Change env for running test.
- Intellij, open View.
- Click terminal.
- Enter "mvn compile -Dtest='env'"
  - Run types of test you want by the following step on Run test.
## How to run report ?
### First of all, install Allure report.
- You can install Allure by Scoop (a support tool for windows powershell) or you can install manually by jar file
- Run Allure report with command line "allure serve 'file location'"

