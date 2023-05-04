package util

import java.awt.Graphics

/**
 * Creates an ellipse
 *
 * @param x
 * @param y
 * @param width
 * @param height
 */
fun Graphics.ellipse(
    x: Int,
    y: Int,
    width: Int,
    height: Int
) {
    this.drawOval(
        x - (width/2),
        y - (height/2),
        width,
        height
    )
}

/**
 * Creates a circle with a given [radius]
 *
 * @param x
 * @param y
 * @param radius The radius of the circle
 */
fun Graphics.circle(
    x: Int,
    y: Int,
    radius: Int
) {
    this.drawOval(
        x - (radius/2),
        y - (radius/2),
        radius,
        radius
    )
}
