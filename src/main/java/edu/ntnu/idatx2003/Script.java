package edu.ntnu.idatx2003;

import java.util.List;

public class Script {

    private final List<TextCommand> commands;

    public Script(List<TextCommand> commands) {
        this.commands = commands;
    }

    public String execute(String input) {
        String result = input;

        for (TextCommand command : commands) {
            result = command.execute(result);
        }

        return result;
    }
}