package nl.thijsbroersen.leafletjs.L.markercluster

import nl.thijsbroersen.leafletjs.L._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.annotation.JSName

/**
  * Created by thijs on 10-4-17.
  */
@js.native
@JSGlobal("L.markerClusterGroup")
object markerClusterGroup extends js.Any {
  def apply(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): MarkerClusterGroup = js.native

  @js.native
  @JSName("layerSupport")
  object layerSupport extends js.Any {
    def apply(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): LayerSupport = js.native
  }
}

@js.native
@JSGlobal("L.MarkerClusterGroup")
object MarkerClusterGroup extends Class {}

@js.native
trait MarkerClusterGroup extends FeatureGroup {

  def addLayers(layers: js.Array[Marker]): this.type              = js.native
  def removeLayers(layers: js.Array[Marker]): this.type           = js.native
  def getVisibleParent(marker: Marker): js.UndefOr[Marker]        = js.native
  def refreshClusters(): Unit                                     = js.native
  def refreshClusters(markers: js.Array[Marker]): Unit            = js.native
  def refreshClusters(group: LayerGroup): Unit                    = js.native
  def refreshClusters(marker: Marker): Unit                       = js.native
  def zoomToShowLayer(layer: Layer, cb: js.Function0[Unit]): Unit = js.native
}

@js.native
@JSGlobal("L.MarkerClusterGroup.LayerSupport")
object LayerSupport extends Class {}

@js.native
trait LayerSupport extends MarkerClusterGroup {

  def checkIn(layer: Marker): this.type             = js.native
  def checkIn(layers: js.Array[Marker]): this.type  = js.native
  def checkOut(layer: Marker): this.type            = js.native
  def checkOut(layers: js.Array[Marker]): this.type = js.native
}
