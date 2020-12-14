package interfacedefaultmethods;

public class ColoredPage {
    private String page;
    private String color;

public ColoredPage(String content, String color) {
       this.page = content;
       this.color = color;
       }
        public ColoredPage(String page) {
       this.page = page;
       this.color = Printable.DEFAULT_COLOR;
  }

    public String getPage() {
      return page;
    }

    public String getColor() {
      return color;
   }
}
