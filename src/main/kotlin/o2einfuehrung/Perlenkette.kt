package o2einfuehrung

import util.KFrame
import util.Surface
import util.ellipse


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
            it.ellipse(x = 75, y = 55, width = 100, height = 100)
            it.ellipse(x = 175, y = 55, width = 100, height = 100)
            it.ellipse(x = 275, y = 55, width = 100, height = 100)
            it.ellipse(x = 375, y = 55, width = 100, height = 100)
            it.ellipse(x = 475, y = 55, width = 100, height = 100)
        }
    )
}
