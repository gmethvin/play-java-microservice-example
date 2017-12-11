# Play Java microservice example

This is a basic example demonstrating a Play microservice. This project uses the standard maven layout instead of the traditional Play web layout, and uses the `PlayService` sbt plugin to avoid unnecessary build dependencies.

There are a few relevant files:
 - `project/plugins.sbt`: includes the Play sbt plugin.
 - `build.sbt`: the sbt build configuration. This configures a minimal `PlayService` and manually adds the `RoutesCompiler`. It is also possible to remove the `RoutesCompiler` plugin and use the [Routing DSL](https://www.playframework.com/documentation/2.6.x/JavaRoutingDsl).
 - `build.gradle`/`pom.xml`: somewhat less minimal examples of builds for Gradle and Maven using their respective Play plugins.
 - `src/main/resources/routes`: the routes file
 - `src/main/resources/application.conf`: the Play configuration
 - `src/main/java/com/example/myservice/MyServiceController.java`: the main controller for the application

Use `sbt run`, `gradle -t runPlayBinary`, or `mvn play2:run` to run the app in development mode.
