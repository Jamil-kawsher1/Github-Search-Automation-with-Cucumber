

#  Github Search Automation with Cucumber


The above automation project uses the Cucumber framework in Java to automate browser-based tests for the acceptance criteria of Github.com. The tests include searching for a specific repository, verifying the count and order of search results, and navigating to the About page of the site. Selenium WebDriver is used to interact with the web elements on the site, and JUnit is used to assert the expected outcomes of the tests. The project can be run using Maven, and a compatible browser and web driver must be installed on the testing machine. The project provides an efficient and automated way to ensure that the site's features are functioning as expected and can be run as part of a continuous integration and delivery pipeline.



## Author

- [@Jamil-kawsher1](https://www.github.com/Jamil-kawsher1)
## Automation Video

https://user-images.githubusercontent.com/42008531/224555348-0cd4b1e3-28d1-4f05-90f9-c03fe38556f5.mp4








## How to run this project

- Clone This project
- open Cloned file in IntelliJ IDEA
- Then Hit the follwing command in terminal

```bash
  mvn clean test
```
## Tools and Tech
- IntelliJ IDEA
- Selenium with Cucumber-Junit
- Maven
- Cucumber-Java
- Java




# Cucumber report Screenshots
![cucumber report](https://user-images.githubusercontent.com/42008531/224555634-106dfc4d-889d-4e80-929e-ffefd5e2b3bc.jpg)




## Scenerio

Create a project with browser-based tests for the following acceptance criteria for github.com. You must use "Cucumber Framework".

1. As a guest (not logged in), when searching GitHub for the term "create-react-app" from the landing page search input, you will see: A count of matching results
2. You will find and verify "facebook/create-react-app " project as the first result
3. As a guest, when clicking the "About" button in the landing page footer, you will be taken to the GitHub "About" page. verify, you are on about page

The following terms should be passed from the Example,
1. create-react-app
2. facebook/create-create-app

