package isahasa.htmlmarcheller.hasa;

import isahasa.htmlmarcheller.TextSource;

public class Bold extends TextDecorator {
    public Bold(TextSource textSource) {
        super.textSource = textSource;
    }

    @Override
    public String getPlainText() {
        return "<b>" + textSource.getPlainText() + "</b>";
    }
}
