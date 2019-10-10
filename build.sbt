enablePlugins(ScalaJSPlugin)

name := "Scala.js Leaflet Plugins"

normalizedName := "scala-js-leaflet-plugins"

organization := "nl.thijsbroersen"

scalaVersion := "2.13.1"

scalacOptions ++= Seq("-deprecation", "-feature", "-P:scalajs:sjsDefinedByDefault")

crossScalaVersions := Seq("2.11.12", "2.12.10", "2.13.1")

libraryDependencies += "nl.thijsbroersen" %%% "scala-js-leaflet" % "0.3.0+2-4455e698-SNAPSHOT"

inThisBuild(List(
  homepage := Some(url("https://github.com/ThijsBroersen/scala-js-leaflet-plugins")),
  licenses := List("MIT" -> url("https://opensource.org/licenses/MIT")),
  developers := List(
    Developer(
      "thijsbroersen",
      "Thijs Broersen",
      "thijsbroersen@gmail.com",
      url("https://github.com/ThijsBroersen")
    )
  )
))

