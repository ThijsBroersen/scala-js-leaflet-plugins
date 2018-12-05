package nl.thijsbroersen.leafletjs.L.dvf.layers

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

//trait MarkerDataLayerOptions extends js.Object {
//  val recordsField: String = js.native
//  val locationMode: String = js.native
//  val latitudeField: String = js.native
//  val longitudeField: String = js.native
//  val codeField: String = js.native
//  val geohashField: String = js.native
//  val layerOptions: LayerOptions = js.native
//  val displayOption: js.Object = js.native
//  val tooltipOptions: TooltipOptions = js.native
//  val showLegendTooltips: Boolean = js.native
//  //  val dynamicOptions:
//  //  val onEachRecord:
//
//}
//
//object MarkerDataLayerOptions {
//  def apply(
//    dataLayerOptions: DataLayerOptions = DataLayerOptions()
//  ): MarkerDataLayerOptions = {
//    OptionsUtil.merge[MarkerDataLayerOptions](
//      Seq(
//        dataLayerOptions,
//        js.Dynamic.literal()
//      )
//    )
//  }
//}

@js.native
@JSGlobal("L.markerDataLayer")
object MarkerDataLayer extends js.Any {
  def apply(data: js.Object, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): MarkerDataLayer = js.native
}

@js.native
trait MarkerDataLayer extends DataLayer {

}