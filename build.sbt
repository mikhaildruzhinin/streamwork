
ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.github.mikhaildruzhinin"
ThisBuild / organizationName := "mikhaildruzhinin"

lazy val root = (project in file("."))
  .settings(
    name := "streamwork",
  )
