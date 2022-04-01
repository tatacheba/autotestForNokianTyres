# Проект по автоматизации тестирования для сайта Nokian tyres
##### Сайт [NOKIAN TYRES][id]
[id]: https://www.nokiantyres.ru/
## :pushpin: Содержание:

- [Технологии и инструменты](#Технологии-и-инструменты)
- [Реализованные проверки](#Реализованные-проверки)
- [Сборка в Jenkins](#Jenkins-job)
- [Запуск из терминала](#Запуск-тестов-из-терминала)
- [Allure отчет](#Allure-отчет)
- [Интеграция с Allure TestOps](#Интеграция-с-Allure-TestOps)
- [Интеграция с Jira](#Интеграция-с-Jira)
- [Отчет в Telegram](#Уведомление-в-Telegram-при-помощи-бота)
- [Видео примеры прохождения тестов](#Примеры-видео-о-прохождении-тестов)

## :small_orange_diamond: Технологии и инструменты

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

## :small_orange_diamond: Реализованные проверки

- ✓ Проверка перехода на страницу информации о расширенной гарантии.
- ✓ Проверка перехода в https://marketplace.nokiantyres.ru/ со страницы "Расширенная гарантия".
- ✓ Проверка перехода на страницу активации расширенной гарантии.
- ✓ Проверка списка шин с бессрочной гарантией.
- - Параметризированные тесты:
- ✓ выбор шинных центров;
- ✓ выбор автосалонов.

## <a><img src="images/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/performance_lab_complete_project/">Сборка в Jenkins</a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/performance_lab_complete_project/"><img src="images/jenkins_job.png" alt="Jenkins"/></a>
</p>

### Параметры сборки в Jenkins:

- browser (браузер, по умолчанию chrome)
- browserVersion (версия браузера, по умолчанию 91.0)
- browserSize (размер окна браузера, по умолчанию 1920x1080)
- browserMobileView (название мобильного устройства, для примера iPhone X)
- remoteDriverUrl (логин, пароль и адрес удаленного сервера selenoid или grid)
- videoStorage (адрес, по которому можно получить видео)
- threads (количество потоков)

## :computer: Запуск тестов из терминала

Локальный запуск:
```bash
gradle clean test
```

Удаленный запуск:
```bash
clean
test
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserMobileView="${BROWSER_MOBILE}"
-DremoteDriverUrl=https://${LOGIN}:${PASSWORD}@${REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
-Dthreads=${THREADS}
```

## <img src="images/Allure_Report.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/performance_lab_complete_project/22/allure/">Allure report</a>

### Основное окно

<p align="center">
<img title="Allure Overview Dashboard" src="images/allure_main.png">
</p>

### Тесты

<p align="center">
<img title="Allure Tests" src="images/allure_tests.png">
</p>

### Гафики

<p align="center">
<img title="Allure Graphics" src="images/allure_graphics.png">
</p>

## <img src="images/Allure_EE.svg" width="25" height="25"  alt="Allure"/></a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/launch/10223">Allure TestOps</a>

### Дашборд

<p align="center">
<img title="Allure TestOps Dashboard" src="images/testOps_main.png">
</p>

### Тест-кейсы

<p align="center">
<img title="Allure TestOps Tests" src="images/testOps_tests.png">
</p>

## <img src="images/Jira.svg" width="25" height="25"  alt="Allure"/></a>Интеграция с трекером задач <a target="_blank" href="https://jira.autotests.cloud/browse/AUTO-628">Jira</a>

<p align="center">
<img title="Jira" src="images/jira_task.png">
</p>

## <img src="images/Telegram.svg" width="25" height="25"  alt="Allure"/></a> Уведомление в Telegram при помощи бота

<p align="center">
<img title="Allure Overview Dashboard" src="images/allure_telegram.png">
</p>



### <img src="images/Selenoid.svg" width="25" height="25"  alt="Allure"/></a> Примеры видео о прохождении тестов

<p align="center">
<img title="Selenoid Video" src="images/video1.gif" width="250" height="153"  alt="video"> <img title="Selenoid Video" src="images/video2.gif" width="250" height="153"  alt="video"> <img title="Selenoid Video" src="images/video3.gif" width="250" height="153"  alt="video">
</p>
