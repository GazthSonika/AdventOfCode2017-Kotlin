package Day1


import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestDay1{

    @Test fun `Day 1 ╯°□°）╯`() {
        assertEquals(calculate("1122"), 3)
        assertEquals(calculate("1111"), 4)
        assertEquals(calculate("1234"), 0)
        assertEquals(calculate("91212129"), 9)
    }

}