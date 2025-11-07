class Solution {
    fun solution(n: Int, k: Int): Int {
        var service: Int = n/10;
        var answer: Int =  n*12000 + k*2000 - service*2000;
        return answer
    }
}