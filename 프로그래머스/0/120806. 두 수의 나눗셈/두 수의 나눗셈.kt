class Solution {
    fun solution(num1: Int, num2: Int): Int {
        val answer: Int = (num1.toDouble() / num2 * 1000).toInt()
        return answer
    }
}