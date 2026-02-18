package edu.ntnu.idatx2003.wrap;

import edu.ntnu.idatx2003.replace.ReplaceFirstTextCommand;

public class WrapSelectionTextCommand extends WrapTextCommand {
    private final String selection;

    public WrapSelectionTextCommand(String opening, String end, String selection) {
        super(opening, end);
        this.selection = selection;
    }

    @Override
    public String execute(String text) {
        if (selection.isEmpty()) return text;
        return new ReplaceFirstTextCommand(
                selection,
                getOpening() + selection + getEnd()
        ).execute(text);
    }

    public String getSelection() { return selection; }
}