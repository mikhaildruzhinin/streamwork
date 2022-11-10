ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.github.mikhaildruzhinin"
ThisBuild / organizationName := "mikhaildruzhinin"

lazy val root = (project in file("."))
  .settings(
    name := "streamwork",
  )

libraryDependencies ++= Seq(
  "org.apache.commons" % "commons-lang3" % "3.9",
  "io.javalin" % "javalin" % "3.13.13",
  "org.slf4j" % "slf4j-simple" % "1.7.25" % Test,
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.12.6.1",
  "org.jtwig" % "jtwig-core" % "5.87.0.RELEASE" % "runtime"
)
