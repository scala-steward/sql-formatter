package om.github.takayahilton

import com.github.takayahilton.sqlformatter.SqlFormatter
import org.scalajs.dom._

import scala.scalajs.js.annotation.JSExportTopLevel

object Main {

  def main(args: Array[String]): Unit = {
    formatSqlInput()
  }

  @JSExportTopLevel("formatSqlInput")
  def formatSqlInput(): Unit = {
    val input = document.getElementById("sql-input")
    val formatted = SqlFormatter.format(input.asInstanceOf[html.Input].value)

    document.getElementById("sql-formatted").asInstanceOf[html.Input].value = formatted
  }
}
