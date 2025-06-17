package documents;

public class PdfDocumentactivate implements PdfDocument {
    private boolean readOnly = false;
    private boolean isOpen = false;

    @Override
    public void open() {
        isOpen = true;
        System.out.println("PDF document opened");
    }

    @Override
    public void save() {
        if (isOpen) {
            System.out.println("PDF document saved");
        }
    }

    @Override
    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("PDF document closed");
        }
    }

    @Override
    public String getDocumentType() {
        return "PDF Document";
    }

    @Override
    public boolean isReadOnly() {
        return readOnly;
    }
    
}
