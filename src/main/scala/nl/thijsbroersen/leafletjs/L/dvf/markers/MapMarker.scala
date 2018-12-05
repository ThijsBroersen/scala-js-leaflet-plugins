package nl.thijsbroersen.leafletjs.L.dvf.markers

import nl.thijsbroersen.leafletjs.L._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

//trait MapMarkerOptions extends js.Object {
//  val numberOfSides: Int = js.native
//  val rotation: Double = js.native
//  val radius: js.UndefOr[Double] = js.native
//  val radiusX: Double = js.native
//  val radiusY: Double = js.native
//  val innerRadius: js.UndefOr[Double] = js.native
//  val innerRadiusX: Double = js.native
//  val innerRadiusY: Double = js.native
//  val imageCircleUrl: String = js.native
//}
//
//object MapMarkerOptions {
//  def apply(
//    numberOfSides: Int = 3,
//    rotation: Double = 0,
//    radius: js.UndefOr[Double] = js.undefined,
//    radiusX: Double = 10,
//    radiusY: Double = 10,
//    innerRadius: js.UndefOr[Double] = js.undefined,
//    innerRadiusX: js.UndefOr[Double] = js.undefined,
//    innerRadiusY: js.UndefOr[Double] = js.undefined,
//    imageCircleUrl: String = null,
//    pathOptions: PathOptions = PathOptions()
//  ): MapMarkerOptions = {
//    OptionsUtil.merge[MapMarkerOptions](
//      Seq(
//        pathOptions,
//        js.Dynamic.literal(
//          numberOfSides = numberOfSides,
//          rotation = rotation,
//          radius = radius,
//          radiusX = radiusX,
//          radiusY = radiusY,
//          innerRadius = innerRadius,
//          innerRadiusX = innerRadiusX,
//          innerRadiusY = innerRadiusY,
//          imageCircleUrl = imageCircleUrl
//        )
//      )
//    )
//  }
//}

@js.native
@JSGlobal("L.mapMarker")
object MapMarker extends js.Any {
  def apply(latlng: LatLng, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): MapMarker = js.native
}

@js.native
trait MapMarker extends Path {

}
