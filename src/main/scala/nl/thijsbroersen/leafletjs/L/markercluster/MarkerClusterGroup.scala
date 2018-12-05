package nl.thijsbroersen.leafletjs.L.markercluster

import nl.thijsbroersen.leafletjs.L._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

//trait MarkerClusterGroupOptions extends js.Object {
//  val showCoverageOnHover: Boolean = js.native
//  val zoomToBoundsOnClick: Boolean = js.native
//  val spiderfyOnMaxZoom: Boolean = js.native
//  val removeOutsideVisibleBounds: Boolean = js.native
//  val animateAddingMarkers: Int = js.native
//  val disableClusteringAtZoom: Boolean = js.native
//  val maxClusterRadius: String = js.native
//  val polygonOptions: String = js.native
//  val singleMarkerMode: String = js.native
//  val spiderLegPolylineOptions: String = js.native
//  val spiderfyDistanceMultiplier: String = js.native
//  val iconCreateFunction: MarkerClusterGroup => Icon = js.native
//  val chunkedLoading: Boolean = js.native
//  val chunkInterval: String = js.native
//  val chunkDelay: String = js.native
//  val chunkProgress: String = js.native
//}
//
//object MarkerClusterGroupOptions {
//  def apply(
//    //    iconCreateFunction: MarkerClusterGroup => Icon = { cluster =>
//    //
//    //      DivIcon(DivIconOptions(html = "<b>" + cluster.getChildCount() + "</b>"))
//    //    },
//    chunkedLoading: Boolean = true
//  ): MarkerClusterGroupOptions = {
//    OptionsUtil.merge[MarkerClusterGroupOptions](
//      Seq(
//        js.Dynamic.literal(
//          //          iconCreateFunction = iconCreateFunction,
//          chunkedLoading = chunkedLoading
//        )
//      )
//    )
//  }
//}

/**
 * Created by thijs on 10-4-17.
 */
@js.native
@JSGlobal("L.markerClusterGroup")
object MarkerClusterGroup extends js.Any {
  def apply(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): MarkerClusterGroup = js.native
}

@js.native
trait MarkerClusterGroup extends FeatureGroup {
  //  val options: MarkerClusterGroupOptions = js.native

//  def getChildCount(): Int = js.native
//  def getAllChildMarkers(): Marker = js.native
}