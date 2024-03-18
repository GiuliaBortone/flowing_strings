import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CounterTest {
    private val counter = Counter()

    @Test
    fun `there are 0 one letter turbulent strings`() {
        assertThat(counter.countTurbulentStringsWithLength(1)).isEqualTo(0)
    }

    @Test
    fun `there are 0 two letters turbulent strings`() {
        assertThat(counter.countTurbulentStringsWithLength(2)).isEqualTo(0)
    }

    @Test
    fun `there are 11050 three letters turbulent strings`() {
        assertThat(counter.countTurbulentStringsWithLength(3)).isEqualTo(11050)
    }

    @Test
    fun `there are 409500 four letters turbulent strings`() {
        assertThat(counter.countTurbulentStringsWithLength(4)).isEqualTo(409500)
    }

    @Test
    fun `there are 11596390 five letters turbulent strings`() {
        assertThat(counter.countTurbulentStringsWithLength(5)).isEqualTo(11596390)
    }
}