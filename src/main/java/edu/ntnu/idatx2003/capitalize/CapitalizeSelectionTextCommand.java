package edu.ntnu.idatx2003.capitalize;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {

    private final String selection;

    public CapitalizeSelectionTextCommand(String selection) {
        this.selection = selection;
    }

    @Override
    public String execute(String text) {
        if (text.isEmpty()) return text;
        if (selection.isEmpty()) return text;

        String replacement = capitalizeFirstChar(selection);
        return text.replace(selection, replacement);
    }

    public String getSelection() {
        return selection;
    }
}