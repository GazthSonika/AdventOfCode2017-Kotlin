package test.Day1

import Day1.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestDay1{

    @Test fun `Day 1 Part I  ╯°□°）╯`() {
        assertEquals(3, calculate("1122"))
        assertEquals(4, calculate("1111"))
        assertEquals(0, calculate("1234"))
        assertEquals(9, calculate("91212129"))
    }

    @Test fun `Day 1 Part II  ╯°□°）╯`() {
        assertEquals(6, calculate2("1212"))
        assertEquals(0, calculate2("1221"))
        assertEquals(4, calculate2("123425"))
        assertEquals(12, calculate2("123123"))
        assertEquals(4, calculate2("12131415"))
    }
}