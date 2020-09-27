# android-espresso-framework

## Overview

This is a simple yet easily scalable Android Application Testing Framework designed in BDD fashion. The languages used are Java and Gherkins. The build tool used is Gradle. The tests can easily be executed, modified or added without many code changes or complexities. The tests can be scaled or modified on the go right from the feature files.

Languages Used: JAVA, Gherkins



## Installation

Gradle has all the dependencies set up, so while importing the project it will download all the dependencies.

On command line, run

```console
`$./gradlew connectedCheck`
```

## Running tests

On Android Studio, take the following steps:

1. Run > Edit Configurations
2. Click "+" on left pane
3. Select Android Instrumented Tests
4. Put any name in the Name section 
5. Select "app" for module
6. Hit Apply
7. Choose the created Run configuration 
8. Click on Run

---

## Architecture 🔨🔨🔨

- POM (Page Object Model)
    - Implementation makes it easier to keep centralized code for all pages
    - Improves redundancy of locators and page methods
    - Change in DOM becomes easier to manage

- Espresso Framework
	- Record and Play feasibility to ease the addition and modification of tests
	- Automatic synchronization of UI elements and test actions
	- Light weight and compact, making it easy to manage & customize in long term
	- Faster and more stable than other compartive frameworks

- Cucumber Framework due to its BDD (Behavior Driven Development) approach
	- Gherkin language support, making it layman friendly and understandable for all stakeholders.
	- Cross Platform Support for Web, iOS, Android & more.
	- Easy parameterization from the feature files, making tests scalable on the go.
	- Reusability of same steps across different tests in different combinations.
	- Built in Cucumber Reports which contain the logs and precise test details.

---

## Support

Reach out to me at one of the following places!

- Linkedin at <a href="https://www.linkedin.com/in/madilqayyum/" target="_blank">`Adil Qayyum Linkedin`</a>
- Email at: adilqayyumk@gmail.com
