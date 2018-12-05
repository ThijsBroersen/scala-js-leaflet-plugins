package nl.thijsbroersen.leafletjs.L.dvf.layers

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

//trait WordCloudDataLayerOptions extends js.Object {
//
//}
//
//object WordCloudDataLayerOptions {
//  def apply(): WordCloudDataLayerOptions = {
//    OptionsUtil.merge[WordCloudDataLayerOptions](
//      Seq(
//        js.Dynamic.literal()
//      )
//    )
//  }
//}

@js.native
@JSGlobal("L.wordCloudDataLayer")
object WordCloudDataLayer extends js.Any {
  def apply(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): WordCloudDataLayer = js.native
}

@js.native
trait WordCloudDataLayer extends ChartDataLayer {

}