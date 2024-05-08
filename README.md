# UI-testing automation project for Nokian tyres

##### :arrow_right: website [NOKIAN TYRES][id] :arrow_left:

[id]: https://www.nokiantyres.ru/

## :page_with_curl: Contents

> :heavy_check_mark: [Technologies and tools](#technologist)
>
> :heavy_check_mark: [Verified checks](#verified)
>
> :heavy_check_mark: [Run tests from the terminal](#computer)
>
> :heavy_check_mark: [Running Tests in Jenkins](#running_tests)
>
> :heavy_check_mark: [Report on test results in Allure Report](#report_allure_report)
>
> :heavy_check_mark: [Integration with Allure TestOps](#integration_allure_testops)
>
> :heavy_check_mark: [Integration with Jira](#integration_jira)
>
> :heavy_check_mark: [Notifications in Telegram using a bot](#notifications_telegram_bot)

## :technologist: Technologies and tools

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/Github.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
</p>

> *In this project, automated tests are written in <code><strong>*Java*</strong></code> using <code><strong>*Selenide*</strong></code> framework for UI testing.*
>
> _<code><strong>*Gradle*</strong></code> is used for project building._
>
> *<code><strong>*JUnit 5*</strong></code> is utilized as the framework for unit testing.*
>
> *Test execution is performed from <code><strong>*Jenkins*</strong></code>.*
>
> *<code><strong>*Selenoid*</strong></code> is used for running browsers in <code><strong>*Docker*</strong></code>.*
>
> *<code><strong>*Allure Report, Allure TestOps, Jira, Telegram Bot*</strong></code> are employed for visualizing test results.*

## :verified: Verified checks

-   ✓ Verifying the transition to the extended warranty information page.
-   ✓ Check the transition to https://marketplace.nokiantyres.ru/ from the page "Extended Warranty".
-   ✓ Check the Advanced Guarantee Activation Page.
-   ✓ Check list of tyres with indefinite warranty.
-   Parametrized tests:
    -   ✓ bus centre selection;
    -   ✓ showroom selection.

## :computer: Run tests from the terminal

Local start:

```bash
gradle clean test
```

Remote start:

```bash
gradle
clean
test
-Duser=${USER}
-Dpassword=${PASSWORD}
```

## :running_tests: <img width="4%" title="Jenkins" src="images/Jenkins.svg"> Running Tests in [Jenkins](https://jenkins.autotests.cloud/job/tatacheba_qaguru_11_for_interview)

<p align="center">
  <img src="images/JenkinsProject.jpeg" alt="job" width="800">
</p>

## :report_allure_report: <img src="images/Allure_Report.svg" width="25" height="25"  alt="Allure"/></a> Report on test results in <a target="_blank" href="https://jenkins.autotests.cloud/job/tatacheba_qaguru_11_for_interview/allure">Allure report</a>

### Main

<p align="center">
<img title="Allure Overview Dashboard" src="images/allure_main.jpeg">
</p>

### Tests

<p align="center">
<img title="Allure Tests" src="images/allure_tests.jpeg">
</p>

### Graphics

<p align="center">
<img title="Allure Graphics" src="images/allure_graphics.jpeg">
</p>

### <img src="images/Selenoid.svg" width="25" height="25" /></a> Example video about passing tests

<p align="center">
<img title="Selenoid Video" src="images/video2.gif" width="100%" height="auto"  alt="video"> 
</p>

## :integration_allure_testops: <img src="images/Allure_EE.svg" width="25" height="25" /> Integration with [Allure TestOps](https://allure.autotests.cloud/project/1199/)

### Dashboards

<p align="center">
<img title="TestOps dashboards" src="images/Dashboards.jpeg">
</p>

### Test cases

<p align="center">
<img title="TestOps Test cases" src="images/Test cases.jpeg">
</p>

## :integration_jira: <img width="4%" title="Jenkins" src="images/Jira.svg"> Integration with [Jira](https://jenkins.autotests.cloud/job/tatacheba_qaguru_11_for_interview)

<p align="center">
<img title="Integration with Jira" src="images/jira_task.jpeg">
</p>

## :notifications_telegram_bot: <img src="images/Telegram.svg" width="25" height="25"/> Notifications in Telegram using a bot

<p align="center">
<img title="Allure Overview Dashboard" src="images/allure_telegram.jpeg">
</p>
