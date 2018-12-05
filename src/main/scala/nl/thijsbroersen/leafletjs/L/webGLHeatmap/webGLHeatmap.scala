package nl.thijsbroersen.leafletjs.L.webGLHeatmap

import nl.thijsbroersen.leafletjs.L.Renderer

import scala.scalajs.js
import scala.scalajs.js.Array
import scala.scalajs.js.annotation.JSGlobal

//case class HeatMapPoint(lat: Double, lon: Double, intensity: Int)

//@ScalaJSDefined
//trait WebGLHeatmapOptions extends js.Object {
//  val size: js.UndefOr[Int] = js.undefined
//  val units: js.UndefOr[String] = js.undefined
//  val opacity: js.UndefOr[Double] = js.undefined
//  val gradientTexture: js.UndefOr[String] = js.undefined
//  val alphaRange: js.UndefOr[Double] = js.undefined
//  val autoresize: js.UndefOr[Boolean] = js.undefined
//}
//trait WebGLHeatmapOptions extends js.Object {
//  val size: Int = js.native
//  val units: String = js.native
//  val opacity: Double = js.native
//  val gradientTexture: Boolean = js.native
//  val alphaRange: Double = js.native
//  val autoresize: Boolean = js.native
//}
//
//object WebGLHeatmapOptions {
//  def apply(
//    size: Int = 400, //js.UndefOr[Int] = js.undefined,
//    units: String = "m",
//    opacity: Double = 1.0, //js.UndefOr[Double] = js.undefined,
//    gradientTexture: Boolean = false,
//    alphaRange: Double = 1.0,
//    autoresize: Boolean = true
//  ): WebGLHeatmapOptions = {
//    OptionsUtil.merge[WebGLHeatmapOptions](
//      Seq(
//        js.Dynamic.literal(
//          size = size, units = units, opacity = opacity, gradientTexture = gradientTexture, alphaRange = alphaRange,
//          autoresize = autoresize
//        )
//      )
//    )
//  }
//}

@js.native
trait WebGLHeatmap extends Renderer {
  def setData(dataPoints: Array[Array[Double]]): Unit = js.native
  def data: Array[js.Any] = js.native
  def addDataPoint(lat: Double, lon: Double, value: Int): Unit = js.native
  def draw(): Unit = js.native
  def resize(): Unit = js.native
  def reposition(): Unit = js.native
  def version: String = js.native
}

@js.native
@JSGlobal("L.webGLHeatmap")
object webGLHeatmap extends js.Any {
  def apply(options: js.Dictionary[Any]): WebGLHeatmap = js.native
}
