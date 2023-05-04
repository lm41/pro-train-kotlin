package util

import java.awt.Graphics
import javax.swing.JFrame


/**
 * Creates a new KFrame named [title], with a width of [width] and a height of [height].
 * To draw components the [Surface] is used
 *
 * @param title The title of the KFrame
 * @param height The height of the KFrame
 * @param width The width of the KFrame
 * @param draw ([Graphics]) -> [Unit] function to add the components
 * @see Surface
 */
class KFrame(
    title: String,
    height: Int,
    width: Int,
    draw: (Graphics) -> Unit
) : JFrame() {

    init {
        createUI(title, height+40, width, Surface(draw))
    }

    /**
     * Configures the [KFrame] and [add]s the [surface] to it.
     *
     * @param title The title of the KFrame
     * @param height The height of the KFrame
     * @param width The width of the KFrame
     * @param surface The surface of the KFrame
     *
     * @see Surface
     */
    private fun createUI(title: String, height: Int, width: Int, surface: Surface) {
        setSize(width, height)
        add(surface)
        this.title = title
        defaultCloseOperation = EXIT_ON_CLOSE
        setLocationRelativeTo(null)
        this.isVisible = true
    }


}
