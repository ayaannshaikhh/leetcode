class Solution:
    def climbStairs(self, n: int) -> int:
        cache = {}
        def climb(stair):
            if stair <= 2:
                return stair

            if stair in cache:
                return cache[stair]

            answer = climb(stair - 1) + climb(stair - 2)
            cache[stair] = answer
            return answer

        return climb(n)
