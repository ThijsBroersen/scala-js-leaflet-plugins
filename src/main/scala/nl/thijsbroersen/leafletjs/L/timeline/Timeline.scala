package nl.thijsbroersen.leafletjs.L.timeline

import nl.thijsbroersen.leafletjs.L._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("L.timeline")
object timeline extends js.Any {
  def apply(timedGeoJSON: js.UndefOr[js.Dynamic] = js.undefined,
            options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Timeline = js.native
}

@js.native
@JSGlobal("L.Timeline")
object Timeline extends GeoJSON

@js.native
trait Timeline extends GeoJSON {
  def setTime(timestamp: String): Unit = js.native
  def getDisplayed(): js.Dynamic       = js.native
  def updateDisplayedLayers(): Unit    = js.native
}

@js.native
@JSGlobal("L.timelineSliderControl")
object timelineSliderControl extends js.Any {
  def apply(timeline: Timeline,
            start: String,
            end: String,
            options: js.UndefOr[js.Dictionary[Any]] = js.undefined): TimelineSliderControl =
    js.native
}

@js.native
@JSGlobal("L.TimelineSliderControl")
object TimelineSliderControl extends Control

@js.native
trait TimelineSliderControl extends Control {
  def options: js.UndefOr[js.Dictionary[Any]]     = js.native
  def setTime(timestamp: String): Unit            = js.native
  def getDisplayed(): String                      = js.native
  def addTimelines(timelines: Timeline*): Unit    = js.native
  def removeTimelines(timelines: Timeline*): Unit = js.native
  def toggle(): Unit                              = js.native
  def prev(): Unit                                = js.native
  def pause(fromSynced: Boolean): Unit            = js.native
  def play(fromSynced: Boolean): Unit             = js.native
  def next(): Unit                                = js.native
}
