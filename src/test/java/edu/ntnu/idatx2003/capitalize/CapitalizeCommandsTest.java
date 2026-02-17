package edu.ntnu.idatx2003.capitalize;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CapitalizeCommandsTest {

    @Test
    void testCapitalizeTextCommand() {
        CapitalizeTextCommand cmd = new CapitalizeTextCommand();

        assertEquals("Hello world", cmd.execute("hello world"));
        assertEquals("", cmd.execute(""));
        assertEquals("A", cmd.execute("a"));
    }

    @Test
    void testCapitalizeWordsTextCommand() {
        CapitalizeWordsTextCommand cmd = new CapitalizeWordsTextCommand();

        assertEquals("Hello World", cmd.execute("hello world"));
        assertEquals("Multiple   Spaces Here", cmd.execute("multiple   spaces here"));
        assertEquals("", cmd.execute(""));
    }

    @Test
    void testCapitalizeSelectionTextCommand() {
        CapitalizeSelectionTextCommand cmd =
                new CapitalizeSelectionTextCommand("selection");

        assertEquals(
                "text with Selection and another Selection",
                cmd.execute("text with selection and another selection")
        );

        assertEquals("no match here",
                cmd.execute("no match here"));

        assertEquals("",
                cmd.execute(""));
    }
}