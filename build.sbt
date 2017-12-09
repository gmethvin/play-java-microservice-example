lazy val root = (project in file("."))
  .enablePlugins(PlayService, RoutesCompiler)
  .settings(
    scalaVersion := "2.12.4",
    libraryDependencies ++= Seq(
      akkaHttpServer,
      guice,
      logback
    )
  )
