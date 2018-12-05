package nl.thijsbroersen.leafletjs.L.dvf.layers

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

//trait ChartDataLayerOptions extends js.Object {
//
//}
//
//object ChartDataLayerOptions {
//  def apply(
//    dataLayerOptions: DataLayerOptions = DataLayerOptions()
//  ): ChartDataLayerOptions = {
//    OptionsUtil.merge[ChartDataLayerOptions](
//      Seq(
//        dataLayerOptions,
//        js.Dynamic.literal()
//      )
//    )
//  }
//}

/**
 * Created by thijs on 10-4-17.
 */
@js.native
@JSGlobal("L.chartDataLayer")
object ChartDataLayer extends js.Any {
  def apply(data: js.Object, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): ChartDataLayer = js.native
}

@js.native
trait ChartDataLayer extends DataLayer {

}

@js.native
@JSGlobal("L.barChartDataLayer")
object BarChartDataLayer extends js.Any {
  def apply(data: js.Object, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): BarChartDataLayer = js.native
}

@js.native
trait BarChartDataLayer extends ChartDataLayer