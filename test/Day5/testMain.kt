package test.Day5

import Day5.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class TestDay5{

    @Test fun `Day 5 Parse to list  ╯°□°）╯`() {
        assertEquals(1, "1".parseToList().size)
        var multiline = """
            -23
            23
            -34
        """.trimIndent()
        assertEquals(3, multiline.parseToList().size)

    }

    @Test fun `Day 5 Part I  ╯°□°）╯`() {
        var testData = """
            0
            3
            0
            1
            -3
        """.trimIndent()
        assertEquals(5, calculate(testData))
    }

    @Test fun `Day 5 Part II  ╯°□°）╯`() {
        var testData = """
            0
            3
            0
            1
            -3
        """.trimIndent()
        assertEquals(10, calculate2(testData))
    }
}