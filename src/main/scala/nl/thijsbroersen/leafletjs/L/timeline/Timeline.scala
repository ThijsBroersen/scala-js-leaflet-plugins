package nl.thijsbroersen.leafletjs.L.timeline

import nl.thijsbroersen.leafletjs.L._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("L.timeline")
object Timeline extends js.Any {
  def apply(timedGeoJSON: js.UndefOr[js.Dynamic] = js.undefined, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Timeline = js.native
}

@js.native
trait Timeline extends GeoJSON {
  def setTime(timestamp: String): Unit = js.native
  def updateDisplayedLayers(): Unit = js.native
}

//trait TimelineOptions extends GeoJSONOptions {
//  val drawOnSetTime: Boolean = js.native
//}
//
//object TimelineOptions {
//  def apply(
//    drawOnSetTime: Boolean = true,
//    geoJSONOptions: GeoJSONOptions = GeoJSONOptions()
//  ): TimelineOptions = {
//    OptionsUtil.merge[TimelineOptions](
//      Seq(
//        geoJSONOptions,
//        js.Dynamic.literal(
//          drawOnSetTime = drawOnSetTime
//        )
//      )
//    )
//  }
//}

@js.native
@JSGlobal("L.timelineSliderControl")
object TimelineSliderControl extends js.Any {
  def apply(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): TimelineSliderControl = js.native
}

@js.native
trait TimelineSliderControl extends Control {
  def options: js.UndefOr[js.Dictionary[Any]] = js.native
  def setTime(timestamp: String): Unit = js.native
  def getDisplayed(): String = js.native
  def addTimelines(timelines: Timeline*): Unit = js.native
  def removeTimelines(timelines: js.Array[Timeline]): Unit = js.native
  def toggle(): Unit = js.native
  def prev(): Unit = js.native
  def pause(): Unit = js.native
  def play(): Unit = js.native
  def next(): Unit = js.native
}

//trait TimelineSliderControlOptions extends ControlOptions {
//  val start: js.UndefOr[String] = js.native
//  val end: js.UndefOr[String] = js.native
//  val formatOutput: js.Function1[js.UndefOr[Double], String] = js.native
//  val enablePlayback: Boolean = js.native
//  val enableKeyboardControls: Boolean = js.native
//  val steps: Int = js.native
//  val duration: Int = js.native
//  val showTicks: Boolean = js.native
//  val waitToUpdateMap: Boolean = js.native
//}
//
//object TimelineSliderControlOptions {
//  def apply(
//    start: js.UndefOr[String] = js.undefined,
//    end: js.UndefOr[String] = js.undefined,
//    formatOutput: js.Function1[js.UndefOr[Double], String] = { date: js.UndefOr[Double] => if (date.isDefined) date.toString() else "" },
//    enablePlayback: Boolean = true,
//    enableKeyboardControls: Boolean = false,
//    steps: Int = 1000,
//    duration: Int = 10000,
//    showTicks: Boolean = true,
//    waitToUpdateMap: Boolean = false,
//    controlOptions: ControlOptions = ControlOptions(position = "bottomleft")
//  ): TimelineSliderControlOptions = {
//    OptionsUtil.merge[TimelineSliderControlOptions](
//      Seq(
//        controlOptions,
//        js.Dynamic.literal(
//          start = start,
//          end = end,
//          formatOutput = formatOutput,
//          enablePlayback = enablePlayback,
//          enableKeyboardControls = enableKeyboardControls,
//          steps = steps,
//          duration = duration,
//          showTicks = showTicks,
//          waitToUpdateMap = waitToUpdateMap
//        )
//      )
//    )
//  }
//}
