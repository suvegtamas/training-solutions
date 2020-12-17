package isahasa.htmlmarcheller.hasa;

import isahasa.htmlmarcheller.TextSource;

public class Underlined extends TextDecorator{
    public Underlined(TextSource textSource) {
        super.textSource = textSource;
    }

    @Override
    public String getPlainText() {
        return "<u>" + textSource.getPlainText() + "</u>";
    }
}
