version := "0.1.0-SNAPSHOT"

scalaVersion := "2.13.8"

name := "ScalaBuildToolWith Test"

libraryDependencies ++= Seq(
  "org.apache.commons" % "commons-lang3" % "3.12.0" % Compile,
  "org.scalatest" %% "scalatest" % "3.1.2" % Test,
  "org.scalatestplus" %% "scalacheck-1-14" % "3.1.2.0" % Test,
  "com.novocode" % "junit-interface" % "0.11" % Test
)
