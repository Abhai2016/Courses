package com.abhai.empoyee;

public class ReportFormatter {
    String formattedOutput;

    public ReportFormatter(Object object, FormatType formatType) {
        switch (formatType) {
            case XML:
                formattedOutput = convertToXML(object);
                break;
            case CSV:
                formattedOutput = convertToCSV(object);
                break;
        }
    }

    public String convertToXML(Object object) {
        return "converted to XML" + object.toString();
    }

    public String convertToCSV(Object object) {
        return "converted to CSV" + object.toString();
    }
}
