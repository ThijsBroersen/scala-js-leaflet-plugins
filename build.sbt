enablePlugins(ScalaJSPlugin)

name := "Scala.js Leaflet Plugins"

normalizedName := "scala-js-leaflet-plugins"

organization := "nl.thijsbroersen"

scalaVersion := "2.13.0"

scalacOptions ++= Seq("-deprecation", "-feature", "-P:scalajs:sjsDefinedByDefault")

crossScalaVersions := Seq("2.11.12", "2.12.8", "2.13.0")

libraryDependencies += "nl.thijsbroersen" %%% "scala-js-leaflet" % "0.2.5"

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

