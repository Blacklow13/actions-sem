package seminar

class ScoreCalculator {
    fun totalPoints(homeworkPoints: Int, bonusPoints: Int): Int {
        return homeworkPoints + bonusPoints
    }

    fun hasPassed(totalPoints: Int): Boolean {
        return totalPoints >= 60
    }

    fun grade(totalPoints: Int): String {
        return when {
            totalPoints >= 90 -> "5"
            totalPoints >= 75 -> "4"
            totalPoints >= 60 -> "3"
            else -> "2"
        }
    }
}
