package util

import java.awt.Graphics
import javax.swing.JPanel

/**
 * Wrapper class for the [draw] function block
 *
 * @property draw function block containing the objects to be drawn
 */
class Surface(
    val draw: (Graphics) -> Unit
) : JPanel() {
    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)
        draw(g)
    }
}
