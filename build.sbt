lazy val root = (project in file("."))
  .aggregate(learn, cookbook)
  .settings(
    name    := "Scala",
    version := "LATEST-SNAPSHOT"
  )

lazy val learn = (project in file("modules/learn"))
  .settings(Settings.shared)
  .settings(
    name := "learn",
    libraryDependencies ++= Dependencies.learn
  )

lazy val cookbook = (project in file("modules/cookbook"))
  .settings(Settings.shared)
  .settings(
    name := "cookbook",
    libraryDependencies ++= Dependencies.cookbook
  )

