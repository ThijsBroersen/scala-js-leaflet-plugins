package nl.thijsbroersen.leafletjs.L.dvf.layers

import nl.thijsbroersen.leafletjs.L._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

//trait DataLayerOptions extends js.Object {
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
//object DataLayerOptions {
//  def apply(
//    recordsField: String = "features",
//    locationMode: String = "latlng",
//    latitudeField: String = "coordinates.1",
//    longitudeField: String = "coordinates.0",
//    codeField: String = null,
//    geohashField: String = null,
//    layerOptions: LayerOptions = null,
//    displayOption: js.Object = null,
//    tooltipOptions: TooltipOptions = null,
//    showLegendTooltips: Boolean = true
//  ): DataLayerOptions = {
//    OptionsUtil.merge[DataLayerOptions](
//      Seq(
//        js.Dynamic.literal(
//          recordsField = recordsField,
//          locationMode = locationMode,
//          latitudeField = latitudeField,
//          longitudeField = longitudeField,
//          codeField = codeField,
//          geohashField = geohashField,
//          layerOptions = layerOptions,
//          displayOption = displayOption,
//          tooltipOptions = tooltipOptions,
//          showLegendTooltips = showLegendTooltips
//        )
//      )
//    )
//  }
//}

@js.native
@JSGlobal("L.dataLayer")
object DataLayer extends js.Any {
  def apply(data: js.Object, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): DataLayer = js.native
}

@js.native
trait DataLayer extends FeatureGroup {

}