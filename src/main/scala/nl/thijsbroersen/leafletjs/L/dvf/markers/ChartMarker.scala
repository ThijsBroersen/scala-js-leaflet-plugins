package nl.thijsbroersen.leafletjs.L.dvf.markers

import nl.thijsbroersen.leafletjs.L._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportAll

//trait ChartMarkerOptions extends js.Object {
//  val data: js.Dictionary[Double] = js.native
//  val chartOptions: js.Dictionary[DataPoint] = js.native
//  //  val marker: Marker = js.native
//  val backgroundStyle: PathOptions = js.native
//}
//
//object ChartMarkerOptions {
//  def apply(
//    data: js.Dictionary[Double] = null,
//    chartOptions: js.Dictionary[DataPoint] = null,
//    backgroundStyle: PathOptions = PathOptions(
//      fill = true,
//      fillColor = "#707070",
//      fillOpacity = 0.2,
//      opacity = 0.8,
//      color = "#505050"
//    )
//  ): ChartMarkerOptions = {
//    OptionsUtil.merge[ChartMarkerOptions](
//      Seq(
//        js.Dynamic.literal(
//          data = data,
//          chartOptions = chartOptions,
//          backgroundStyle = backgroundStyle
//        )
//      )
//    )
//  }
//}

@js.native
trait ChartMarker extends FeatureGroup {
}

@JSExportAll
case class DataPoint(
  fillColor: String = "#FEE5D9",
  minValue: Double = 0,
  maxValue: Double = 20,
  maxHeight: Double = 20,
  displayText: Double => String = { number => f"$number%1.2f" }
)

//trait DataPointOptions extends js.Object {
//  val fillColor: String = js.native
//  val minValue: Double = js.native
//  val maxValue: Double = js.native
//  val maxHeight: Int = js.native
//  val displayText: Double => String = js.native
//}
//
//object DataPointOptions {
//  def apply(
//             fillColor: String = "#FEE5D9",
//             minValue: Double = 0,
//             maxValue: Double = 20,
//             maxHeight: Double = 20,
//             displayText: Double => String = { number => f"$number%1.2f" }
//           ): DataPointOptions = {
//    OptionsUtil.merge[DataPointOptions](
//      Seq(
//        js.Dynamic.literal(
//          fillColor = fillColor, minValue = minValue, maxValue = maxValue, maxHeight = maxHeight, displayText = displayText
//        )
//      )
//    )
//  }
//}