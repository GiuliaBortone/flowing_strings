class StringIdentifier {
    fun isFlowing(word: String): Boolean {
        val sortedWord = word.toCharArray().sorted().joinToString("")
        return word == sortedWord
    }

    fun isReceding(word: String): Boolean {
        return isFlowing(word.reversed())
    }

    fun isTurbulent (word: String): Boolean {
        return !isFlowing(word) && !isReceding(word)
    }
}
