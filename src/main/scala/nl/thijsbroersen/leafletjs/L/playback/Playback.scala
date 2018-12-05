package nl.thijsbroersen.leafletjs.L.playback

import nl.thijsbroersen.leafletjs.L.{ Layer, Map }

import scala.scalajs.js
import scala.scalajs.js.Array
import scala.scalajs.js.annotation.JSGlobal

//trait PlaybackOptions extends js.Object {
//  val tickLen: Int = js.native
//  val speed: Float = js.native
//  val maxInterpolationTime: Float = js.native
//  val tracksLayer: Boolean = js.native
//  val playControl: Boolean = js.native
//  val dateControl: Boolean = js.native
//  val sliderControl: Boolean = js.native
//  val layer: js.Dynamic = js.native
//  val marker: js.Dynamic = js.native
//  val orientIcons: Boolean = js.native
//  val mouseOverCallback: Unit = js.native
//  val clickCallback: Unit = js.native
//  val popups: Boolean = js.native
//  val labels: Boolean = js.native
//  val staleTime: Float = js.native
//  val fadeMarkersWhenStale: Boolean = js.native
//}
//
//object PlaybackOptions {
//  def apply(
//    tickLen: Int = 250,
//    speed: Float = 1,
//    maxInterpolationTime: Float = 5 * 60 * 1000,
//    tracksLayer: Boolean = true,
//    playControl: Boolean = false,
//    dateControl: Boolean = false,
//    sliderControl: Boolean = false,
//    layer: js.Object = js.Object(),
//    marker: js.Object = js.Object(),
//    orientIcons: Boolean = false,
//    mouseOverCallback: Unit = { (even: MouseEvent) => },
//    clickCallback: Unit = { (even: MouseEvent) => },
//    popups: Boolean = false,
//    labels: Boolean = false,
//    staleTime: Float = 60 * 60 * 1000,
//    fadeMarkersWhenStale: Boolean = false
//  ): WebGLHeatmapOptions = {
//    OptionsUtil.merge[WebGLHeatmapOptions](
//      Seq(
//        js.Dynamic.literal(
//          tickLen = tickLen, speed = speed, maxInterpolationTime = maxInterpolationTime, tracksLayer = tracksLayer, playControl = playControl,
//          dateControl = dateControl, sliderControl = sliderControl, layer = layer, marker = marker, orientIcons = orientIcons,
//          mouseOverCallback = mouseOverCallback, clickCallback = clickCallback, popups = popups, labels = labels,
//          staleTime = staleTime, fadeMarkersWhenStale = fadeMarkersWhenStale
//        )
//      )
//    )
//  }
//}

@js.native
@JSGlobal("L.playback")
object Playback extends js.Any {
  def apply(map: Map, geoJSON: js.Dynamic, onPlaybackTimeChange: => Unit, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Playback = js.native
}

@js.native
trait Playback extends Layer {
  def addData(dataPoints: Array[js.Dynamic]): Unit = js.native
  def setData(dataPoints: Array[js.Dynamic]): Unit = js.native
  def clearData(): Unit = js.native
  def data: Array[js.Any] = js.native
  def version: String = js.native

}

