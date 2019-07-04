package nl.thijsbroersen.leafletjs.L.webGLHeatmap

import nl.thijsbroersen.leafletjs.L.Renderer

import scala.scalajs.js
import scala.scalajs.js.Array
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait WebGLHeatmap extends Renderer {
  def setData(dataPoints: Array[Array[Double]]): Unit          = js.native
  def data: Array[js.Any]                                      = js.native
  def addDataPoint(lat: Double, lon: Double, value: Int): Unit = js.native
  def clear(): Unit                                            = js.native
  def multiply(n: Double): Unit                                = js.native
  def draw(): Unit                                             = js.native
  def resize(): Unit                                           = js.native
  def reposition(): Unit                                       = js.native
}

@js.native
@JSGlobal("L.webGLHeatmap")
object webGLHeatmap extends js.Any {
  def apply(options: js.Dictionary[Any]): WebGLHeatmap = js.native
}

@js.native
@JSGlobal("L.WebGLHeatmap")
object WebGLHeatmap extends Renderer {}
