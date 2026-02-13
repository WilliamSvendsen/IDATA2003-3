package edu.ntnu.idatx2003.replace;

public class ReplaceFirstTextCommand extends ReplaceTextCommand {

    public ReplaceFirstTextCommand(String target, String replacement) {
        super(target, replacement);
    }

    @Override
    public String execute(String text) {
        String target = getTarget();
        int index = text.indexOf(target);
        if (index < 0) return text;

        return text.substring(0, index)
                + getReplacement()
                + text.substring(index + target.length());
    }
}