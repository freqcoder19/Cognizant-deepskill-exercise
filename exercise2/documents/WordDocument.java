package documents;

public interface WordDocument extends Document {
    void editContent(String content);
    String getContent();
}
