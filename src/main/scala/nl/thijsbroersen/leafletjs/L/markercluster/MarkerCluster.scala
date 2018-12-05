package nl.thijsbroersen.leafletjs.L.markercluster

import nl.thijsbroersen.leafletjs.L._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("L.markerCluster")
object MarkerCluster extends js.Any {
  def apply(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): MarkerClusterGroup = js.native
}

@js.native
trait MarkerCluster extends Marker {
  //  val options: MarkerClusterGroupOptions = js.native

  def getChildCount(): Int = js.native
  def getAllChildMarkers(): Marker = js.native
  def spiderfy(): Unit = js.native
  def unspiderfy(): Unit = js.native
  def zoomToBounds: Unit = js.native
  def getBounds(): LatLngBounds = js.native
  def createIcon(): Unit = js.native
  def createShadow(): Unit = js.native
}