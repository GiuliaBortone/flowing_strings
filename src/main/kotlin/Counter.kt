class Counter {
    val latinAlphabetLowerCase = charArrayOf(
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    )
    val identifier = StringIdentifier()

    fun countTurbulentStringsWithLength(length: Int): Int {
        var turbulentCount = 0

        fun generateCombinations(prefix: String, remainingLength: Int) {
            if (remainingLength == 0) {
                turbulentCount += if (identifier.isTurbulent(prefix)) 1 else 0
                return
            }

            for (char in latinAlphabetLowerCase) {
                generateCombinations(prefix + char, remainingLength - 1)
            }
        }

        generateCombinations("", length)
        return turbulentCount
    }


}
