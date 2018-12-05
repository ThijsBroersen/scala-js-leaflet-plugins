enablePlugins(ScalaJSPlugin)

name := "Scala.js Leaflet Plugins"

normalizedName := "scalajs-leaflet-plugins"

organization := "nl.thijsbroersen"

scalaVersion := "2.12.7"

scalacOptions ++= Seq("-deprecation", "-feature", "-P:scalajs:sjsDefinedByDefault")

crossScalaVersions := Seq("2.11.12", "2.12.7")

libraryDependencies ++= Seq(
	"org.scala-js" %%% "scalajs-dom" % "0.9.6",
	"nl.thijsbroersen" %%% "scalajs-leaflet" % "0.1",
	"org.singlespaced" %%% "scalajs-d3" % "0.3.4"
)

