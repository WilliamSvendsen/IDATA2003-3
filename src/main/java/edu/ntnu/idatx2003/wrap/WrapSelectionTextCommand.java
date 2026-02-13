package edu.ntnu.idatx2003.wrap;

public class WrapSelectionTextCommand extends WrapTextCommand {
    private final String selection;

    public WrapSelectionTextCommand(String opening, String end, String selection) {
        super(opening, end);
        this.selection = selection;
    }

    @Override
    public String execute(String text) {
        if (selection.isEmpty()) return text;
        return text.replace(selection, getOpening() + selection + getEnd());
    }

    public String getSelection() { return selection; }
}