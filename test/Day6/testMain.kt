package test.Day6

import Day6.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class TestDay6{

    @Test fun `Day 6 Parse to list  ╯°□°）╯`() {
        assertEquals(3, "1\t11\t1".parseToList().size)
    }

    @Test fun `Day 6 Part I  ╯°□°）╯`() {
        val (cycles, banks) = calculate("0\t2\t7\t0")
        assertEquals(5, cycles)
        assertEquals("2\t4\t1\t2", banks)
    }

    @Test fun `Day 6 Part II  ╯°□°）╯`() {
        val (cycles, banks)= calculate2("0\t2\t7\t0")
        assertEquals(4, cycles)
        assertEquals("2\t4\t1\t2", banks)
    }


}