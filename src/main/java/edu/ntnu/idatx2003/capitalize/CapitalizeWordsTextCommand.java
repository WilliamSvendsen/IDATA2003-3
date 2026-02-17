package edu.ntnu.idatx2003.capitalize;

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {

    @Override
    public String execute(String text) {
        if (text.isEmpty()) return text;

        StringBuilder sb = new StringBuilder(text.length());
        boolean atWordStart = true;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isWhitespace(c)) {
                atWordStart = true;
                sb.append(c);
            } else {
                if (atWordStart) {
                    sb.append(Character.toUpperCase(c));
                    atWordStart = false;
                } else {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}