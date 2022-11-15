# Проект по автоматизации тестирования сайта компании Aston

## :cherry_blossom:	Содержание

> ➠ [Покрытый функционал](#earth_africa-покрытый-функционал)
>
> ➠ [Технологический стек](#classical_building-технологический-стек)
>
> ➠ [Запуск тестов из терминала](#запуск-тестов-из-терминала)
>
> ➠ [Запуск тестов в Jenkins](#robot-удаленный-запуск-тестов)
>
> ➠ [Отчет о результатах тестирования в Allure Report](#skier-главная-страница-allure-отчета)

## :earth_africa: Покрытый функционал

> Разработаны автотесты на <code>UI</code>.
### UI

- [x] Проверка отображения заголовка страницы
- [x] Проверка возможности заказать звонок


## :classical_building: Технологический стек

<p align="center">
  <img src="https://img.icons8.com/color/48/000000/intellij-idea.png" title="Intellij Idea" alt="Intellij Idea" width="40" height="40"/>&nbsp; 
  <img src="https://github.com/devicons/devicon/blob/master/icons/java/java-original-wordmark.svg" title="Java" alt="Java" width="40" height="40"/>&nbsp;
  <img src="https://www.svgrepo.com/show/354051/maven.svg" title="Maven"  alt="Maven" width="40" height="40"/>&nbsp;
  <img src="https://plugins.gradle.org/shared-assets/shared/images/elephant-corner.png" title="Gradle"  alt="Gradle" width="40" height="40"/>&nbsp;
  <img src="https://img.icons8.com/glyph-neue/344/github.png" title="GitHub" alt="GitHub" width="40" height="40"/>&nbsp;
  <img src="https://github.com/devicons/devicon/blob/master/icons/jenkins/jenkins-original.svg"  title="Jenkins" alt="Jenkins" width="40" height="40"/>&nbsp;
  <img src="https://miro.medium.com/max/1400/1*J8sjpKQJswCKiPUYVefbgQ.jpeg" title="JUnit 5" alt="JUnit 5" width="70" height="40"/>&nbsp;
  <img src="https://images.opencollective.com/allure-report/f14e715/logo/256.png" title="Allure" alt="Allure" width="40" height="40"/>&nbsp;
  <img src="https://avatars.githubusercontent.com/u/26328913?s=400&v=4" title="Selenoid" alt="Selenoid" width="50" height="40"/>&nbsp;
  </p>

 В данном проекте автотесты написаны на <code>Java</code> с использованием <code>Selenide</code> для UI-тестов.
>
> <code>Selenoid</code> выполняет запуск браузеров в контейнерах <code>Docker</code>.
>
> <code>Allure Report</code> формирует отчет о запуске тестов.
>
> Для автоматизированной сборки проекта используется <code>Gradle</code>.
>
> В качестве библиотеки для модульного тестирования используется <code>JUnit 5</code>.
>
> <code>Jenkins</code> выполняет запуск тестов.


## Запуск тестов из терминала

### :robot: Локальный запуск тестов

```
gradle clean test
```

