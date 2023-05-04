package o2einfuehrung

import util.KFrame
import util.drawEllipse


/**
 * Programmieren Trainieren Seite 14
 * * W.2.3 Perlenkette
 *
 * */
fun main() {
    KFrame(
        title = "Perlenkette",
        width = 550,
        height = 150,
        draw = {
            it.drawEllipse(x = 75, y = 70, width = 100, height = 100)
            it.drawEllipse(x = 175, y = 70, width = 100, height = 100)
            it.drawEllipse(x = 275, y = 70, width = 100, height = 100)
            it.drawEllipse(x = 375, y = 70, width = 100, height = 100)
            it.drawEllipse(x = 475, y = 70, width = 100, height = 100)
        }
    )
}
