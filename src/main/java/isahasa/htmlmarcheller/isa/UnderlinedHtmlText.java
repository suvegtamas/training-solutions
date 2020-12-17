package isahasa.htmlmarcheller.isa;

import isahasa.htmlmarcheller.HtmlText;

public class UnderlinedHtmlText extends HtmlText {
    public UnderlinedHtmlText(String plainText) {
        super(plainText);
    }
    @Override
    public String getPlainText() {
        return "<u>" + super.getPlainText() + "</u>";
    }
}
