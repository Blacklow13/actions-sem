package seminar

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ScoreCalculatorTest {
    private val calculator = ScoreCalculator()

    @Test
    fun `totalPoints adds homework and bonus points`() {
        assertEquals(70, calculator.totalPoints(60, 10))
    }

    @Test
    fun `hasPassed returns true when points are enough`() {
        assertTrue(calculator.hasPassed(60))
    }

    @Test
    fun `hasPassed returns false when points are low`() {
        assertFalse(calculator.hasPassed(59))
    }

    @Test
    fun `grade returns 5 for very high score`() {
        assertEquals("5", calculator.grade(95))
    }

    @Test
    fun `grade returns 4 for good score`() {
        assertEquals("4", calculator.grade(80))
    }

    @Test
    fun `grade returns 3 for passing score`() {
        assertEquals("3", calculator.grade(65))
    }

    @Test
    fun `grade returns 2 for failing score`() {
        assertEquals("2", calculator.grade(20))
    }
}
