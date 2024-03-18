import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StringIdentifierTest {
    private val categoriser = StringIdentifier()

    @Test
    fun `one letter strings are both flowing and receding`() {
        assertThat(categoriser.isFlowing("a")).isTrue()
        assertThat(categoriser.isReceding("a")).isTrue()
    }

    @Test
    fun `two same letters strings are both flowing and receding`() {
        assertThat(categoriser.isFlowing("aa")).isTrue()
        assertThat(categoriser.isReceding("aa")).isTrue()
        assertThat(categoriser.isTurbulent("aa")).isFalse()

    }

    @Test
    fun `two letters string dn is flowing`() {
        assertThat(categoriser.isFlowing("dn")).isTrue()
        assertThat(categoriser.isTurbulent("dn")).isFalse()
    }

    @Test
    fun `two letters string zj is receding`() {
        assertThat(categoriser.isReceding("zj")).isTrue()
        assertThat(categoriser.isTurbulent("zj")).isFalse()
    }

    @Test
    fun `three letters string abz is flowing`() {
        assertThat(categoriser.isFlowing("abz")).isTrue()
    }

    @Test
    fun `three letters string xhc is receding`() {
        assertThat(categoriser.isReceding("xhc")).isTrue()
    }

    @Test
    fun `three letters word ghg is turbulent`() {
        assertThat(categoriser.isTurbulent("ghg")).isTrue()
    }
}