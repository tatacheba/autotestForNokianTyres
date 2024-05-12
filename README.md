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

## <a name="technologist"> Technologies and tools</a>

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/Github.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
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

## <a name="verified">Verified checks</a>

-   ✓ Verifying the transition to the advanced guarantee information page.
-   ✓ Checking the transition from the page "Advanced Guarantee" to https://marketplace.nokiantyres.ru/
-   ✓ Check the Advanced Guarantee Activation Page.
-   ✓ Check list of tyres with indefinite warranty.
-   Parametrized tests:
    -   ✓ Bus center selection;
    -   ✓ Showroom selection.

## <a name="computer">Run tests from the terminal</a>

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

## <img width="4%" title="Jenkins" src="images/logo/Jenkins.svg"><a name="running_tests">Running Tests in [Jenkins](https://jenkins.autotests.cloud/job/tatacheba_qaguru_11_for_interview)</a>

<p align="center">
  <img src="images/screenshots/JenkinsProject.jpeg" alt="job" width="800">
</p>

## <img src="images/logo/Allure_Report.svg" width="25" height="25"  alt="Allure"/><a name="report_allure_report"> Report on test results in <a target="_blank" href="https://jenkins.autotests.cloud/job/tatacheba_qaguru_11_for_interview/allure">Allure report</a> </a>

### Main

<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/allure_main.jpeg">
</p>

### Tests

<p align="center">
<img title="Allure Tests" src="images/screenshots/allure_tests.jpeg">
</p>

### Graphics

<p align="center">
<img title="Allure Graphics" src="images/screenshots/allure_graphics.jpeg">
</p>

### <img src="images/logo/Selenoid.svg" width="25" height="25" /></a> Example video about passing tests

<p align="center">
<img title="Selenoid Video" src="images/screenshots/video2.gif" width="100%" height="auto"  alt="video"> 
</p>

## <img src="images/logo/Allure_EE.svg" width="25" height="25" /> <a name="integration_allure_testops">Integration with [Allure TestOps](https://allure.autotests.cloud/project/1199/)</a>

### Dashboards

<p align="center">
<img title="TestOps dashboards" src="images/screenshots/Dashboards.jpeg">
</p>

### Test cases

<p align="center">
<img title="TestOps Test cases" src="images/screenshots/Test cases.jpeg">
</p>

## <img width="4%" title="Jenkins" src="images/logo/Jira.svg"><a name="integration_jira">Integration with [Jira](https://jenkins.autotests.cloud/job/tatacheba_qaguru_11_for_interview)</a>

<p align="center">
<img title="Integration with Jira" src="images/screenshots/jira_task.jpeg">
</p>

## <img src="images/logo/Telegram.svg" width="25" height="25"/> <a name="notifications_telegram_bot">Notifications in Telegram using a bot</a>

<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/allure_telegram.jpeg">
</p>
