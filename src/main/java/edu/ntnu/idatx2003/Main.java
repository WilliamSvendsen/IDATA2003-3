package edu.ntnu.idatx2003;

import edu.ntnu.idatx2003.wrap.WrapTextCommand;
import edu.ntnu.idatx2003.wrap.WrapLinesTextCommand;
import edu.ntnu.idatx2003.wrap.WrapSelectionTextCommand;

public class Main {

    public static void main(String[] args) {

        // WrapTextCommand
        WrapTextCommand wrap = new WrapTextCommand("<p>", "</p>");
        System.out.println("WrapTextCommand:");
        System.out.println(wrap.execute("Hello"));
        System.out.println("Expected: <p>Hello</p>");
        System.out.println();

        // WrapLinesTextCommand
        WrapLinesTextCommand wrapLines = new WrapLinesTextCommand("<p>", "</p>");
        String lines = "Line1\nLine2\nLine3";
        System.out.println("WrapLinesTextCommand:");
        System.out.println(wrapLines.execute(lines));
        System.out.println("Expected:");
        System.out.println("<p>Line1</p>");
        System.out.println("<p>Line2</p>");
        System.out.println("<p>Line3</p>");
        System.out.println();

        // WrapSelectionTextCommand
        WrapSelectionTextCommand wrapSelection =
                new WrapSelectionTextCommand("<b>", "</b>", "cat");

        String text = "cat and dog and cat";
        System.out.println("WrapSelectionTextCommand:");
        System.out.println(wrapSelection.execute(text));
        System.out.println("Expected: <b>cat</b> and dog and <b>cat</b>");
    }
}