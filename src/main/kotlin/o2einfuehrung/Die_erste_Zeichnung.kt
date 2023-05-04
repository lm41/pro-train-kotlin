package o2einfuehrung

import util.KFrame
import util.fillCircle
import util.fillTriangle
import util.line
import java.awt.Color

/**
 * Programmieren Trainieren Seite 15
 * * W.2.4 Die erste Zeichnung
 *
 * */
fun main() {
    KFrame(
        width = 450,
        height = 320,
        title = "Die Erste Zeichnung"
    ) {
        it.color = Color.RED
        it.fillRect(10, 10, 100, 300)
        it.color = Color.GREEN
        it.fillCircle(200, 320/2, 100)
        it.color = Color.BLUE
        it.line(310, 10, 310, 300, thickness = 10)
        it.color = Color.YELLOW
        it.fillTriangle(400, 10, 370, 310, 440, 310)
    }
}
