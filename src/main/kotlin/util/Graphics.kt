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
fun Graphics.drawEllipse(
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

fun Graphics.fillEllipse(
    x: Int,
    y: Int,
    width: Int,
    height: Int
) {
    this.fillOval(
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
fun Graphics.fillCircle(
    x: Int,
    y: Int,
    radius: Int
) {
    this.fillOval(
        x - (radius/2),
        y - (radius/2),
        radius,
        radius
    )
}



fun Graphics.drawCircle(
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

fun Graphics.line(
    startX: Int,
    startY: Int,
    endX: Int,
    endY: Int,
    thickness: Int = 0
) {
    if (thickness == 0) {
        this.drawLine(startX, startY, endX, endY)
    } else {
        this.fillRect(startX-(thickness/2), startY, thickness, endY-startY)
    }

}

fun Graphics.drawTriangle(
    aX: Int,
    aY: Int,
    bX: Int,
    bY: Int,
    cX: Int,
    cY: Int
) {
    this.drawPolygon(intArrayOf(aX, bX, cX), intArrayOf(aY, bY, cY), 3)
}


fun Graphics.fillTriangle(
    aX: Int,
    aY: Int,
    bX: Int,
    bY: Int,
    cX: Int,
    cY: Int
) {
    this.fillPolygon(intArrayOf(aX, bX, cX), intArrayOf(aY, bY, cY), 3)
}
