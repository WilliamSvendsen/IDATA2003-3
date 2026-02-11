package edu.ntnu.idatx2003;

import java.util.Objects;

public class ReplaceFirstTextCommand extends ReplaceTextCommand {

    public ReplaceFirstTextCommand(String target, String replacement) {
        super(target, replacement);
    }

    @Override
    public String execute(String text) {
        Objects.requireNonNull(text, "text cannot be null");

        String target = getTarget();
        if (target.isEmpty()) return text;

        int index = text.indexOf(target);
        if (index < 0) return text;

        return text.substring(0, index)
                + getReplacement()
                + text.substring(index + target.length());
    }
}