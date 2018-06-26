package test.Day3

import Day3.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestDay3{

    @Test fun `Day 3 Part I  ╯°□°）╯`() {
        assertEquals(3, calculate(12))
        assertEquals(2, calculate(23))
        assertEquals(31, calculate(1024))

    }

    @Test fun `Day 3 Part II  ╯°□°）╯`() {
        val grid = Grid()
        assertEquals(25, grid.calculateUntil(24))
        assertEquals(304, grid.calculateUntil(304))
        assertEquals(806, grid.calculateUntil(800))
    }
}