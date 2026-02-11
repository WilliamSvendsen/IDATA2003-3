package edu.ntnu.idatx2003;

import java.util.Objects;

public class ReplaceTextCommand implements TextCommand {

    private final String target;
    private final String replacement;

    public ReplaceTextCommand(String target, String replacement) {
        this.target = Objects.requireNonNull(target, "target cannot be null");
        this.replacement = Objects.requireNonNull(replacement, "replacement cannot be null");
    }

    @Override
    public String execute(String text) {
        Objects.requireNonNull(text, "text cannot be null");
        if (target.isEmpty()) return text;     // in case target is == ""
        return text.replace(target, replacement);
    }

    public String getTarget() {
        return target;
    }

    public String getReplacement() {
        return replacement;
    }
}