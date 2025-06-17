package documents;

public class WordDocumentactivate implements WordDocument{

 private String content;
    private boolean isOpen = false;

    @Override
    public void open() {
        isOpen = true;
        System.out.println("Word document opened");
    }

    @Override
    public void save() {
        if (isOpen) {
            System.out.println("Word document saved");
        }
    }

    @Override
    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Word document closed");
        }
    }
        @Override
    public String getDocumentType() {
        return "Word Document";
    }

    @Override
    public void editContent(String content) {
        this.content = content;
        System.out.println("Content edited: " + content);
    }

    @Override
    public String getContent() {
        return content;
    }
}