package nl.thijsbroersen.leafletjs.L.dvf.markers

import nl.thijsbroersen.leafletjs.L._
import org.singlespaced.d3js.LayoutObject

import scala.scalajs.js
import scala.scalajs.js.annotation.{ JSGlobal }

/**
 * Created by thijs on 1-5-17.
 */
@js.native
trait WordCloudMarker extends ChartMarker {

}

@js.native
@JSGlobal("L.wordCloudMarker")
object wordCloudMarker extends js.Any {

  def apply(latlng: LatLng, options: js.UndefOr[js.Dictionary[Any]] = js.undefined): WordCloudMarker = js.native

}

@js.native
@JSGlobal("L.WordCloudMarker")
object WordCloudMarker extends Class {

}

//trait WordCloudMarkerOptions extends ChartMarkerOptions {
//  val wordCloud: WordCloud = js.native
//}
//
//object WordCloudMarkerOptions {
//  def apply(
//    wordCloud: js.UndefOr[WordCloud] = js.undefined, //WordCloud(),
//    chartMarkerOptions: ChartMarkerOptions = ChartMarkerOptions()
//  ): WordCloudMarkerOptions = {
//    OptionsUtil.merge[WordCloudMarkerOptions](
//      Seq(
//        chartMarkerOptions,
//        js.Dynamic.literal(
//          wordCloud = wordCloud
//        )
//      )
//    )
//  }
//}

//trait PatternOptions {
//  val width: String = "width"
//  val height: String = "height"
//  val patternUnits: String = "patternUnits"
//}
//
//object Pattern extends PatternOptions {
//  def apply(
//    width: js.UndefOr[Int] = js.undefined,
//    height: js.UndefOr[Int] = js.undefined,
//    patternUnits: js.UndefOr[String] = js.undefined
//  ): js.Dictionary[js.Any] = {
//    OptionsUtil.merge2(
//      Seq(
//        scala.collection.immutable.Map(
//        this.width -> width,
//        this.height -> height,
//        this.patternUnits -> patternUnits
//      ).toJSDictionary
//      )
//    )
//  }
//}

//trait WordCloudOptions {
//  val textField: String = "textField"
//  val countField: String = "countField"
//  val words: String = "words"
//  val patternOptions: String = "words"
//  //  val textFillColor: String = "textFillColor"
//  val rotation: String = "rotation"
//  val fontFamily: String = "fontFamily"
//  val fontSize: String = "fontSize"
//}

@js.native
trait WordCloud extends js.Object {
  def start(): this.type = js.native
  def stop(): this.type = js.native
  //  def timeInterval()
  def words(): js.Array[String] = js.native
  def words(words: js.Array[String]): this.type = js.native
  def size(): js.Array[Int] = js.native
  def size(size: js.Array[Int]): this.type = js.native
  //  def font(font: js.Function0)
  //  def fontStyle
  //  def fontWeight
  //  def fontSize
  //  def rotate
  //  def text
  //  def spiral
  //  def padding
  //  def random
  //  def canvas
}

@js.native
trait D3LayoutWordCloud extends LayoutObject {
  def cloud(): WordCloud = js.native
}

@js.native
@JSGlobal("d3.layout.cloud")
object WordCloud extends LayoutObject {

  def apply(): WordCloud = js.native
  //  def options(
  //               textField: js.UndefOr[String] = js.undefined,
  //               countField: js.UndefOr[String] = js.undefined,
  //               words: js.Array[js.Dictionary[js.Any]] = js.Array[js.Dictionary[js.Any]](),
  //               patternOptions: js.UndefOr[js.Dictionary[js.Any]] = js.undefined,
  //               //    textFillColor: Option[Ordinal[String, String]] = None,
  //               rotation: js.UndefOr[Int] = js.undefined,
  //               fontFamily: js.UndefOr[String] = js.undefined,
  //               fontSize: js.UndefOr[Int] = js.undefined
  //             ): js.Dictionary[js.Any] = {
  //    OptionsUtil.merge2(
  //      Seq(
  //        scala.collection.immutable.Map(
  //          this.textField -> textField,
  //          this.countField -> countField,
  //          this.words -> words,
  //          this.patternOptions -> patternOptions,
  //          //      "textFillColor" -> textFillColor,
  //          this.rotation -> rotation,
  //          this.fontFamily -> fontFamily,
  //          this.fontSize -> fontSize
  //        ).toJSDictionary
  //      )
  //    )
  //  }
}