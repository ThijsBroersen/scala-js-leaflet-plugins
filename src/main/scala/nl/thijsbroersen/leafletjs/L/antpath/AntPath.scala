package nl.thijsbroersen.leafletjs.L.antpath

import nl.thijsbroersen.leafletjs.L._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait AntPath extends FeatureGroup {
  def pause(): Boolean = js.native
  def resume(): Boolean = js.native
  def map(callback: js.Function1[LatLng, Unit]): Unit = js.native
  def redraw(): Unit = js.native
  def addLatLng(latlngs: js.Array[LatLng]): this.type = js.native
  def setLatLngs(latlngs: js.Array[LatLng]): this.type = js.native
  def getLatLngs(): js.Array[LatLng] = js.native
}

@js.native
@JSGlobal("L.polyline.antPath")
object AntPath extends js.Any {
  def apply(latlngs: js.Array[LatLng], options: js.UndefOr[js.Dictionary[Any]] = js.undefined): AntPath = js.native
}
