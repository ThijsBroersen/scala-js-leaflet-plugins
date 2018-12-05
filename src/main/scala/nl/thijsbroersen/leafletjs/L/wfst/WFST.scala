package nl.thijsbroersen.leafletjs.L.wfst

import nl.thijsbroersen.leafletjs.L._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait WFST extends WFS {

}

@js.native
@JSGlobal("L.wfst")
object wfst extends js.Any {
  def apply(options: js.Dictionary[Any], readFormat: format.Base): WFST = js.native
}
