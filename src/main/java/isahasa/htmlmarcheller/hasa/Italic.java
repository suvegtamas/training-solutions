package isahasa.htmlmarcheller.hasa;

import isahasa.htmlmarcheller.TextSource;

public class Italic extends TextDecorator{
    public Italic(TextSource textSource) {
        super.textSource = textSource;
    }

    @Override
    public String getPlainText() {
        return "<i>" + textSource.getPlainText() + "</i>";
    }
}
