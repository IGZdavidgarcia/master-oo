package com.oo.reporting;

public class ReportFormatter {

    String formattedOutput;

    public ReportFormatter(Object object, FormatType formatType) {

        switch (formatType) {
            case XML:
                formattedOutput = convertObjectToXml( object );
                break;
            case CSV:
                formattedOutput = convertObjectToCsv( object );
                break;
        }

    }

    protected String getFormattedValue() {
        return formattedOutput;
    }

    private String convertObjectToXml(Object object) {

        return "XML: <title>" + object.toString() + "</title>";
    }

    private String convertObjectToCsv(Object object) {
        return "CSV: ,,," + object.toString() + ",,,";
    }

}
