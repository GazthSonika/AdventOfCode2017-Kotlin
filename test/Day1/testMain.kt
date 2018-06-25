package Day1


import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestDay1{

    @Test fun `Day 1 Part I  ╯°□°）╯`() {
        assertEquals(calculate("1122"), 3)
        assertEquals(calculate("1111"), 4)
        assertEquals(calculate("1234"), 0)
        assertEquals(calculate("91212129"), 9)
    }

    @Test fun `Day 1 Part II  ╯°□°）╯`() {
        assertEquals(calculate2("1212"), 6)
        assertEquals(calculate2("1221"), 0)
        assertEquals(calculate2("123425"), 4)
        assertEquals(calculate2("123123"), 12)
        assertEquals(calculate2("12131415"), 4)
    }
}