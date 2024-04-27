## Overview

This automation framework is designed for testing Swag Labs Website functionalities using Cucumber for behavior-driven testing, JUnit for test execution, and Maven as the build tool. The framework promotes the use of Page Object Model (POM) for maintaining a clean and maintainable codebase.

## Prerequisites

* Java Development Kit (JDK) installed (version 11)
* Apache Maven installed
* Web browser (Chrome)

## Getting Started

1. **Clone the Repository:**

   `git clone https://github.com/shruthi-keerthi/TainExcercise.git`

   `cd TainExcercise`

2. **Execute the following Maven command to run the tests using Maven:**

    `mvn clean test`

## Test Cases and Test Reports

### Test Cases
The automated tests cover the following basic test cases for the e-commerce web application:

- Logging into the application
- Adding items to the cart
- Completing payment

These test cases are implemented as scenarios in the feature files located in the `src/test/resources/feature` directory.

### Test Reports
After running the automated tests, test reports are generated both locally and online.

#### Local Reports:
You can find the local test reports in HTML format. Navigate to the `target/cucumber-reports.html` directory to access them.

#### Online Reports:
Additionally, you can access the test reports online. The reports provide detailed information about the test execution and results.

To view the online test reports, visit the following link:

[View Cucumber Test Reports](https://reports.cucumber.io/reports/3f5c183d-fffc-4e3d-ae83-c4c85fb13df3)

These online reports will be available for 24 hours.