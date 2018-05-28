# Clicker Game

## How to install.
To install the game just follow these few simple steps:

- First clone this repo using ```git clone git@github.com:alex-yiangou/ClickerGame.git```
- Depending on whether you have Gradle installed or not follow the appropriate steps

### 1. Gradle is installed:
Just follow the normal process of cleaing, building, and running the project with the gradle commands 
- ```gradle clean``` 
- ```gradle build``` 
- ```gradle run``` 

### 2. Gradle is not installed: 
In this case, if you do not want to download Gradle onto your machine, no problem. There is a solution to this, using the Gradle wrapper that is included in this project.

- If on a Windows machine use ```.gradlew (taskname) ``` where taskname can be the same tasks that are used for Gradle (clean, build, run)

- If on a Mac or Ubuntu machine, use ```./gradlew (taskname)``` where taskname can be the same tasks that are used for Gradle (clean, build, run)

## General
If in any case you would like to experiment more with Gradle, or have an error that you would like to investigate you can always use ```gradle tasks``` or ```./gradlew tasks``` to see all the project's available gradle tasks.

This project is currently closed to contributions due to the fact that it is a new project and I would like to set it up myself for the moment. But later on when it goes live, I will turn on the contributions and set it up accordingly to create issues, create kanban boards and create proper versions.