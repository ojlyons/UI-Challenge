# Notes

## Gradle

`gradle init` to put all the gradle stuff in a directory

the build.gradle file is for task definitions and plugin defs

run `gradlew zip` to run the task named `zip` as defined in build.gradle

`gradlew tasks` shows all available tasks

## Spring

use https://start.spring.io/ to make a spring project

first run `gradlew bootRun` to run the proj as a Spring Boot application

then you can open http://localHost:8080/ and see the contents of src/main/java/com.xyz/Application.java 

If you get 404 or it doesn't run it's probably not compiling

## Angular

`ng new app-name` to make new project - press enter a few times to accept defaults

`ng serve --open` in the app directory to serve it (run it)

serve builds and starts the server and everything, and --open opens the local link to the page

you can edit source files while it's running and serve will rebuild as needed

source files are in src/app/

application-wide styles go in styles.css, where page-specific ones go in app.componnet.css