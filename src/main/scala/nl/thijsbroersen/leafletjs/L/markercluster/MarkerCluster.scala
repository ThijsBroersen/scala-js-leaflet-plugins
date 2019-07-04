package nl.thijsbroersen.leafletjs.L.markercluster

import nl.thijsbroersen.leafletjs.L._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("L.markerCluster")
object markerCluster extends js.Any {
  def apply(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): MarkerClusterGroup = js.native
}

@js.native
@JSGlobal("L.MarkerCluster")
object MarkerCluster extends Class {}

@js.native
trait MarkerCluster extends Marker {

  def getChildCount(): Int = js.native
  def getAllChildMarkers(storage: js.UndefOr[Array[Marker]] = js.undefined,
                         ignoreDraggableMarker: js.UndefOr[Boolean] = js.undefined): Marker = js.native
  def spiderfy(): Unit                                                                      = js.native
  def unspiderfy(): Unit                                                                    = js.native
  def zoomToBounds(options: js.UndefOr[js.Dictionary[_]] = js.undefined): Unit              = js.native
  def getBounds(): LatLngBounds                                                             = js.native
  def createIcon(): Unit                                                                    = js.native
  def createShadow(): Unit                                                                  = js.native
}
