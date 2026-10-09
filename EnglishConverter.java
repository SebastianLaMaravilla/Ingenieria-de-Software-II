public class EnglishConverter extends Converter {

    public EnglishConverter(String document) {
        super(document);
    }

    public void makeLine() {
        System.out.println("Line in English");
    }

    public void makeParagraph() {
        System.out.println("Paragraph in English");
    }

    public void makeTable() {
        System.out.println("Table in English");
    }
}