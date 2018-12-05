package nl.thijsbroersen.leafletjs.L.dvf.layers

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("L.panoramioLayer")
object PanoramioLayer extends js.Any {
  def apply(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): PanoramioLayer = js.native
}

@js.native
trait PanoramioLayer extends MarkerDataLayer {

}

//trait PanoramioLayerOptions extends js.Object {
//  val photoSet: String = js.native
//  val updateInterval: Int = js.native
//  val size: String = js.native
//  val refreshEvents: String = js.native
//  var onEachPhoto: Unit = js.native
//}
//
//object PanoramioLayerOptions {
//  def apply(
//    photoSet: String = "public",
//    updateInterval: Int = 300000,
//    size: String = "square",
//    refreshEvents: String = "moveend",
//    markerDataLayerOptions: MarkerDataLayerOptions = MarkerDataLayerOptions()
//  ): PanoramioLayerOptions = {
//    OptionsUtil.merge[PanoramioLayerOptions](
//      Seq(
//        markerDataLayerOptions,
//        js.Dynamic.literal(
//          photoSet = photoSet,
//          updateInterval = updateInterval,
//          size = size,
//          refreshEvents = refreshEvents
//        )
//      )
//    )
//  }
//}