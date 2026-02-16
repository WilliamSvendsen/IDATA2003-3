package edu.ntnu.idatx2003.wrap;

import edu.ntnu.idatx2003.TextCommand;

public class WrapTextCommand implements TextCommand {
    private final String opening;
    private final String end;

    public WrapTextCommand(String opening, String end) {
        this.opening = opening;
        this.end = end;
    }

    @Override
    public String execute(String text) {
        if (text.isEmpty()) return text;
        return opening + text + end;
    }

    public String getOpening() { return opening; }
    public String getEnd() { return end; }
}