package nl.thijsbroersen.leafletjs.L.playback

import nl.thijsbroersen.leafletjs.L
import nl.thijsbroersen.leafletjs.L.{Layer, Map}

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.Array
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.annotation.JSName

@js.native
@JSGlobal("L.playback")
object playback extends js.Any {
  def apply(map: Map,
            geoJSON: js.Dynamic,
            onPlaybackTimeChange: js.Function1[Int, Unit],
            options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Playback = js.native
}

@js.native
@JSGlobal("L.Playback")
object Playback extends Clock {
  @js.native
  @JSName("Clock")
  object Clock extends L.Class

  @js.native
  @JSName("TrackController")
  object TrackController extends L.Class

  @js.native
  @JSName("Track")
  object Track extends L.Class

  @js.native
  @JSName("TracksLayer")
  object TracksLayer extends L.Class

  @js.native
  @JSName("MoveableMarker")
  object MoveableMarker extends L.Marker

  @js.native
  @JSName("DateControl")
  object DateControl extends L.Control

  @js.native
  @JSName("PlayControl")
  object PlayControl extends L.Control

  @js.native
  @JSName("SliderControl")
  object SliderControl extends L.Control

  @js.native
  @JSName("Util")
  object Util extends js.Object {
    @JSName("ParseGPX")
    def ParseGPX(gpxString: String): js.Dynamic = js.native
  }

}

@js.native
trait Playback extends Clock {
  def addData(geoJSON: js.Dynamic | js.Array[js.Dynamic]): Unit = js.native
  def setData(geoJSON: js.Dynamic | js.Array[js.Dynamic]): Unit = js.native
  def clearData(): Unit                                         = js.native

}
@js.native
@JSGlobal("L.clock")
object clock extends js.Any {
  def apply(map: Map,
            geoJSON: js.Dynamic,
            onPlaybackTimeChange: js.Function1[Int, Unit],
            options: js.UndefOr[js.Dictionary[Any]] = js.undefined): Playback = js.native
}

@js.native
trait Clock extends L.Class {
  def start(): Unit                 = js.native
  def stop(): Unit                  = js.native
  def isPlaying(): Boolean          = js.native
  def setSpeed(speed: Double): Unit = js.native
  def setCursor(speed: Int): Unit   = js.native
  def getTime(): Int                = js.native
  def getStartTime(): Int           = js.native
  def getEndTime(): Int             = js.native
  def getTickLen(): Double          = js.native
}

@js.native
trait TrackController extends L.Class {}
