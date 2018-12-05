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
trait MouseCoordinate extends Control {

}

//trait MouseCoordinateOptions extends js.Object {
//  val gps: Boolean = js.native
//  val gpsLong: Boolean = js.native
//  val utm: Boolean = js.native
//  val utmref: Boolean = js.native
//  val qth: Boolean = js.native
//  val nac: Boolean = js.native
//  val position: String = js.native
//}
//
//object MouseCoordinateOptions {
//  def apply(
//    gps: Boolean = true,
//    gpsLong: Boolean = true,
//    utm: Boolean = false,
//    utmref: Boolean = false,
//    qth: Boolean = false,
//    nac: Boolean = false,
//    position: String = "bottomright"
//  ): MouseCoordinateOptions = {
//    OptionsUtil.merge(
//      Seq(
//        js.Dynamic.literal(
//          gps = gps,
//          gpsLong = gpsLong,
//          utm = utm,
//          utmref = utmref,
//          qth = qth,
//          nac = nac,
//          postition = position
//        )
//      )
//    )
//  }
//}