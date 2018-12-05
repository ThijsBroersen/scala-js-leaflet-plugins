package nl.thijsbroersen.leafletjs.L.wfst

import nl.thijsbroersen.leafletjs.L._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait WFS extends FeatureGroup {
  def describeFeatureType(successCallback: js.Function1[_, Unit], errorCallback: js.Function1[_, Unit]): Unit = js.native
  def getFeature(filter: String): Any = js.native
  def loadFeatures(filter: String): Any = js.native
  def getCapabilities(successCallback: js.Function1[_, Unit], errorCallback: js.Function1[_, Unit]): Unit = js.native
  def getBoundingBox(successCallback: js.Function1[_, Unit], errorCallback: js.Function1[_, Unit]): Unit = js.native
  def setOpacity(opacity: Double): Unit = js.native
}

@js.native
@JSGlobal("L.wfs")
object wfs extends js.Any {
  def apply(options: js.Dictionary[Any], readFormat: js.UndefOr[format.Base] = js.undefined): WFS = js.native
}
