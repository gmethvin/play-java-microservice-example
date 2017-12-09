# Play Java microservice example

This is a basic example demonstrating the `PlayService` sbt plugin for creating simple Play-based microservices. This plugin uses the standard maven layout, not the traditional Play web layout.

There are a few relevant files:
 - `project/plugins.sbt`: includes the Play sbt plugin.
 - `build.sbt`: the sbt build configuration. This configures a minimal `PlayService` and manually adds the `RoutesCompiler`. It is also possible to remove the `RoutesCompiler` plugin and use the [Routing DSL](https://www.playframework.com/documentation/2.6.x/JavaRoutingDsl).
 - `build.gradle`: a less minimal but working gradle build, using the Play gradle plugin. A future improvement to the Play gradle plugin should modularize the functionality more so we can easily disable the web functionality.
 - `src/main/resources/routes`: the routes file
 - `src/main/resources/application.conf`: the Play configuration
 - `src/main/java/com/example/myservice/MyServiceController.java`: the main controller for the application

Use `sbt run` or `gradle -t runPlayBinary` to run the app in development mode.
