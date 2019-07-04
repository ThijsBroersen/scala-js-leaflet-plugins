package nl.thijsbroersen.leafletjs.L.mouseCoordinate

import nl.thijsbroersen.leafletjs.L.Control

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
  * Created by thijs on 11-4-17.
  */
@js.native
@JSGlobal("L.control.mouseCoordinate")
object MouseCoordinate extends js.Any {

  def apply(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): MouseCoordinate = js.native
}

@js.native
trait MouseCoordinate extends Control {}
