package test.Day4

import Day4.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class TestDay4{

    @Test fun `Day 4 Parse to list  ╯°□°）╯`() {
        assertEquals(1, "as bb cc".parseToList().size)
        var multiline = """
            aa bb jijl lkjio
            lk ji lai
            as
        """.trimIndent()
        assertEquals(3, multiline.parseToList().size)

    }

    @Test fun `Day 4 Part I  ╯°□°）╯`() {
        var testData = """
            aa bb cc dd ee
            aa bb cc dd aa
            aa bb cc dd aaa
        """.trimIndent()
        assertEquals(2, calculate(testData))
    }

    @Test fun `Day 4 Part II  ╯°□°）╯`() {
        var testData = """
            abcde fghij
            abcde xyz ecdab
            a ab abc abd abf abj
            iiii oiii ooii oooi oooo
            oiii ioii iioi iiio
        """.trimIndent()
        assertEquals(3, calculate2(testData))
    }
}