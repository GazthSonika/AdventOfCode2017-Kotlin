package test.Day2

import Day2.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestDay2{

    // should return 7-1 + 9-3 + 5-1 = 6+6+4 = 16
    val data ="""
		  1	2	3	4	5	6	7
		  3	4	3	4	5	4	9
		  1	2	1	2	3	5	1
	 """.trimIndent()

    val data2 ="""
        5	9	2	8
        9	4	7	3
        3	8	6	5
    """.trimIndent()

    @Test fun `Day 1 parseToArray  ╯°□°）╯`() {
        assertEquals(3, data.parseToArray().flatMap{it}[9])
        assertEquals(2, data.parseToArray().flatMap{it}[15])
    }

    @Test fun `Day 1 Part I  ╯°□°）╯`() {
        assertEquals(16, calculate(data))

    }

    @Test fun `Day 1 Part II  ╯°□°）╯`() {
        assertEquals(9, calculate2(data2))
    }
}