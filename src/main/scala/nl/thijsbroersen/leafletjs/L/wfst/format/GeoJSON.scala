package nl.thijsbroersen.leafletjs.L.wfst.format

import nl.thijsbroersen.leafletjs.L._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("L.Format.GeoJSON")
class GeoJSON(options: js.Dictionary[Any]) extends Base

object GeoJSON {
  def apply(options: js.Dictionary[Any]): GeoJSON = new GeoJSON(options)
}
