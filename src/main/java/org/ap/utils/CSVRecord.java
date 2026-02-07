package org.ap.utils;

public class CSVRecord
{
    private final String[] headers;
    private final String[] fields;
    public CSVRecord(String[] headers, String row)
    {
        this.headers = new String[headers.length];
        for (int i = 0; i < headers.length; i++)
            this.headers[i] = headers[i].trim();
        String[] rawFields = row.split(",");
        this.fields = new String[rawFields.length];
        for (int i = 0; i < rawFields.length; i++)
            this.fields[i] = rawFields[i].trim();
        if ( headers.length != fields.length)
        {
        throw new RuntimeException("Column mismatch: "+this.headers.length+ " but got " + this.fields.length);
        }
    }

    public String get(String headerName)
    {
        int i=0;
        for(;i<headers.length;i++)
        {
            if (headers[i].equalsIgnoreCase(headerName))
                return this.fields[i];
        }
        return "No such header exists";
    }
}
