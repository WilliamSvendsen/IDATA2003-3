package edu.ntnu.idatx2003.capitalize;

import edu.ntnu.idatx2003.TextCommand;

public class CapitalizeTextCommand implements TextCommand {

    @Override
    public String execute(String text) {
        if (text.isEmpty()) return text;
        return capitalizeFirstChar(text);
    }

    protected String capitalizeFirstChar(String s) {
        if (s.isEmpty()) return s;
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
}