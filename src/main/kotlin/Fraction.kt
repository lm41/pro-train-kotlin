/**
 * Programmieren Trainieren Seite 192
 * W.9.2 Mathematischer Bruch
 *
 * Erweitert um [Fraction.divide]` und weitere helper wie [Fraction.shorten] und [Fraction.gcd]
 * */


fun main() {
    val a = Fraction(numerator = 1, denominator = 2)
    val b = Fraction(numerator = 1, denominator = 4)
    val f = Fraction(numerator = 8, denominator = 4)

    val c = a.add(b)
    val d = a.multiply(b)
    println(c.toString())
    println(d.toString())
    println(f)
    println(b.divide(a))
}


/**
 * Represents a fraction with a numerator and a denominator.
 *
 * @property numerator The numerator of the fraction.
 * @property denominator The denominator of the fraction.
 */
data class Fraction(
    private val numerator: Int,
    private val denominator: Int
) {

    /**
     * Adds [other] to this fraction and returns the result as a new fraction.
     *
     * @param other The fraction to add to this fraction.
     * @return A new fraction that is the sum of this fraction and [other].
     */
    fun add(other: Fraction): Fraction {
        val newNumerator = (this.numerator * other.denominator) + (other.numerator * this.denominator)
        val newDominator = this.denominator * other.denominator
        return this.copy(numerator = newNumerator, denominator = newDominator).shorten()
    }

    /**
     * Multiplies this fraction by [other] and returns the result as a new fraction.
     *
     * @param other The fraction to multiply with this fraction.
     * @return A new fraction that is the product of this fraction and [other].
     */
    fun multiply(other: Fraction): Fraction {
        val newNumerator = this.numerator * other.numerator
        val newDominator = this.denominator * other.denominator
        return this.copy(numerator = newNumerator, denominator = newDominator).shorten()
    }

    /**
     * Divides this fraction by [other] and returns the result as a new fraction.
     *
     * @param other The fraction to divide this fraction by.
     * @return A new fraction that is the quotient of this fraction divided by [other].
     */
    fun divide(other: Fraction) : Fraction {
        return this.multiply(other.copy(numerator = other.denominator, denominator = other.numerator))
    }

    /**
     * Returns a new fraction that is a simplified version of this fraction.
     *
     * @return A new fraction that has the same value as this fraction, but with the numerator and denominator
     * divided by their greatest common divisor.
     */
    private fun shorten(): Fraction {
        val gcd = gcd()
        return this.copy(numerator = this.numerator / gcd, denominator = this.denominator / gcd)
    }

    /**
     * Calculates and returns the greatest common divisor (GCD) of the numerator and denominator of this Fraction.
     * This function uses the Euclidean algorithm to calculate the GCD.
     *
     * @return the GCD of the numerator and denominator of this Fraction.
     */
    private fun gcd(): Int {
        var num1 = this.numerator
        var num2 = this.denominator
        while (num2 != 0) {
            val remainder = num1 % num2
            num1 = num2
            num2 = remainder
        }
        return num1
    }

    /**
     * Returns a string representation of this fraction.
     *
     * If the denominator of the fraction is 1, only the numerator is returned. Otherwise,
     * the string representation of the numerator and denominator is returned.
     *
     * @return A string representation of this fraction.
     */
    override fun toString(): String {
        val gcd = gcd()
        val copy = this.copy(numerator = this.numerator / gcd, denominator = this.denominator / gcd)
        return if (copy.denominator == 1) {
            "${copy.numerator}"
        } else "${copy.numerator}/${copy.denominator}"
    }
}
