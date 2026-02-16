package edu.ntnu.idatx2003.wrap;

public class WrapLinesTextCommand extends WrapTextCommand {

    public WrapLinesTextCommand(String opening, String end) {
        super(opening, end);
    }

    @Override
    public String execute(String text) {
        String[] lines = text.split("\\R");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < lines.length; i++) {
            if (i > 0) sb.append("\n");
            sb.append(getOpening()).append(lines[i]).append(getEnd());
        }
        return sb.toString();
    }
}