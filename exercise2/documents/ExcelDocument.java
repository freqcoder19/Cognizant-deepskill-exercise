package documents;

public interface ExcelDocument {
    void addSheet(String sheetName);
    void updateCell(int row, int col, String value);
    String getCellValue(int row, int col);
}
