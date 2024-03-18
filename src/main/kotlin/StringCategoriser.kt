class StringCategoriser {
    fun categorise(word: String): String {
        var category = ""

        if (isFlowing(word)) {
            category += "flowing "
        }

        if (isReceding(word)) {
            category += "receding"
        }

        if (category.isBlank()) {
            category = "turbulent"
        }

        return category.trimEnd()
    }

    private fun isFlowing(word: String): Boolean {
        val sortedWord = word.toCharArray().sorted().joinToString("")
        return word == sortedWord
    }

    private fun isReceding(word: String): Boolean {
        return isFlowing(word.reversed())
    }
}
