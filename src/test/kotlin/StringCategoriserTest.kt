import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StringCategoriserTest {
    private val categoriser = StringCategoriser()

    @Test
    fun `one letter strings are both flowing and receding`() {
        assertThat(categoriser.categorise("a")).isEqualTo("flowing receding")
    }

    @Test
    fun `two same letters strings are both flowing and receding`() {
        assertThat(categoriser.categorise("aa")).isEqualTo("flowing receding")
    }

    @Test
    fun `two letters string dn is flowing`() {
        assertThat(categoriser.categorise("dn")).isEqualTo("flowing")
    }

    @Test
    fun `two letters string zj is receding`() {
        assertThat(categoriser.categorise("zj")).isEqualTo("receding")
    }

    @Test
    fun `three letters string abz is flowing`() {
        assertThat(categoriser.categorise("abz")).isEqualTo("flowing")
    }

    @Test
    fun `three letters string xhc is receding`() {
        assertThat(categoriser.categorise("xhc")).isEqualTo("receding")
    }
}