

# Automated Test Framework "jawy"

This project is an automated test framework built using Java, Cucumber BDD framework, and Selenium WebDriver. The framework is designed to validate the subscription packages on the website [https://subscribe.stctv.com/](https://subscribe.stctv.com/).

## Prerequisites

- Java Development Kit (JDK) 8 or above installed
- Maven installed
- Chrome browser installed
- Docker installed (optional)
- Jenkins installed (optional)

## Getting Started

Follow the steps below to set up and run the automated tests:

1. Clone the repository:

```
git clone <repository_url>
```

2. Install dependencies using Maven:

```
cd <project_directory>
mvn install
```

3. Update ChromeDriver path:
   - Open the `SubscriptionSteps.java` file located in `src/test/java` directory.
   - Update the `webdriver.chrome.driver` property with the correct path to your ChromeDriver executable.

4. Run the tests:
   - Open the `TestRunner.java` file located in `src/test/java` directory.
   - Right-click on the file and select "Run" or "Run As" > "JUnit Test".

## Project Structure

The project structure is as follows:

```
├── src
│   └── test
│       ├── java
│       │   └── step_definitions
│       │       └── SubscriptionSteps.java
│       ├── resources
│       │   └── subscription_packages.feature
│       └── pom.xml
├── Dockerfile
├── Jenkinsfile
└── README.md
```

- `src/test/java/step_definitions/SubscriptionSteps.java`: Contains the step definitions for the Cucumber scenarios.
- `src/test/resources/subscription_packages.feature`: Contains the Gherkin feature file with the scenarios to validate the subscription packages.
- `pom.xml`: Maven configuration file with project dependencies.
- `Dockerfile`: Dockerfile for containerizing the test framework (optional).
- `Jenkinsfile`: Jenkinsfile for configuring the Jenkins pipeline (optional).

## Dockerization (optional)

If you want to run the test framework inside a Docker container, follow these additional steps:

1. Build the Docker image:

```
docker build -t test-framework .
```

2. Run the Docker container:

```
docker run -it --rm test-framework
```

## Jenkins Integration (optional)

If you want to integrate the test framework with Jenkins, follow these additional steps:

1. Set up a Jenkins pipeline and configure it to pull the project from your Git repository.
2. Specify the Jenkinsfile in the pipeline configuration to execute the test framework.
3. Customize the Jenkinsfile as per your Jenkins environment and requirements.

