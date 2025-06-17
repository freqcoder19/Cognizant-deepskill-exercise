package documents;

import java.util.HashMap;
import java.util.Map;

public class ExcelDocumentactivate implements ExcelDocument {
    private Map<String, String[][]> sheets = new HashMap<>();
    private boolean isOpen = false;
    
    public ExcelDocumentactivate() {
        sheets.put("Sheet1", new String[10][10]);
    }

    public void open() {
        isOpen = true;
        System.out.println("Excel document opened");
    }

    public void save() {
        if (isOpen) {
            System.out.println("Excel document saved");
        }
    }

    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Excel document closed");
        }
    }

    public String getDocumentType() {
        return "Excel Document";
    }

    public void addSheet(String sheetName) {
        sheets.put(sheetName, new String[10][10]);
        System.out.println("Sheet added: " + sheetName);
    }

    public void updateCell(int row, int col, String value) {
        String[][] sheet = sheets.get("Sheet1");
        if (row < sheet.length && col < sheet[row].length) {
            sheet[row][col] = value;
            System.out.println("Cell [" + row + "," + col + "] updated with: " + value);
        }
    }

    public String getCellValue(int row, int col) {
        String[][] sheet = sheets.get("Sheet1");
        if (row < sheet.length && col < sheet[row].length) {
            return sheet[row][col];
        }
        return null;
    }
}
