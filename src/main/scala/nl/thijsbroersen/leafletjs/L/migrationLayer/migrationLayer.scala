package nl.thijsbroersen.leafletjs.L.migrationLayer

import nl.thijsbroersen.leafletjs.L._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait Migration extends js.Object {
  def from: js.Array[Double]
  def to: js.Array[Double]
  def labels: js.Array[String]
  def color: String
}

object Migration {
  def apply(from: js.Array[Double], to: js.Array[Double], labels: js.Array[String], color: String): Migration =
    js.Dynamic.literal(from = from, to = to, labels = labels, color = color).asInstanceOf[Migration]
}

@js.native
trait MigrationLayer extends Layer {
  def setData(newData: js.Array[Migration]): Unit = js.native
  def hide: Unit = js.native
  def show: Unit = js.native
  def pause: Unit = js.native
  def play: Unit = js.native
  def destroy: Unit = js.native
}

@js.native
@JSGlobal("L.migrationLayer")
object migrationLayer extends js.Object {
  def apply(options: js.UndefOr[js.Dictionary[Any]] = js.undefined): MigrationLayer = js.native
}
