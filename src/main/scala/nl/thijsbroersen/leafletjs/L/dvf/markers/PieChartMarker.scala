package nl.thijsbroersen.leafletjs.L.dvf.markers

import nl.thijsbroersen.leafletjs.L._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
 * Created by thijs on 1-5-17.
 */
@js.native
trait PieChartMarker extends ChartMarker {
}

@js.native
@JSGlobal("L.pieChartMarker")
object pieChartMarker extends js.Any {

  def apply(latlng: LatLng, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): PieChartMarker = js.native
}

@js.native
@JSGlobal("L.PieChartMarker")
object PieChartMarker extends Class {

}