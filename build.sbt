name := "SBT Calculator"
version := "1.0"
scalaVersion := "2.12.12"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % Test

coverageFailOnMinimum := true
coverageMinimum := 90